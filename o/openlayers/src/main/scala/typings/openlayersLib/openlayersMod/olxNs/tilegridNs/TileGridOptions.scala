package typings
package openlayersLib.openlayersMod.olxNs.tilegridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileGridOptions extends js.Object {
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[openlayersLib.openlayersMod.Coordinate]] = js.undefined
  var resolutions: js.Array[scala.Double]
  var tileSize: js.UndefOr[scala.Double | openlayersLib.openlayersMod.Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[scala.Double | openlayersLib.openlayersMod.Size]] = js.undefined
}

object TileGridOptions {
  @scala.inline
  def apply(
    resolutions: js.Array[scala.Double],
    extent: openlayersLib.openlayersMod.Extent = null,
    minZoom: scala.Int | scala.Double = null,
    origin: openlayersLib.openlayersMod.Coordinate = null,
    origins: js.Array[openlayersLib.openlayersMod.Coordinate] = null,
    tileSize: scala.Double | openlayersLib.openlayersMod.Size = null,
    tileSizes: js.Array[scala.Double | openlayersLib.openlayersMod.Size] = null
  ): TileGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolutions")(resolutions)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes)
    __obj.asInstanceOf[TileGridOptions]
  }
}

