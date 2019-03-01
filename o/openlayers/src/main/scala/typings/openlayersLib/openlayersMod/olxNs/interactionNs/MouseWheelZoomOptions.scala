package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useAnchor: js.UndefOr[scala.Boolean] = js.undefined
}

object MouseWheelZoomOptions {
  @scala.inline
  def apply(
    constrainResolution: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    useAnchor: js.UndefOr[scala.Boolean] = js.undefined
  ): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor)
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
}

