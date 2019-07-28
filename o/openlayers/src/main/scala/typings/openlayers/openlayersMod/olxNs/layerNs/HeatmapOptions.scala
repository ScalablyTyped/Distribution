package typings.openlayers.openlayersMod.olxNs.layerNs

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.sourceNs.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapOptions extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var gradient: js.UndefOr[js.Array[String]] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[Double] = js.undefined
  var source: Vector
  var visible: js.UndefOr[Boolean] = js.undefined
  var weight: String | (js.Function1[/* feature */ Feature, Double])
  var zIndex: js.UndefOr[Double] = js.undefined
}

object HeatmapOptions {
  @scala.inline
  def apply(
    source: Vector,
    weight: String | (js.Function1[/* feature */ Feature, Double]),
    blur: Int | Double = null,
    extent: Extent = null,
    gradient: js.Array[String] = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    radius: Int | Double = null,
    shadow: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): HeatmapOptions = {
    val __obj = js.Dynamic.literal(source = source, weight = weight.asInstanceOf[js.Any])
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

