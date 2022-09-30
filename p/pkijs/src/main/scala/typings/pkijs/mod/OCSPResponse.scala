package typings.pkijs.mod

import typings.asn1js.mod.Enumerated
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an OCSP response described in [RFC6960 Section 4.2](https://datatracker.ietf.org/doc/html/rfc6960#section-4.2)
  *
  * @example The following example demonstrates how to verify OCSP response
  * ```js
  * const asnOcspResp = asn1js.fromBER(ocspRespRaw);
  * const ocspResp = new pkijs.OCSPResponse({ schema: asnOcspResp.result });
  *
  * if (!ocspResp.responseBytes) {
  *   throw new Error("No \"ResponseBytes\" in the OCSP Response - nothing to verify");
  * }
  *
  * const asnOcspRespBasic = asn1js.fromBER(ocspResp.responseBytes.response.valueBlock.valueHex);
  * const ocspBasicResp = new pkijs.BasicOCSPResponse({ schema: asnOcspRespBasic.result });
  * const ok = await ocspBasicResp.verify({ trustedCerts: [cert] });
  * ```
  *
  * @example The following example demonstrates how to create OCSP response
  * ```js
  * const ocspBasicResp = new pkijs.BasicOCSPResponse();
  *
  * // Create specific TST info structure to sign
  * ocspBasicResp.tbsResponseData.responderID = issuerCert.subject;
  * ocspBasicResp.tbsResponseData.producedAt = new Date();
  *
  * const certID = new pkijs.CertID();
  * await certID.createForCertificate(cert, {
  *   hashAlgorithm: "SHA-256",
  *   issuerCertificate: issuerCert,
  * });
  * const response = new pkijs.SingleResponse({
  *   certID,
  * });
  * response.certStatus = new asn1js.Primitive({
  *   idBlock: {
  *     tagClass: 3, // CONTEXT-SPECIFIC
  *     tagNumber: 0 // [0]
  *   },
  *   lenBlockLength: 1 // The length contains one byte 0x00
  * }); // status - success
  * response.thisUpdate = new Date();
  *
  * ocspBasicResp.tbsResponseData.responses.push(response);
  *
  * // Add certificates for chain OCSP response validation
  * ocspBasicResp.certs = [issuerCert];
  *
  * await ocspBasicResp.sign(keys.privateKey, "SHA-256");
  *
  * // Finally create completed OCSP response structure
  * const ocspBasicRespRaw = ocspBasicResp.toSchema().toBER(false);
  *
  * const ocspResp = new pkijs.OCSPResponse({
  *   responseStatus: new asn1js.Enumerated({ value: 0 }), // success
  *   responseBytes: new pkijs.ResponseBytes({
  *     responseType: pkijs.id_PKIX_OCSP_Basic,
  *     response: new asn1js.OctetString({ valueHex: ocspBasicRespRaw }),
  *   }),
  * });
  *
  * const ocspRespRaw = ocspResp.toSchema().toBER();
  * ```
  */
@JSImport("pkijs", "OCSPResponse")
@js.native
/**
  * Initializes a new instance of the {@link OCSPResponse} class
  * @param parameters Initialization parameters
  */
open class OCSPResponse ()
  extends PkiObject
     with IOCSPResponse {
  def this(parameters: OCSPResponseParameters) = this()
  
  /**
    * Get OCSP response status for specific certificate
    * @param certificate
    * @param issuerCertificate
    * @param crypto Crypto engine
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Promise[CertificateStatus] = js.native
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[CertificateStatus] = js.native
  
  /* CompleteClass */
  var responseStatus: Enumerated = js.native
  
  /**
    * Make a signature for current OCSP Response
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Verify current OCSP Response
    * @param issuerCertificate In order to decrease size of resp issuer cert could be omitted. In such case you need manually provide it.
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Null, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
object OCSPResponse {
  
  @JSImport("pkijs", "OCSPResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "OCSPResponse.CLASS_NAME")
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
  inline def defaultValues(memberName: /* "responseBytes" */ String): ResponseBytes = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[ResponseBytes]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Enumerated(memberName: /* "responseStatus" */ String): Enumerated = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Enumerated]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * OCSPResponse ::= SEQUENCE {
    *    responseStatus         OCSPResponseStatus,
    *    responseBytes          [0] EXPLICIT ResponseBytes OPTIONAL }
    *
    * OCSPResponseStatus ::= ENUMERATED {
    *    successful            (0),  -- Response has valid confirmations
    *    malformedRequest      (1),  -- Illegal confirmation request
    *    internalError         (2),  -- Internal error in issuer
    *    tryLater              (3),  -- Try again later
    *    -- (4) is not used
    *    sigRequired           (5),  -- Must sign the request
    *    unauthorized          (6)   -- Request unauthorized
    * }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.ResponseBytes]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
