package typings.pkijs.srcPKIStatusInfoMod

import typings.asn1js.asn1jsMod.BitString
import typings.asn1js.asn1jsMod.Utf8String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKIStatusInfo extends js.Object {
  var failInfo: js.UndefOr[BitString] = js.undefined
  var status: Double
  var statusStrings: js.UndefOr[Utf8String] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PKIStatusInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    status: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    failInfo: BitString = null,
    statusStrings: Utf8String = null
  ): PKIStatusInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), status = status.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (failInfo != null) __obj.updateDynamic("failInfo")(failInfo.asInstanceOf[js.Any])
    if (statusStrings != null) __obj.updateDynamic("statusStrings")(statusStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKIStatusInfo]
  }
}

