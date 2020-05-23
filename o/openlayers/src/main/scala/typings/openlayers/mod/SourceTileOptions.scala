package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[Extent_] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[State] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object SourceTileOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    extent: Extent_ = null,
    logo: String | LogoOptions = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    state: State = null,
    tileGrid: TileGrid = null,
    tilePixelRatio: js.UndefOr[Double] = js.undefined,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): SourceTileOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(tilePixelRatio)) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTileOptions]
  }
}

