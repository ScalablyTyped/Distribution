package typings.pkijs.ecprivatekeyMod

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivateKey extends js.Object {
  var namedCurve: js.UndefOr[String] = js.undefined
  var privateKey: OctetString
  var publicKey: js.UndefOr[typings.pkijs.ecpublickeyMod.default] = js.undefined
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
    publicKey: typings.pkijs.ecpublickeyMod.default = null
  ): ECPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (namedCurve != null) __obj.updateDynamic("namedCurve")(namedCurve.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPrivateKey]
  }
}

