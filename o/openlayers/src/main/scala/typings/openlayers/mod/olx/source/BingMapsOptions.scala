package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var imagerySet: String
  var key: String
  var maxZoom: js.UndefOr[Double] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object BingMapsOptions {
  @scala.inline
  def apply(
    imagerySet: String,
    key: String,
    cacheSize: js.UndefOr[Double] = js.undefined,
    culture: String = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): BingMapsOptions = {
    val __obj = js.Dynamic.literal(imagerySet = imagerySet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingMapsOptions]
  }
}

