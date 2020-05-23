package typings.openlayers.mod.olx.tilegrid

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileGridOptions extends js.Object {
  var extent: js.UndefOr[Extent_] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[Coordinate_] = js.undefined
  var origins: js.UndefOr[js.Array[Coordinate_]] = js.undefined
  var resolutions: js.Array[Double]
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
}

object TileGridOptions {
  @scala.inline
  def apply(
    resolutions: js.Array[Double],
    extent: Extent_ = null,
    minZoom: js.UndefOr[Double] = js.undefined,
    origin: Coordinate_ = null,
    origins: js.Array[Coordinate_] = null,
    tileSize: Double | Size = null,
    tileSizes: js.Array[Double | Size] = null
  ): TileGridOptions = {
    val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileGridOptions]
  }
}

