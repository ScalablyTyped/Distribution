package typings
package pkijsLib.srcBasicOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicOCSPResponse extends js.Object {
  var certs: js.UndefOr[js.Array[pkijsLib.srcCertificateMod.default]] = js.native
  var signature: asn1jsLib.asn1jsMod.BitString = js.native
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  var tbsResponseData: pkijsLib.srcResponseDataMod.default = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate Certificate to be checked
    * @param {Certificate} issuerCertificate Certificate of issuer for certificate to be checked
    * @returns {PromiseLike<GetCertificateStatusResult>}
    */
  def getCertificateStatus(
    certificate: pkijsLib.srcCertificateMod.default,
    issuerCertificate: pkijsLib.srcCertificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
  /**
    * Make signature for current OCSP Basic Response
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @returns {PromiseLike<ArrayBuffer>}
    */
  def sign(privateKey: stdLib.CryptoKey): js.Thenable[stdLib.ArrayBuffer] = js.native
  def sign(privateKey: stdLib.CryptoKey, hashAlgorithm: java.lang.String): js.Thenable[stdLib.ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  /**
    * Verify existing OCSP Basic Response
    * 
    * @param {{ trustedCerts?: Certificate[] }} parameters Additional parameters
    * @returns {PromiseLike<boolean>}
    */
  def verify(): js.Thenable[scala.Boolean] = js.native
  def verify(parameters: pkijsLib.Anon_TrustedCerts): js.Thenable[scala.Boolean] = js.native
}

