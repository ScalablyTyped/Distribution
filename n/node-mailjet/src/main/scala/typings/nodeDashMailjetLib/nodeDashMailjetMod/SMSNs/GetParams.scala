package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
trait GetParams extends js.Object {
  var FromTS: js.UndefOr[scala.Double] = js.undefined
  var Limit: js.UndefOr[scala.Double] = js.undefined
  var Offset: js.UndefOr[scala.Double] = js.undefined
  var StatusCode: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var To: js.UndefOr[java.lang.String] = js.undefined
  var ToTS: js.UndefOr[scala.Double] = js.undefined
}

object GetParams {
  @scala.inline
  def apply(
    FromTS: scala.Int | scala.Double = null,
    Limit: scala.Int | scala.Double = null,
    Offset: scala.Int | scala.Double = null,
    StatusCode: js.Array[scala.Double] = null,
    To: java.lang.String = null,
    ToTS: scala.Int | scala.Double = null
  ): GetParams = {
    val __obj = js.Dynamic.literal()
    if (FromTS != null) __obj.updateDynamic("FromTS")(FromTS.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Offset != null) __obj.updateDynamic("Offset")(Offset.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode)
    if (To != null) __obj.updateDynamic("To")(To)
    if (ToTS != null) __obj.updateDynamic("ToTS")(ToTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParams]
  }
}

