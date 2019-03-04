package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsOptions extends js.Object {
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var imagerySet: java.lang.String
  var key: java.lang.String
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object BingMapsOptions {
  @scala.inline
  def apply(
    imagerySet: java.lang.String,
    key: java.lang.String,
    cacheSize: scala.Int | scala.Double = null,
    culture: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): BingMapsOptions = {
    val __obj = js.Dynamic.literal(imagerySet = imagerySet, key = key)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[BingMapsOptions]
  }
}

