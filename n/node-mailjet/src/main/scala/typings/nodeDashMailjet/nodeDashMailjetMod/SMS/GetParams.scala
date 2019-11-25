package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
trait GetParams extends js.Object {
  var FromTS: js.UndefOr[Double] = js.undefined
  var Limit: js.UndefOr[Double] = js.undefined
  var Offset: js.UndefOr[Double] = js.undefined
  var StatusCode: js.UndefOr[js.Array[Double]] = js.undefined
  var To: js.UndefOr[String] = js.undefined
  var ToTS: js.UndefOr[Double] = js.undefined
}

object GetParams {
  @scala.inline
  def apply(
    FromTS: Int | Double = null,
    Limit: Int | Double = null,
    Offset: Int | Double = null,
    StatusCode: js.Array[Double] = null,
    To: String = null,
    ToTS: Int | Double = null
  ): GetParams = {
    val __obj = js.Dynamic.literal()
    if (FromTS != null) __obj.updateDynamic("FromTS")(FromTS.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Offset != null) __obj.updateDynamic("Offset")(Offset.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    if (ToTS != null) __obj.updateDynamic("ToTS")(ToTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParams]
  }
}

