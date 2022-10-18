package typings.pkijs.mod

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
@js.native
trait OCSPRequest
  extends StObject
     with PkiObject
     with IOCSPRequest {
  
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
  
  def verify(): Unit = js.native
}
