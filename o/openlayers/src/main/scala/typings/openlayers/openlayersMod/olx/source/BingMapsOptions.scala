package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.Tile
import typings.openlayers.openlayersMod.TileLoadFunctionType
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
    cacheSize: Int | Double = null,
    culture: String = null,
    maxZoom: Int | Double = null,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): BingMapsOptions = {
    val __obj = js.Dynamic.literal(imagerySet = imagerySet, key = key)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[BingMapsOptions]
  }
}

