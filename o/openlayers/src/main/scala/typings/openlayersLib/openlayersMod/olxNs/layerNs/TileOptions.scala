package typings
package openlayersLib.openlayersMod.olxNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOptions extends js.Object {
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var map: js.UndefOr[openlayersLib.openlayersMod.Map] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var preload: js.UndefOr[scala.Double] = js.undefined
  var source: openlayersLib.openlayersMod.sourceNs.Tile
  var useInterimTilesOnError: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object TileOptions {
  @scala.inline
  def apply(
    source: openlayersLib.openlayersMod.sourceNs.Tile,
    extent: openlayersLib.openlayersMod.Extent = null,
    map: openlayersLib.openlayersMod.Map = null,
    maxResolution: scala.Int | scala.Double = null,
    minResolution: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    preload: scala.Int | scala.Double = null,
    useInterimTilesOnError: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): TileOptions = {
    val __obj = js.Dynamic.literal(source = source)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(useInterimTilesOnError)) __obj.updateDynamic("useInterimTilesOnError")(useInterimTilesOnError)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOptions]
  }
}

