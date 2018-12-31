package typings
package pkijsLib.srcCertificateRevocationListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRevocationList extends js.Object {
  var crlExtension: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.native
  var issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default = js.native
  var nextUpdate: js.UndefOr[pkijsLib.srcTimeMod.default] = js.native
  var revokedCertificates: js.UndefOr[js.Array[pkijsLib.srcRevokedCertificateMod.default]] = js.native
  var signature: stdLib.AlgorithmIdentifier = js.native
  var signatureAlgorithm: stdLib.AlgorithmIdentifier = js.native
  var signatureValue: asn1jsLib.asn1jsMod.BitString = js.native
  var tbs: stdLib.ArrayBuffer = js.native
  var thisUpdate: pkijsLib.srcTimeMod.default = js.native
  var version: js.UndefOr[scala.Double] = js.native
  def encodeTBS(): asn1jsLib.asn1jsMod.Sequence = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  def isCertificateRevoked(certificate: pkijsLib.srcCertificateMod.default): scala.Boolean = js.native
  /**
    * Make a signature for existing CRL data
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    */
  def sign(privateKey: stdLib.CryptoKey): js.Thenable[stdLib.ArrayBuffer] = js.native
  def sign(privateKey: stdLib.CryptoKey, hashAlgorithm: java.lang.String): js.Thenable[stdLib.ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: scala.Boolean): js.Any = js.native
  /**
    * Verify existing signature
    * @param {{[issuerCertificate]: Certificate, [publicKeyInfo]: PublicKeyInfo}} parameters
    * @returns {*}
    */
  def verify(parameters: pkijsLib.Anon_IssuerCertificate): js.Thenable[scala.Boolean] = js.native
}

