package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapQuestOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.undefined
  var layer: String
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MapQuestOptions {
  @scala.inline
  def apply(
    layer: String,
    cacheSize: js.UndefOr[Double] = js.undefined,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    url: String = null
  ): MapQuestOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapQuestOptions]
  }
}

