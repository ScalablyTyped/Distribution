package typings.pkijs.mod

import typings.pkijs.anon.Status
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TimeStampResp structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  *
  * @example The following example demonstrates how to create and sign Time-Stamp Response
  * ```js
  * // Generate random serial number
  * const serialNumber = pkijs.getRandomValues(new Uint8Array(10)).buffer;
  *
  * // Create specific TST info structure to sign
  * const tstInfo = new pkijs.TSTInfo({
  *   version: 1,
  *   policy: tspReq.reqPolicy,
  *   messageImprint: tspReq.messageImprint,
  *   serialNumber: new asn1js.Integer({ valueHex: serialNumber }),
  *   genTime: new Date(),
  *   ordering: true,
  *   accuracy: new pkijs.Accuracy({
  *     seconds: 1,
  *     millis: 1,
  *     micros: 10
  *   }),
  *   nonce: tspReq.nonce,
  * });
  *
  * // Create and sign CMS Signed Data with TSTInfo
  * const cmsSigned = new pkijs.SignedData({
  *   version: 3,
  *   encapContentInfo: new pkijs.EncapsulatedContentInfo({
  *     eContentType: "1.2.840.113549.1.9.16.1.4", // "tSTInfo" content type
  *     eContent: new asn1js.OctetString({ valueHex: tstInfo.toSchema().toBER() }),
  *   }),
  *   signerInfos: [
  *     new pkijs.SignerInfo({
  *       version: 1,
  *       sid: new pkijs.IssuerAndSerialNumber({
  *         issuer: cert.issuer,
  *         serialNumber: cert.serialNumber
  *       })
  *     })
  *   ],
  *   certificates: [cert]
  * });
  *
  * await cmsSigned.sign(keys.privateKey, 0, "SHA-256");
  *
  * // Create CMS Content Info
  * const cmsContent = new pkijs.ContentInfo({
  *   contentType: pkijs.ContentInfo.SIGNED_DATA,
  *   content: cmsSigned.toSchema(true)
  * });
  *
  * // Finally create completed TSP response structure
  * const tspResp = new pkijs.TimeStampResp({
  *   status: new pkijs.PKIStatusInfo({ status: pkijs.PKIStatus.granted }),
  *   timeStampToken: new pkijs.ContentInfo({ schema: cmsContent.toSchema() })
  * });
  *
  * const tspRespRaw = tspResp.toSchema().toBER();
  * ```
  */
@JSImport("pkijs", "TimeStampResp")
@js.native
/**
  * Initializes a new instance of the {@link TimeStampResp} class
  * @param parameters Initialization parameters
  */
open class TimeStampResp ()
  extends PkiObject
     with ITimeStampResp {
  def this(parameters: TimeStampRespParameters) = this()
  
  /* private */ var assertContentType: Any = js.native
  
  /**
    * Sign current TSP Response
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Time-Stamp status
    */
  /* CompleteClass */
  var status: PKIStatusInfo = js.native
  
  /**
    * Verify current TSP Response
    * @param verificationParameters Input parameters for verification
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(verificationParameters: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(verificationParameters: TimeStampRespVerifyParams): js.Promise[Boolean] = js.native
  def verify(verificationParameters: TimeStampRespVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
object TimeStampResp {
  
  @JSImport("pkijs", "TimeStampResp")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "TimeStampResp.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "timeStampToken" */ String): ContentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ContentInfo]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_PKIStatusInfo(memberName: /* "status" */ String): PKIStatusInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[PKIStatusInfo]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * TimeStampResp ::= SEQUENCE  {
    *    status                  PKIStatusInfo,
    *    timeStampToken          TimeStampToken     OPTIONAL  }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[Status]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
