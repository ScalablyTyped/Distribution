package typings
package olLib.layerVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var declutter: js.UndefOr[scala.Boolean] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var map: js.UndefOr[olLib.pluggableMapMod.default] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderBuffer: js.UndefOr[scala.Double] = js.undefined
  var renderMode: js.UndefOr[olLib.layerVectorRenderTypeMod.VectorRenderType | java.lang.String] = js.undefined
  var renderOrder: js.UndefOr[olLib.renderMod.OrderFunction] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var style: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var updateWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    declutter: js.UndefOr[scala.Boolean] = js.undefined,
    extent: olLib.extentMod.Extent = null,
    map: olLib.pluggableMapMod.default = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    renderBuffer: scala.Int | scala.Double = null,
    renderMode: olLib.layerVectorRenderTypeMod.VectorRenderType | java.lang.String = null,
    renderOrder: olLib.renderMod.OrderFunction = null,
    source: olLib.sourceVectorMod.default = null,
    style: olLib.styleStyleMod.StyleLike = null,
    updateWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(declutter)) __obj.updateDynamic("declutter")(declutter)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(renderOrder)
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating)
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

