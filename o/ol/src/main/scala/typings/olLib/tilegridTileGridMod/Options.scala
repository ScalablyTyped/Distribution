package typings
package olLib.tilegridTileGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[olLib.coordinateMod.Coordinate] = js.undefined
  var origins: js.UndefOr[js.Array[olLib.coordinateMod.Coordinate]] = js.undefined
  var resolutions: js.Array[scala.Double]
  var sizes: js.UndefOr[js.Array[olLib.sizeMod.Size]] = js.undefined
  var tileSize: js.UndefOr[scala.Double | olLib.sizeMod.Size] = js.undefined
  var tileSizes: js.UndefOr[js.Array[olLib.sizeMod.Size]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    resolutions: js.Array[scala.Double],
    extent: olLib.extentMod.Extent = null,
    minZoom: scala.Int | scala.Double = null,
    origin: olLib.coordinateMod.Coordinate = null,
    origins: js.Array[olLib.coordinateMod.Coordinate] = null,
    sizes: js.Array[olLib.sizeMod.Size] = null,
    tileSize: scala.Double | olLib.sizeMod.Size = null,
    tileSizes: js.Array[olLib.sizeMod.Size] = null
  ): Options = {
    val __obj = js.Dynamic.literal(resolutions = resolutions)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileSizes != null) __obj.updateDynamic("tileSizes")(tileSizes)
    __obj.asInstanceOf[Options]
  }
}

