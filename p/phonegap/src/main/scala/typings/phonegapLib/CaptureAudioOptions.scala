package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureAudioOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object CaptureAudioOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null
  ): CaptureAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureAudioOptions]
  }
}

