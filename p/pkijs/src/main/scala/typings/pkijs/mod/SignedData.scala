package typings.pkijs.mod

import typings.pkijs.anon.DigestAlgorithms
import typings.pkijs.anon.SignedDataVerifyParamsext
import typings.pkijs.anon.SignedDataVerifyParamsextCheckChain
import typings.std.BufferSource
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SignedData structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  *
  * @example The following example demonstrates how to create and sign CMS Signed Data
  * ```js
  * // Create a new CMS Signed Data
  * const cmsSigned = new pkijs.SignedData({
  *   encapContentInfo: new pkijs.EncapsulatedContentInfo({
  *     eContentType: pkijs.ContentInfo.DATA,, // "data" content type
  *     eContent: new asn1js.OctetString({ valueHex: buffer })
  *   }),
  *   signerInfos: [
  *     new pkijs.SignerInfo({
  *       sid: new pkijs.IssuerAndSerialNumber({
  *         issuer: cert.issuer,
  *         serialNumber: cert.serialNumber
  *       })
  *     })
  *   ],
  *   // Signer certificate for chain validation
  *   certificates: [cert]
  * });
  *
  * await cmsSigned.sign(keys.privateKey, 0, "SHA-256");
  *
  * // Add Signed Data to Content Info
  * const cms = new pkijs.ContentInfo({
  *   contentType: pkijs.ContentInfo.SIGNED_DATA,,
  *   content: cmsSigned.toSchema(true),
  * });
  *
  * // Encode CMS to ASN.1
  * const cmsRaw = cms.toSchema().toBER();
  * ```
  *
  * @example The following example demonstrates how to verify CMS Signed Data
  * ```js
  * // Parse CMS and detect it's Signed Data
  * const cms = pkijs.ContentInfo.fromBER(cmsRaw);
  * if (cms.contentType !== pkijs.ContentInfo.SIGNED_DATA) {
  *   throw new Error("CMS is not Signed Data");
  * }
  *
  * // Read Signed Data
  * const signedData = new pkijs.SignedData({ schema: cms.content });
  *
  * // Verify Signed Data signature
  * const ok = await signedData.verify({
  *   signer: 0,
  *   checkChain: true,
  *   trustedCerts: [trustedCert],
  * });
  *
  * if (!ok) {
  *   throw new Error("CMS signature is invalid")
  * }
  * ```
  */
@JSImport("pkijs", "SignedData")
@js.native
/**
  * Initializes a new instance of the {@link SignedData} class
  * @param parameters Initialization parameters
  */
open class SignedData ()
  extends PkiObject
     with ISignedData {
  def this(parameters: SignedDataParameters) = this()
  
  /* CompleteClass */
  var digestAlgorithms: js.Array[AlgorithmIdentifier] = js.native
  
  /* CompleteClass */
  var encapContentInfo: EncapsulatedContentInfo = js.native
  
  /**
    * Signing current SignedData
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param signerIndex Index number (starting from 0) of signer index to make signature for
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param data Detached data
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey, signerIndex: Double): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: String,
    data: Unit,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String, data: BufferSource): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: String,
    data: BufferSource,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: Unit, data: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: Unit, data: BufferSource): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: Unit,
    data: BufferSource,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var signerInfos: js.Array[SignerInfo] = js.native
  
  def verify(): js.Promise[Boolean] = js.native
  def verify(params: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(params: SignedDataVerifyParamsext): js.Promise[Boolean] = js.native
  def verify(params: SignedDataVerifyParamsextCheckChain): js.Promise[SignedDataVerifyResult] = js.native
  def verify(params: SignedDataVerifyParamsextCheckChain, crypto: ICryptoEngine): js.Promise[SignedDataVerifyResult] = js.native
  def verify(params: SignedDataVerifyParamsext, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
object SignedData {
  
  @JSImport("pkijs", "SignedData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "SignedData.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* was `typeof id_ContentType_Data` */
  @JSImport("pkijs", "SignedData.ID_DATA")
  @js.native
  val ID_DATA: /* "1.2.840.113549.1.7.1" */ String = js.native
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_Array(
    memberName: /* "digestAlgorithms" */ /* "certificates" */ /* "crls" */ /* "ocsps" */ /* "signerInfos" */ String
  ): js.Array[AlgorithmIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[AlgorithmIdentifier]]
  
  /* static member */
  inline def defaultValues_EncapsulatedContentInfo(memberName: /* "encapContentInfo" */ String): EncapsulatedContentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[EncapsulatedContentInfo]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * SignedData ::= SEQUENCE {
    *    version CMSVersion,
    *    digestAlgorithms DigestAlgorithmIdentifiers,
    *    encapContentInfo EncapsulatedContentInfo,
    *    certificates [0] IMPLICIT CertificateSet OPTIONAL,
    *    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
    *    signerInfos SignerInfos }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[DigestAlgorithms]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
