package typings.openlayers.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object PinchZoomOptions {
  @scala.inline
  def apply(constrainResolution: js.UndefOr[Boolean] = js.undefined, duration: Int | Double = null): PinchZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchZoomOptions]
  }
}

