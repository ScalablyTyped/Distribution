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
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined
  ): CaptureAudioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureAudioOptions]
  }
}

