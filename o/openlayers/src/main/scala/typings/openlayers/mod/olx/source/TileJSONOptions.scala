package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileJSONOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var jsonp: js.UndefOr[Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var transition: js.UndefOr[Double] = js.undefined
  var url: String
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object TileJSONOptions {
  @scala.inline
  def apply(
    url: String,
    attributions: AttributionLike = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    crossOrigin: String = null,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    transition: js.UndefOr[Double] = js.undefined,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): TileJSONOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileJSONOptions]
  }
}

