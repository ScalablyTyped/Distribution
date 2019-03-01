package typings
package openlayersLib.openlayersMod.olxNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapOptions extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var gradient: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[scala.Double] = js.undefined
  var source: openlayersLib.openlayersMod.sourceNs.Vector
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var weight: java.lang.String | (js.Function1[/* feature */ openlayersLib.openlayersMod.Feature, scala.Double])
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object HeatmapOptions {
  @scala.inline
  def apply(
    source: openlayersLib.openlayersMod.sourceNs.Vector,
    weight: java.lang.String | (js.Function1[/* feature */ openlayersLib.openlayersMod.Feature, scala.Double]),
    blur: scala.Int | scala.Double = null,
    extent: openlayersLib.openlayersMod.Extent = null,
    gradient: js.Array[java.lang.String] = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    shadow: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): HeatmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOptions]
  }
}

