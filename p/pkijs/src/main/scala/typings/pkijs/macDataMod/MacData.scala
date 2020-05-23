package typings.pkijs.macDataMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacData extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var mac: typings.pkijs.digestInfoMod.default
  var macSalt: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MacData {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    mac: typings.pkijs.digestInfoMod.default,
    macSalt: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    iterations: js.UndefOr[Double] = js.undefined
  ): MacData = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacData]
  }
}

