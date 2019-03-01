package typings
package pkijsLib.srcPKIStatusInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKIStatusInfo extends js.Object {
  var failInfo: js.UndefOr[asn1jsLib.asn1jsMod.BitString] = js.undefined
  var status: scala.Double
  var statusStrings: js.UndefOr[asn1jsLib.asn1jsMod.Utf8String] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PKIStatusInfo {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    status: scala.Double,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    failInfo: asn1jsLib.asn1jsMod.BitString = null,
    statusStrings: asn1jsLib.asn1jsMod.Utf8String = null
  ): PKIStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (failInfo != null) __obj.updateDynamic("failInfo")(failInfo)
    if (statusStrings != null) __obj.updateDynamic("statusStrings")(statusStrings)
    __obj.asInstanceOf[PKIStatusInfo]
  }
}

