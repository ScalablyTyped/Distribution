package typings
package pkijsLib.srcCertificationRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificationRequest extends js.Object {
  var attributes: js.UndefOr[js.Array[pkijsLib.srcAttributeMod.default]] = js.native
  var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  var signatureValue: asn1jsLib.asn1jsMod.BitString = js.native
  var subject: pkijsLib.srcRelativeDistinguishedNamesMod.default = js.native
  var subjectPublicKeyInfo: pkijsLib.srcPublicKeyInfoMod.default = js.native
  var tbs: stdLib.ArrayBuffer = js.native
  var version: scala.Double = js.native
  /**
           * Aux function making ASN1js Sequence from current TBS
           * 
           * @returns {Sequence}
           */
  def encodeTBS(): asn1jsLib.asn1jsMod.Sequence = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  /**
           * Makes signature for currect certification request
           * 
           * @param {CryptoKey} privateKey WebCrypto private key
           * @param {string} [hashAlgorithm] String representing current hashing algorithm
           * @returns {PromiseLike<ArrayBuffer>}
           * 
           * @memberOf CertificationRequest
           */
  def sign(privateKey: stdLib.CryptoKey): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Makes signature for currect certification request
           * 
           * @param {CryptoKey} privateKey WebCrypto private key
           * @param {string} [hashAlgorithm] String representing current hashing algorithm
           * @returns {PromiseLike<ArrayBuffer>}
           * 
           * @memberOf CertificationRequest
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
  /**
           * Verify existing certification request signature
           * 
           * @returns {PromiseLike<boolean>}
           * 
           * @memberOf CertificationRequest
           */
  def verify(): stdLib.PromiseLike[scala.Boolean] = js.native
}

