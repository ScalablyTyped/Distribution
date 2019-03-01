package typings
package pkijsLib.srcMacDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacData extends js.Object {
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var mac: pkijsLib.srcDigestInfoMod.default
  var macSalt: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MacData {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    mac: pkijsLib.srcDigestInfoMod.default,
    macSalt: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    iterations: scala.Int | scala.Double = null
  ): MacData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("macSalt")(macSalt)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacData]
  }
}

