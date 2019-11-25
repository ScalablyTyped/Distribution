package typings.openlayers.openlayersMod.olx.tilegrid

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var matrixIds: js.Array[String]
  var origin: js.UndefOr[Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
  var resolutions: js.Array[Double]
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
  var tileSize: js.UndefOr[Double | Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
  var widths: js.UndefOr[js.Array[Double]] = js.undefined
}

object WMTSOptions {
  @scala.inline
  def apply(
    matrixIds: js.Array[String],
    resolutions: js.Array[Double],
    extent: Extent = null,
    origin: Coordinate = null,
    origins: js.Array[Coordinate] = null,
    sizes: js.Array[Size] = null,
    tileSize: Double | Size = null,
    tileSizes: js.Array[Double | Size] = null,
    widths: js.Array[Double] = null
  ): WMTSOptions = {
    val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
}

