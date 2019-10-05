package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.Tile
import typings.openlayers.openlayersMod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StamenOptions extends js.Object {
  var cacheSize: js.UndefOr[Double] = js.undefined
  var layer: String
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object StamenOptions {
  @scala.inline
  def apply(
    layer: String,
    cacheSize: Int | Double = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    url: String = null
  ): StamenOptions = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StamenOptions]
  }
}

