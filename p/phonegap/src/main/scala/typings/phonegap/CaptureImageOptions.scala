package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureImageOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object CaptureImageOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, mode: js.UndefOr[Double] = js.undefined): CaptureImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureImageOptions]
  }
}

