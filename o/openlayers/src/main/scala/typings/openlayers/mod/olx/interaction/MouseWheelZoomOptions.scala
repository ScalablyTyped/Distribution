package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelZoomOptions extends js.Object {
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}

object MouseWheelZoomOptions {
  @scala.inline
  def apply(
    constrainResolution: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    useAnchor: js.UndefOr[Boolean] = js.undefined
  ): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(constrainResolution)) __obj.updateDynamic("constrainResolution")(constrainResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
}

