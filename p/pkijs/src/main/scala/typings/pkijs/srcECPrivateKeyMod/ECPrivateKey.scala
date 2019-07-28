package typings.pkijs.srcECPrivateKeyMod

import typings.asn1js.asn1jsMod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivateKey extends js.Object {
  var namedCurve: js.UndefOr[String] = js.undefined
  var privateKey: OctetString
  var publicKey: js.UndefOr[typings.pkijs.srcECPublicKeyMod.default] = js.undefined
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

object ECPrivateKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    privateKey: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    namedCurve: String = null,
    publicKey: typings.pkijs.srcECPublicKeyMod.default = null
  ): ECPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (namedCurve != null) __obj.updateDynamic("namedCurve")(namedCurve)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[ECPrivateKey]
  }
}

