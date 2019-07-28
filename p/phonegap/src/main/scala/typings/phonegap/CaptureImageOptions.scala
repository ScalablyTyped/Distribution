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
  def apply(limit: Int | Double = null, mode: Int | Double = null): CaptureImageOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureImageOptions]
  }
}

