package typings.openlayers.mod.olx.layer

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Map
import typings.openlayers.mod.source.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Double] = js.undefined
  var source: Tile
  var useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    source: Tile,
    extent: Extent_ = null,
    map: Map = null,
    maxResolution: js.UndefOr[Double] = js.undefined,
    minResolution: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    preload: js.UndefOr[Double] = js.undefined,
    useInterimTilesOnError: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): TileOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResolution)) __obj.updateDynamic("maxResolution")(maxResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResolution)) __obj.updateDynamic("minResolution")(minResolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useInterimTilesOnError)) __obj.updateDynamic("useInterimTilesOnError")(useInterimTilesOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

