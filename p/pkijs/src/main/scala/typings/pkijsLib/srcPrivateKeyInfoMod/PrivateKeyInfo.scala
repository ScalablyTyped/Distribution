package typings
package pkijsLib.srcPrivateKeyInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[pkijsLib.srcAttributeMod.default]] = js.undefined
  var parsedKey: js.UndefOr[pkijsLib.srcECPrivateKeyMod.default | pkijsLib.srcRSAPrivateKeyMod.default] = js.undefined
  var privateKey: asn1jsLib.asn1jsMod.OctetString
  var privateKeyAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var version: scala.Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PrivateKeyInfo {
  @scala.inline
  def apply(
    fromJSON: stdLib.JsonWebKey => scala.Unit,
    fromSchema: js.Any => scala.Unit,
    privateKey: asn1jsLib.asn1jsMod.OctetString,
    privateKeyAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: scala.Double,
    attributes: js.Array[pkijsLib.srcAttributeMod.default] = null,
    parsedKey: pkijsLib.srcECPrivateKeyMod.default | pkijsLib.srcRSAPrivateKeyMod.default = null
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey, privateKeyAlgorithm = privateKeyAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
}

