package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object PinchZoomOptions {
  @scala.inline
  def apply(
    constrainResolution: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null
  ): PinchZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchZoomOptions]
  }
}

