package typings.pkijs.mod

import typings.pkijs.anon.OptionalSignature
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an OCSP request described in [RFC6960 Section 4.1](https://datatracker.ietf.org/doc/html/rfc6960#section-4.1)
  *
  * @example The following example demonstrates how to create OCSP request
  * ```js
  * // Create OCSP request
  * const ocspReq = new pkijs.OCSPRequest();
  *
  * ocspReq.tbsRequest.requestorName = new pkijs.GeneralName({
  *   type: 4,
  *   value: cert.subject,
  * });
  *
  * await ocspReq.createForCertificate(cert, {
  *   hashAlgorithm: "SHA-256",
  *   issuerCertificate: issuerCert,
  * });
  *
  * const nonce = pkijs.getRandomValues(new Uint8Array(10));
  * ocspReq.tbsRequest.requestExtensions = [
  *   new pkijs.Extension({
  *     extnID: "1.3.6.1.5.5.7.48.1.2", // nonce
  *     extnValue: new asn1js.OctetString({ valueHex: nonce.buffer }).toBER(),
  *   })
  * ];
  *
  * // Encode OCSP request
  * const ocspReqRaw = ocspReq.toSchema(true).toBER();
  * ```
  */
@JSImport("pkijs", "OCSPRequest")
@js.native
/**
  * Initializes a new instance of the {@link OCSPRequest} class
  * @param parameters Initialization parameters
  */
open class OCSPRequest ()
  extends PkiObject
     with IOCSPRequest {
  def this(parameters: OCSPRequestParameters) = this()
  
  /**
    * Making OCSP Request for specific certificate
    * @param certificate Certificate making OCSP Request for
    * @param parameters Additional parameters
    * @param crypto Crypto engine
    */
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams): js.Promise[Unit] = js.native
  def createForCertificate(certificate: Certificate, parameters: CertIDCreateParams, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Make signature for current OCSP Request
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  var tbsRequest: TBSRequest = js.native
  
  def verify(): Unit = js.native
}
object OCSPRequest {
  
  @JSImport("pkijs", "OCSPRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OCSPRequest.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    * @returns Returns `true` if `memberValue` is equal to default value for selected class member
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues(memberName: /* "tbsRequest" */ String): TBSRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[TBSRequest]
  
  /* static member */
  inline def defaultValues_Signature(memberName: /* "optionalSignature" */ String): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OCSPRequest ::= SEQUENCE {
    *    tbsRequest                  TBSRequest,
    *    optionalSignature   [0]     EXPLICIT Signature OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[OptionalSignature]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
