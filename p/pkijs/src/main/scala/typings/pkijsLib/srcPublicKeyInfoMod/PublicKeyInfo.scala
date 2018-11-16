package typings
package pkijsLib.srcPublicKeyInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublicKeyInfo extends js.Object {
  var algorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var parsedKey: js.UndefOr[pkijsLib.srcECPublicKeyMod.default | pkijsLib.srcRSAPublicKeyMod.default] = js.undefined
  var subjectPublicKey: asn1jsLib.asn1jsMod.BitString
  /**
           * Convert JSON value into current object
           * @param {JsonWebKey} json
           */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def importKey(publicKey: stdLib.CryptoKey): stdLib.PromiseLike[scala.Unit]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

