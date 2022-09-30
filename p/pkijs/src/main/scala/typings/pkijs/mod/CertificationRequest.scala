package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Sequence
import typings.pkijs.anon.CertificationRequestInfo
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertificationRequest structure described in [RFC2986](https://datatracker.ietf.org/doc/html/rfc2986)
  *
  * @example The following example demonstrates how to parse PKCS#11 certification request
  * and verify its challenge password extension and signature value
  * ```js
  * const pkcs10 = pkijs.CertificationRequest.fromBER(pkcs10Raw);
  *
  * // Get and validate challenge password extension
  * if (pkcs10.attributes) {
  *   const attrExtensions = pkcs10.attributes.find(o => o.type === "1.2.840.113549.1.9.14"); // pkcs-9-at-extensionRequest
  *   if (attrExtensions) {
  *     const extensions = new pkijs.Extensions({ schema: attrExtensions.values[0] });
  *     for (const extension of extensions.extensions) {
  *       if (extension.extnID === "1.2.840.113549.1.9.7") { // pkcs-9-at-challengePassword
  *         const asn = asn1js.fromBER(extension.extnValue.valueBlock.valueHex);
  *         if (asn.result.valueBlock.value !== "passwordChallenge") {
  *           throw new Error("PKCS#11 certification request is invalid. Challenge password is incorrect");
  *         }
  *       }
  *     }
  *   }
  * }
  *
  * // Verify signature value
  * const ok = await pkcs10.verify();
  * if (!ok) {
  *   throw Error("PKCS#11 certification request is invalid. Signature is wrong")
  * }
  * ```
  *
  * @example The following example demonstrates how to create PKCS#11 certification request
  * ```js
  * // Get a "crypto" extension
  * const crypto = pkijs.getCrypto(true);
  *
  * const pkcs10 = new pkijs.CertificationRequest();
  *
  * pkcs10.subject.typesAndValues.push(new pkijs.AttributeTypeAndValue({
  *   type: "2.5.4.3",
  *   value: new asn1js.Utf8String({ value: "Test" })
  * }));
  *
  *
  * await pkcs10.subjectPublicKeyInfo.importKey(keys.publicKey);
  *
  * pkcs10.attributes = [];
  *
  * // Subject Alternative Name
  * const altNames = new pkijs.GeneralNames({
  *   names: [
  *     new pkijs.GeneralName({ // email
  *       type: 1,
  *       value: "email@address.com"
  *     }),
  *     new pkijs.GeneralName({ // domain
  *       type: 2,
  *       value: "www.domain.com"
  *     }),
  *   ]
  * });
  *
  * // SubjectKeyIdentifier
  * const subjectKeyIdentifier = await crypto.digest({ name: "SHA-1" }, pkcs10.subjectPublicKeyInfo.subjectPublicKey.valueBlock.valueHex);
  *
  * pkcs10.attributes.push(new pkijs.Attribute({
  *   type: "1.2.840.113549.1.9.14", // pkcs-9-at-extensionRequest
  *   values: [(new pkijs.Extensions({
  *     extensions: [
  *       new pkijs.Extension({
  *         extnID: "2.5.29.14", // id-ce-subjectKeyIdentifier
  *         critical: false,
  *         extnValue: (new asn1js.OctetString({ valueHex: subjectKeyIdentifier })).toBER(false)
  *       }),
  *       new pkijs.Extension({
  *         extnID: "2.5.29.17", // id-ce-subjectAltName
  *         critical: false,
  *         extnValue: altNames.toSchema().toBER(false)
  *       }),
  *       new pkijs.Extension({
  *         extnID: "1.2.840.113549.1.9.7", // pkcs-9-at-challengePassword
  *         critical: false,
  *         extnValue: (new asn1js.PrintableString({ value: "passwordChallenge" })).toBER(false)
  *       })
  *     ]
  *   })).toSchema()]
  * }));
  *
  * // Signing final PKCS#10 request
  * await pkcs10.sign(keys.privateKey, "SHA-256");
  *
  * const pkcs10Raw = pkcs10.toSchema(true).toBER();
  * ```
  */
@JSImport("pkijs", "CertificationRequest")
@js.native
/**
  * Initializes a new instance of the {@link CertificationRequest} class
  * @param parameters Initialization parameters
  */
open class CertificationRequest ()
  extends PkiObject
     with ICertificationRequest {
  def this(parameters: CertificationRequestParameters) = this()
  
  /**
    * Aux function making ASN1js Sequence from current TBS
    * @returns
    */
  /* protected */ def encodeTBS(): Sequence = js.native
  
  /**
    * Importing public key for current certificate request
    * @param parameters
    * @param crypto Crypto engine
    * @returns WebCrypt public key
    */
  def getPublicKey(): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: Unit, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  
  /**
    * Makes signature for current certification request
    * @param privateKey WebCrypto private key
    * @param hashAlgorithm String representing current hashing algorithm
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * signature algorithm (and any associated parameters) under which the certification-request information is signed
    */
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * result of signing the certification request information with the certification request subject's private key
    */
  /* CompleteClass */
  var signatureValue: BitString = js.native
  
  /**
    * Distinguished name of the certificate subject
    */
  /* CompleteClass */
  var subject: RelativeDistinguishedNames = js.native
  
  /**
    * Information about the public key being certified
    */
  /* CompleteClass */
  var subjectPublicKeyInfo: PublicKeyInfo = js.native
  
  /**
    * Value being signed
    */
  /* CompleteClass */
  var tbs: js.typedarray.ArrayBuffer = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MCertificationRequest: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Verify existing certification request signature
    * @param crypto Crypto engine
    * @returns Returns `true` if signature value is valid, otherwise `false`
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /**
    * Version number. It should be 0
    */
  /* CompleteClass */
  var version: Double = js.native
}
object CertificationRequest {
  
  @JSImport("pkijs", "CertificationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "CertificationRequest.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signatureAlgorithm" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "attributes" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "tbs" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_BitString(memberName: /* "signatureValue" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_PublicKeyInfo(memberName: /* "subjectPublicKeyInfo" */ String): PublicKeyInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[PublicKeyInfo]
  
  /* static member */
  inline def defaultValues_RelativeDistinguishedNames(memberName: /* "subject" */ String): RelativeDistinguishedNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RelativeDistinguishedNames]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * CertificationRequest ::= SEQUENCE {
    *    certificationRequestInfo CertificationRequestInfo,
    *    signatureAlgorithm       AlgorithmIdentifier{{ SignatureAlgorithms }},
    *    signature                BIT STRING
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[CertificationRequestInfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
