package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import typings.asn1js.mod.Sequence
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an X.509 certificate described in [RFC5280 Section 4](https://datatracker.ietf.org/doc/html/rfc5280#section-4).
  *
  * @example The following example demonstrates how to parse X.509 Certificate
  * ```js
  * const asn1 = asn1js.fromBER(raw);
  * if (asn1.offset === -1) {
  *   throw new Error("Incorrect encoded ASN.1 data");
  * }
  *
  * const cert = new pkijs.Certificate({ schema: asn1.result });
  * ```
  *
  * @example The following example demonstrates how to create self-signed certificate
  * ```js
  * const crypto = pkijs.getCrypto(true);
  *
  * // Create certificate
  * const certificate = new pkijs.Certificate();
  * certificate.version = 2;
  * certificate.serialNumber = new asn1js.Integer({ value: 1 });
  * certificate.issuer.typesAndValues.push(new pkijs.AttributeTypeAndValue({
  *   type: "2.5.4.3", // Common name
  *   value: new asn1js.BmpString({ value: "Test" })
  * }));
  * certificate.subject.typesAndValues.push(new pkijs.AttributeTypeAndValue({
  *   type: "2.5.4.3", // Common name
  *   value: new asn1js.BmpString({ value: "Test" })
  * }));
  *
  * certificate.notBefore.value = new Date();
  * const notAfter = new Date();
  * notAfter.setUTCFullYear(notAfter.getUTCFullYear() + 1);
  * certificate.notAfter.value = notAfter;
  *
  * certificate.extensions = []; // Extensions are not a part of certificate by default, it's an optional array
  *
  * // "BasicConstraints" extension
  * const basicConstr = new pkijs.BasicConstraints({
  *   cA: true,
  *   pathLenConstraint: 3
  * });
  * certificate.extensions.push(new pkijs.Extension({
  *   extnID: "2.5.29.19",
  *   critical: false,
  *   extnValue: basicConstr.toSchema().toBER(false),
  *   parsedValue: basicConstr // Parsed value for well-known extensions
  * }));
  *
  * // "KeyUsage" extension
  * const bitArray = new ArrayBuffer(1);
  * const bitView = new Uint8Array(bitArray);
  * bitView[0] |= 0x02; // Key usage "cRLSign" flag
  * bitView[0] |= 0x04; // Key usage "keyCertSign" flag
  * const keyUsage = new asn1js.BitString({ valueHex: bitArray });
  * certificate.extensions.push(new pkijs.Extension({
  *   extnID: "2.5.29.15",
  *   critical: false,
  *   extnValue: keyUsage.toBER(false),
  *   parsedValue: keyUsage // Parsed value for well-known extensions
  * }));
  *
  * const algorithm = pkijs.getAlgorithmParameters("RSASSA-PKCS1-v1_5", "generateKey");
  * if ("hash" in algorithm.algorithm) {
  *   algorithm.algorithm.hash.name = "SHA-256";
  * }
  *
  * const keys = await crypto.generateKey(algorithm.algorithm, true, algorithm.usages);
  *
  * // Exporting public key into "subjectPublicKeyInfo" value of certificate
  * await certificate.subjectPublicKeyInfo.importKey(keys.publicKey);
  *
  * // Signing final certificate
  * await certificate.sign(keys.privateKey, "SHA-256");
  *
  * const raw = certificate.toSchema().toBER();
  * ```
  */
@JSImport("pkijs", "Certificate")
@js.native
/**
  * Initializes a new instance of the {@link Certificate} class
  * @param parameters Initialization parameters
  */
open class Certificate ()
  extends PkiObject
     with ICertificate
     with CertificateSetItem {
  def this(parameters: CertificateParameters) = this()
  
  /**
    * Creates ASN.1 schema for existing values of TBS part for the certificate
    * @returns ASN.1 SEQUENCE
    */
  def encodeTBS(): Sequence = js.native
  
  /**
    * Get hash value for subject public key (default SHA-1)
    * @param hashAlgorithm Hashing algorithm name
    * @param crypto Crypto engine
    * @returns Computed hash value from `Certificate.tbsCertificate.subjectPublicKeyInfo.subjectPublicKey`
    */
  def getKeyHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Importing public key for current certificate
    * @param parameters Public key export parameters
    * @param crypto Crypto engine
    * @returns WebCrypto public key
    */
  def getPublicKey(): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: Unit, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  
  /**
    * The issuer field identifies the entity that has signed and issued the certificate
    */
  /* CompleteClass */
  var issuer: RelativeDistinguishedNames = js.native
  
  /**
    * The date on which the certificate validity period ends
    */
  /* CompleteClass */
  var notAfter: Time = js.native
  
  /**
    * The date on which the certificate validity period begins
    */
  /* CompleteClass */
  var notBefore: Time = js.native
  
  /**
    * Serial number of the certificate
    */
  /* CompleteClass */
  var serialNumber: Integer = js.native
  
  /**
    * Make a signature for current value from TBS section
    * @param privateKey Private key for SUBJECT_PUBLIC_KEY_INFO structure
    * @param hashAlgorithm Hashing algorithm
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * This field contains the algorithm identifier for the algorithm used by the CA to sign the certificate
    */
  /* CompleteClass */
  var signature: AlgorithmIdentifier = js.native
  
  /**
    * The signatureAlgorithm field contains the identifier for the cryptographic algorithm used by the CA to sign this certificate
    */
  /* CompleteClass */
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  
  /**
    * The signatureValue field contains a digital signature computed upon the ASN.1 DER encoded tbsCertificate
    */
  /* CompleteClass */
  var signatureValue: BitString = js.native
  
  /**
    * The subject field identifies the entity associated with the public key stored in the subject public key field
    */
  /* CompleteClass */
  var subject: RelativeDistinguishedNames = js.native
  
  /**
    * This field is used to carry the public key and identify the algorithm with which the key is used
    */
  /* CompleteClass */
  var subjectPublicKeyInfo: PublicKeyInfo = js.native
  
  /**
    * ToBeSigned (TBS) part of the certificate
    */
  /* CompleteClass */
  var tbs: js.typedarray.ArrayBuffer = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MCertificate: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Verifies the certificate signature
    * @param issuerCertificate
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /**
    * Version number
    */
  /* CompleteClass */
  var version: Double = js.native
}
object Certificate {
  
  @JSImport("pkijs", "Certificate")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "Certificate.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def defaultValues(memberName: /* "serialNumber" */ String): Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  /* static member */
  inline def defaultValues_AlgorithmIdentifier(memberName: /* "signature" */ String): AlgorithmIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[AlgorithmIdentifier]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "extensions" */ String): js.Array[Extension] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extension]]
  
  /**
    * Return default values for all class members
    * @param memberName String name for a class member
    * @returns Predefined default value
    */
  /* static member */
  inline def defaultValues_ArrayBuffer(memberName: /* "tbs" */ String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /* static member */
  inline def defaultValues_BitString(memberName: /* "signatureValue" */ String): BitString = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[BitString]
  
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_PublicKeyInfo(memberName: /* "subjectPublicKeyInfo" */ String): PublicKeyInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[PublicKeyInfo]
  
  /* static member */
  inline def defaultValues_RelativeDistinguishedNames(memberName: /* "issuer" */ String): RelativeDistinguishedNames = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[RelativeDistinguishedNames]
  
  /* static member */
  inline def defaultValues_Time(memberName: /* "notBefore" */ String): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * Certificate ::= SEQUENCE  {
    *    tbsCertificate       TBSCertificate,
    *    signatureAlgorithm   AlgorithmIdentifier,
    *    signatureValue       BIT STRING  }
    *
    * TBSCertificate ::= SEQUENCE  {
    *     version         [0]  EXPLICIT Version DEFAULT v1,
    *     serialNumber         CertificateSerialNumber,
    *     signature            AlgorithmIdentifier,
    *     issuer               Name,
    *     validity             Validity,
    *     subject              Name,
    *     subjectPublicKeyInfo SubjectPublicKeyInfo,
    *     issuerUniqueID  [1]  IMPLICIT UniqueIdentifier OPTIONAL,
    *                           -- If present, version MUST be v2 or v3
    *     subjectUniqueID [2]  IMPLICIT UniqueIdentifier OPTIONAL,
    *                           -- If present, version MUST be v2 or v3
    *     extensions      [3]  EXPLICIT Extensions OPTIONAL
    *                           -- If present, version MUST be v3
    *     }
    *
    * Version ::= INTEGER  {  v1(0), v2(1), v3(2)  }
    *
    * CertificateSerialNumber ::= INTEGER
    *
    * Validity ::= SEQUENCE {
    *     notBefore      Time,
    *     notAfter       Time }
    *
    * Time ::= CHOICE {
    *     utcTime        UTCTime,
    *     generalTime    GeneralizedTime }
    *
    * UniqueIdentifier ::= BIT STRING
    *
    * SubjectPublicKeyInfo ::= SEQUENCE  {
    *     algorithm            AlgorithmIdentifier,
    *     subjectPublicKey     BIT STRING  }
    *
    * Extensions ::= SEQUENCE SIZE (1..MAX) OF Extension
    *
    * Extension ::= SEQUENCE  {
    *     extnID      OBJECT IDENTIFIER,
    *     critical    BOOLEAN DEFAULT FALSE,
    *     extnValue   OCTET STRING
    *                 -- contains the DER encoding of an ASN.1 value
    *                 -- corresponding to the extension type identified
    *                 -- by extnID
    *     }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: CertificateSchema): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
