package typings.openlayers.openlayersMod.olx.control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.undefined
  var attributionOptions: js.UndefOr[typings.openlayers.openlayersMod.olx.control.AttributionOptions] = js.undefined
  var rotate: js.UndefOr[Boolean] = js.undefined
  var rotateOptions: js.UndefOr[RotateOptions] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
  var zoomOptions: js.UndefOr[ZoomOptions] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    attribution: js.UndefOr[Boolean] = js.undefined,
    attributionOptions: typings.openlayers.openlayersMod.olx.control.AttributionOptions = null,
    rotate: js.UndefOr[Boolean] = js.undefined,
    rotateOptions: RotateOptions = null,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomOptions: ZoomOptions = null
  ): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attribution)) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (attributionOptions != null) __obj.updateDynamic("attributionOptions")(attributionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotateOptions != null) __obj.updateDynamic("rotateOptions")(rotateOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultsOptions]
  }
}

