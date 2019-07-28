package typings.pkijs.srcPrivateKeyInfoMod

import typings.asn1js.asn1jsMod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[typings.pkijs.srcAttributeMod.default]] = js.undefined
  var parsedKey: js.UndefOr[
    typings.pkijs.srcECPrivateKeyMod.default | typings.pkijs.srcRSAPrivateKeyMod.default
  ] = js.undefined
  var privateKey: OctetString
  var privateKeyAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var version: Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PrivateKeyInfo {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    privateKey: OctetString,
    privateKeyAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    attributes: js.Array[typings.pkijs.srcAttributeMod.default] = null,
    parsedKey: typings.pkijs.srcECPrivateKeyMod.default | typings.pkijs.srcRSAPrivateKeyMod.default = null
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey, privateKeyAlgorithm = privateKeyAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
}

