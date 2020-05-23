package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object PinchZoomOptions {
  @scala.inline
  def apply(
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined
  ): PinchZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchZoomOptions]
  }
}

