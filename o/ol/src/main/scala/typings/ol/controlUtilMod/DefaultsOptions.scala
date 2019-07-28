package typings.ol.controlUtilMod

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
    if (!js.isUndefined(attribution)) __obj.updateDynamic("attribution")(attribution)
    if (attributionOptions != null) __obj.updateDynamic("attributionOptions")(attributionOptions)
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate)
    if (rotateOptions != null) __obj.updateDynamic("rotateOptions")(rotateOptions)
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    if (zoomOptions != null) __obj.updateDynamic("zoomOptions")(zoomOptions)
    __obj.asInstanceOf[DefaultsOptions]
  }
}

