package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchRotateOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PinchRotateOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): PinchRotateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchRotateOptions]
  }
}

