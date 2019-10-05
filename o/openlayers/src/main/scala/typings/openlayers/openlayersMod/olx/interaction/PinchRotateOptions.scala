package typings.openlayers.openlayersMod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchRotateOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PinchRotateOptions {
  @scala.inline
  def apply(duration: Int | Double = null, threshold: Int | Double = null): PinchRotateOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchRotateOptions]
  }
}

