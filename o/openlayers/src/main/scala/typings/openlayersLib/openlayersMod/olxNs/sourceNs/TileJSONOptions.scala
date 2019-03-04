package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileJSONOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var tileLoadFunction: js.UndefOr[openlayersLib.openlayersMod.TileLoadFunctionType] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object TileJSONOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    jsonp: js.UndefOr[scala.Boolean] = js.undefined,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType = null,
    transition: scala.Int | scala.Double = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): TileJSONOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[TileJSONOptions]
  }
}

