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
    fromSchema: js.Any => scala.Unit,
    mac: pkijsLib.srcDigestInfoMod.default,
    macSalt: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    iterations: scala.Int | scala.Double = null
  ): MacData = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mac = mac, macSalt = macSalt, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacData]
  }
}

