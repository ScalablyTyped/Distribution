package typings.ol.layerVectorTileMod

import typings.ol.extentMod.Extent
import typings.ol.layerVectorTileRenderTypeMod.VectorTileRenderType
import typings.ol.renderMod.OrderFunction
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var declutter: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var map: js.UndefOr[typings.ol.pluggableMapMod.default] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Double] = js.undefined
  var renderBuffer: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[VectorTileRenderType | String] = js.undefined
  var renderOrder: js.UndefOr[OrderFunction] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorTileMod.default] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    declutter: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    map: typings.ol.pluggableMapMod.default = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    preload: Int | Double = null,
    renderBuffer: Int | Double = null,
    renderMode: VectorTileRenderType | String = null,
    renderOrder: OrderFunction = null,
    source: typings.ol.sourceVectorTileMod.default = null,
    style: StyleLike = null,
    updateWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(declutter)) __obj.updateDynamic("declutter")(declutter)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(renderOrder)
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating)
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting)
    if (!js.isUndefined(useInterimTilesOnError)) __obj.updateDynamic("useInterimTilesOnError")(useInterimTilesOnError)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

