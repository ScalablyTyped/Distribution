package typings.pkijs.basicOCSPResponseMod

import typings.asn1js.mod.BitString
import typings.pkijs.anon.TrustedCerts
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicOCSPResponse extends js.Object {
  
  var certs: js.UndefOr[js.Array[typings.pkijs.certificateMod.default]] = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate Certificate to be checked
    * @param {Certificate} issuerCertificate Certificate of issuer for certificate to be checked
    * @returns {PromiseLike<GetCertificateStatusResult>}
    */
  def getCertificateStatus(
    certificate: typings.pkijs.certificateMod.default,
    issuerCertificate: typings.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
  
  /**
    * Make signature for current OCSP Basic Response
    *
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @returns {PromiseLike<ArrayBuffer>}
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  
  var signature: BitString = js.native
  
  var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var tbsResponseData: typings.pkijs.responseDataMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  /**
    * Verify existing OCSP Basic Response
    *
    * @param {{ trustedCerts?: Certificate[] }} parameters Additional parameters
    * @returns {PromiseLike<boolean>}
    */
  def verify(): js.Thenable[Boolean] = js.native
  def verify(parameters: TrustedCerts): js.Thenable[Boolean] = js.native
}
