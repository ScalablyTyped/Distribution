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
  def importKey(publicKey: stdLib.CryptoKey): js.Thenable[scala.Unit]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PublicKeyInfo {
  @scala.inline
  def apply(
    algorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    fromJSON: js.Function1[stdLib.JsonWebKey, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    importKey: js.Function1[stdLib.CryptoKey, js.Thenable[scala.Unit]],
    subjectPublicKey: asn1jsLib.asn1jsMod.BitString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    parsedKey: pkijsLib.srcECPublicKeyMod.default | pkijsLib.srcRSAPublicKeyMod.default = null
  ): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, fromJSON = fromJSON, fromSchema = fromSchema, importKey = importKey, subjectPublicKey = subjectPublicKey, toJSON = toJSON, toSchema = toSchema)
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfo]
  }
}

