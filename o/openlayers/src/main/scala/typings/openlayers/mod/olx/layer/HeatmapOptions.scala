package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapOptions extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[Extent_] = js.undefined
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
    blur: js.UndefOr[Double] = js.undefined,
    extent: Extent_ = null,
    gradient: js.Array[String] = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    shadow: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): HeatmapOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOptions]
  }
}

