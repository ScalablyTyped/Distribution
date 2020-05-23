package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.Map
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.layer.VectorTileRenderType
import typings.openlayers.mod.source.VectorTile
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderBuffer: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[VectorTileRenderType | String] = js.undefined
  var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.undefined
  var source: js.UndefOr[VectorTile] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object VectorTileOptions {
  @scala.inline
  def apply(
    extent: Extent_ = null,
    map: Map = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    renderBuffer: js.UndefOr[Double] = js.undefined,
    renderMode: VectorTileRenderType | String = null,
    renderOrder: (/* feature1 */ Feature, /* feature2 */ Feature) => Double = null,
    source: VectorTile = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    updateWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderBuffer)) __obj.updateDynamic("renderBuffer")(renderBuffer.get.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(js.Any.fromFunction2(renderOrder))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileOptions]
  }
}

