package typings.nodeMailjet.mod.SMS

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
    FromTS: js.UndefOr[Double] = js.undefined,
    Limit: js.UndefOr[Double] = js.undefined,
    Offset: js.UndefOr[Double] = js.undefined,
    StatusCode: js.Array[Double] = null,
    To: String = null,
    ToTS: js.UndefOr[Double] = js.undefined
  ): GetParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromTS)) __obj.updateDynamic("FromTS")(FromTS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Offset)) __obj.updateDynamic("Offset")(Offset.get.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    if (!js.isUndefined(ToTS)) __obj.updateDynamic("ToTS")(ToTS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParams]
  }
}

