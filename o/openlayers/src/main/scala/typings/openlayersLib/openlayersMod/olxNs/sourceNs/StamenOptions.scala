package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StamenOptions extends js.Object {
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var layer: java.lang.String
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object StamenOptions {
  @scala.inline
  def apply(
    layer: java.lang.String,
    cacheSize: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    url: java.lang.String = null
  ): StamenOptions = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StamenOptions]
  }
}

