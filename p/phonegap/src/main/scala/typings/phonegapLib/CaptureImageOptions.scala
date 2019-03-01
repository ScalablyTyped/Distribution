package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureImageOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object CaptureImageOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, mode: scala.Int | scala.Double = null): CaptureImageOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureImageOptions]
  }
}

