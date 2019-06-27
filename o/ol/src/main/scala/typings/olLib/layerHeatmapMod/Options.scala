package typings
package olLib.layerHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var gradient: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var renderMode: js.UndefOr[olLib.layerVectorRenderTypeMod.VectorRenderType | java.lang.String] = js.undefined
  var shadow: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var weight: js.UndefOr[
    java.lang.String | (js.Function1[/* p0 */ olLib.featureMod.default, scala.Double])
  ] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    extent: olLib.extentMod.Extent = null,
    gradient: js.Array[java.lang.String] = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    renderMode: olLib.layerVectorRenderTypeMod.VectorRenderType | java.lang.String = null,
    shadow: scala.Int | scala.Double = null,
    source: olLib.sourceVectorMod.default = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    weight: java.lang.String | (js.Function1[/* p0 */ olLib.featureMod.default, scala.Double]) = null,
    zIndex: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

