package typings.ol.controlMod

import typings.ol.controlAttributionMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.undefined
  var attributionOptions: js.UndefOr[Options] = js.undefined
  var rotate: js.UndefOr[Boolean] = js.undefined
  var rotateOptions: js.UndefOr[typings.ol.controlRotateMod.Options] = js.undefined
  var zoom: js.UndefOr[Boolean] = js.undefined
  var zoomOptions: js.UndefOr[typings.ol.controlZoomMod.Options] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    attribution: js.UndefOr[Boolean] = js.undefined,
    attributionOptions: Options = null,
    rotate: js.UndefOr[Boolean] = js.undefined,
    rotateOptions: typings.ol.controlRotateMod.Options = null,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomOptions: typings.ol.controlZoomMod.Options = null
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

