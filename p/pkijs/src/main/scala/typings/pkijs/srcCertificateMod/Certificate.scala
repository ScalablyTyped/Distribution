package typings.pkijs.srcCertificateMod

import typings.asn1js.asn1jsMod.BitString
import typings.asn1js.asn1jsMod.Integer
import typings.asn1js.asn1jsMod.Sequence
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  var extensions: js.UndefOr[js.Array[typings.pkijs.srcExtensionMod.default]] = js.native
  var issuer: typings.pkijs.srcRelativeDistinguishedNamesMod.default = js.native
  var issuerUniqueID: js.UndefOr[ArrayBuffer] = js.native
  var notAfter: typings.pkijs.srcTimeMod.default = js.native
  var notBefore: typings.pkijs.srcTimeMod.default = js.native
  var serialNumber: Integer = js.native
  var signature: typings.pkijs.srcAlgorithmIdentifierMod.default = js.native
  var signatureAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default = js.native
  var signatureValue: BitString = js.native
  var subject: typings.pkijs.srcRelativeDistinguishedNamesMod.default = js.native
  var subjectPublicKeyInfo: typings.pkijs.srcPublicKeyInfoMod.default = js.native
  var subjectUniqueID: js.UndefOr[ArrayBuffer] = js.native
  var tbs: ArrayBuffer = js.native
  var version: Double = js.native
  /**
    * Create ASN.1 schema for existing values of TBS part for the certificate
    */
  def encodeTBS(): Sequence = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get SHA-1 hash value for subject public key
    */
  def getKeyHash(): js.Thenable[ArrayBuffer] = js.native
  /**
    * Importing public key for current certificate
    */
  def getPublicKey(): js.Thenable[CryptoKey] = js.native
  def getPublicKey(parameters: js.Any): js.Thenable[CryptoKey] = js.native
  /**
    * Make a signature for current value from TBS section
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm="SHA-1"] Hashing algorithm
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
  def verify(): js.Thenable[Boolean] = js.native
  def verify(issuerCertificate: Certificate): js.Thenable[Boolean] = js.native
}

