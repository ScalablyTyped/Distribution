package typings
package openlayersLib.openlayersMod.olxNs.tilegridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSOptions extends js.Object {
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var matrixIds: js.Array[java.lang.String]
  var origin: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[openlayersLib.openlayersMod.Coordinate]] = js.undefined
  var resolutions: js.Array[scala.Double]
  var sizes: js.UndefOr[js.Array[openlayersLib.openlayersMod.Size]] = js.undefined
  var tileSize: js.UndefOr[scala.Double | openlayersLib.openlayersMod.Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[scala.Double | openlayersLib.openlayersMod.Size]] = js.undefined
  var widths: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object WMTSOptions {
  @scala.inline
  def apply(
    matrixIds: js.Array[java.lang.String],
    resolutions: js.Array[scala.Double],
    extent: openlayersLib.openlayersMod.Extent = null,
    origin: openlayersLib.openlayersMod.Coordinate = null,
    origins: js.Array[openlayersLib.openlayersMod.Coordinate] = null,
    sizes: js.Array[openlayersLib.openlayersMod.Size] = null,
    tileSize: scala.Double | openlayersLib.openlayersMod.Size = null,
    tileSizes: js.Array[scala.Double | openlayersLib.openlayersMod.Size] = null,
    widths: js.Array[scala.Double] = null
  ): WMTSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matrixIds")(matrixIds)
    __obj.updateDynamic("resolutions")(resolutions)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[WMTSOptions]
  }
}

