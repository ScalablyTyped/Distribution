package typings
package olLib.tilegridWMTSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var matrixIds: js.Array[java.lang.String]
  var origin: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[olLib.coordinateMod.Coordinate]] = js.undefined
  var resolutions: js.Array[scala.Double]
  var sizes: js.UndefOr[js.Array[olLib.sizeMod.Size]] = js.undefined
  var tileSize: js.UndefOr[scala.Double | olLib.sizeMod.Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[olLib.sizeMod.Size]] = js.undefined
  var widths: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    matrixIds: js.Array[java.lang.String],
    resolutions: js.Array[scala.Double],
    extent: olLib.extentMod.Extent = null,
    origin: olLib.coordinateMod.Coordinate = null,
    origins: js.Array[olLib.coordinateMod.Coordinate] = null,
    sizes: js.Array[olLib.sizeMod.Size] = null,
    tileSize: scala.Double | olLib.sizeMod.Size = null,
    tileSizes: js.Array[olLib.sizeMod.Size] = null,
    widths: js.Array[scala.Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(matrixIds = matrixIds, resolutions = resolutions)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[Options]
  }
}

