package typings.pkijs.mod

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
@js.native
trait OCSPResponse
  extends StObject
     with PkiObject
     with IOCSPResponse {
  
  /**
    * Get OCSP response status for specific certificate
    * @param certificate
    * @param issuerCertificate
    * @param crypto Crypto engine
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Promise[CertificateStatus] = js.native
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[CertificateStatus] = js.native
  
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
