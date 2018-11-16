package typings
package pkijsLib.srcCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  var extensions: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.native
  var issuer: pkijsLib.srcRelativeDistinguishedNamesMod.default = js.native
  var issuerUniqueID: js.UndefOr[stdLib.ArrayBuffer] = js.native
  var notAfter: pkijsLib.srcTimeMod.default = js.native
  var notBefore: pkijsLib.srcTimeMod.default = js.native
  var serialNumber: asn1jsLib.asn1jsMod.Integer = js.native
  var signature: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  var signatureValue: asn1jsLib.asn1jsMod.BitString = js.native
  var subject: pkijsLib.srcRelativeDistinguishedNamesMod.default = js.native
  var subjectPublicKeyInfo: pkijsLib.srcPublicKeyInfoMod.default = js.native
  var subjectUniqueID: js.UndefOr[stdLib.ArrayBuffer] = js.native
  var tbs: stdLib.ArrayBuffer = js.native
  var version: scala.Double = js.native
  /**
           * Create ASN.1 schema for existing values of TBS part for the certificate
           */
  def encodeTBS(): asn1jsLib.asn1jsMod.Sequence = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
           * Get SHA-1 hash value for subject public key
           */
  def getKeyHash(): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Importing public key for current certificate
           */
  def getPublicKey(): stdLib.PromiseLike[stdLib.CryptoKey] = js.native
  /**
           * Importing public key for current certificate
           */
  def getPublicKey(parameters: js.Any): stdLib.PromiseLike[stdLib.CryptoKey] = js.native
  /**
           * Make a signature for current value from TBS section
           * 
           * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
           * @param {string} [hashAlgorithm="SHA-1"] Hashing algorithm
           */
  def sign(privateKey: stdLib.CryptoKey): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Make a signature for current value from TBS section
           * 
           * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
           * @param {string} [hashAlgorithm="SHA-1"] Hashing algorithm
           */
  def sign(privateKey: stdLib.CryptoKey, hashAlgorithm: java.lang.String): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  /**
           * Convert current object to asn1js object and set correct values
           * 
           * @param {boolean} [encodeFlag]
           * @returns {*}
           */
  def toSchema(): js.Any = js.native
  /**
           * Convert current object to asn1js object and set correct values
           * 
           * @param {boolean} [encodeFlag]
           * @returns {*}
           */
  def toSchema(encodeFlag: scala.Boolean): js.Any = js.native
  def verify(): stdLib.PromiseLike[scala.Boolean] = js.native
  def verify(issuerCertificate: Certificate): stdLib.PromiseLike[scala.Boolean] = js.native
}

