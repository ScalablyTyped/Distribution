package typings
package olLib.controlUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends js.Object {
  var attribution: js.UndefOr[scala.Boolean] = js.undefined
  var attributionOptions: js.UndefOr[olLib.controlAttributionMod.Options] = js.undefined
  var rotate: js.UndefOr[scala.Boolean] = js.undefined
  var rotateOptions: js.UndefOr[olLib.controlRotateMod.Options] = js.undefined
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
  var zoomOptions: js.UndefOr[olLib.controlZoomMod.Options] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    attribution: js.UndefOr[scala.Boolean] = js.undefined,
    attributionOptions: olLib.controlAttributionMod.Options = null,
    rotate: js.UndefOr[scala.Boolean] = js.undefined,
    rotateOptions: olLib.controlRotateMod.Options = null,
    zoom: js.UndefOr[scala.Boolean] = js.undefined,
    zoomOptions: olLib.controlZoomMod.Options = null
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

