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
    if (!js.isUndefined(attribution)) __obj.updateDynamic("attribution")(attribution)
    if (attributionOptions != null) __obj.updateDynamic("attributionOptions")(attributionOptions)
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate)
    if (rotateOptions != null) __obj.updateDynamic("rotateOptions")(rotateOptions)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions)
    __obj.asInstanceOf[DefaultsOptions]
  }
}

