package typings.pkijs.srcCertificateRevocationListMod

import typings.asn1js.asn1jsMod.BitString
import typings.asn1js.asn1jsMod.Sequence
import typings.pkijs.Anon_IssuerCertificate
import typings.std.AlgorithmIdentifier
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRevocationList extends js.Object {
  var crlExtension: js.UndefOr[js.Array[typings.pkijs.srcExtensionMod.default]] = js.native
  var issuer: typings.pkijs.srcRelativeDistinguishedNamesMod.default = js.native
  var nextUpdate: js.UndefOr[typings.pkijs.srcTimeMod.default] = js.native
  var revokedCertificates: js.UndefOr[js.Array[typings.pkijs.srcRevokedCertificateMod.default]] = js.native
  var signature: AlgorithmIdentifier = js.native
  var signatureAlgorithm: AlgorithmIdentifier = js.native
  var signatureValue: BitString = js.native
  var tbs: ArrayBuffer = js.native
  var thisUpdate: typings.pkijs.srcTimeMod.default = js.native
  var version: js.UndefOr[Double] = js.native
  def encodeTBS(): Sequence = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def isCertificateRevoked(certificate: typings.pkijs.srcCertificateMod.default): Boolean = js.native
  /**
    * Make a signature for existing CRL data
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    */
  def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
  /**
    * Verify existing signature
    * @param {{[issuerCertificate]: Certificate, [publicKeyInfo]: PublicKeyInfo}} parameters
    * @returns {*}
    */
  def verify(parameters: Anon_IssuerCertificate): js.Thenable[Boolean] = js.native
}

