package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureAudioOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object CaptureAudioOptions {
  @scala.inline
  def apply(duration: Int | Double = null, limit: Int | Double = null, mode: Int | Double = null): CaptureAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureAudioOptions]
  }
}

