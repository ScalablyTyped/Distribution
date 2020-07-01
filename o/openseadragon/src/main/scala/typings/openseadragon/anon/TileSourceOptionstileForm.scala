package typings.openseadragon.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openseadragon.openseadragon.TileSourceOptions & {  tileFormat ? :string} */
trait TileSourceOptionstileForm extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  var getTileUrl: js.UndefOr[js.Function3[/* l */ Double, /* x */ Double, /* y */ Double, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var maxLevel: js.UndefOr[Double] = js.undefined
  var minLevel: js.UndefOr[Double] = js.undefined
  var referenceStripThumbnailUrl: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var tileFormat: js.UndefOr[String] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileOverlap: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TileSourceOptionstileForm {
  @scala.inline
  def apply(
    ajaxHeaders: js.Object = null,
    ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined,
    getTileUrl: (/* l */ Double, /* x */ Double, /* y */ Double) => String = null,
    height: js.UndefOr[Double] = js.undefined,
    maxLevel: js.UndefOr[Double] = js.undefined,
    minLevel: js.UndefOr[Double] = js.undefined,
    referenceStripThumbnailUrl: String = null,
    success: /* event */ Event => Unit = null,
    tileFormat: String = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileOverlap: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): TileSourceOptionstileForm = {
    val __obj = js.Dynamic.literal()
    if (ajaxHeaders != null) __obj.updateDynamic("ajaxHeaders")(ajaxHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxWithCredentials)) __obj.updateDynamic("ajaxWithCredentials")(ajaxWithCredentials.get.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(js.Any.fromFunction3(getTileUrl))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLevel)) __obj.updateDynamic("maxLevel")(maxLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLevel)) __obj.updateDynamic("minLevel")(minLevel.get.asInstanceOf[js.Any])
    if (referenceStripThumbnailUrl != null) __obj.updateDynamic("referenceStripThumbnailUrl")(referenceStripThumbnailUrl.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (tileFormat != null) __obj.updateDynamic("tileFormat")(tileFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileOverlap)) __obj.updateDynamic("tileOverlap")(tileOverlap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileSourceOptionstileForm]
  }
}

