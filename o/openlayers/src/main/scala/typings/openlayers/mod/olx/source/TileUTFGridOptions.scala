package typings.openlayers.mod.olx.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileUTFGridOptions extends js.Object {
  var jsonp: js.UndefOr[Boolean] = js.undefined
  var preemptive: js.UndefOr[Boolean] = js.undefined
  var tileJSON: js.UndefOr[TileJSON] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object TileUTFGridOptions {
  @scala.inline
  def apply(
    jsonp: js.UndefOr[Boolean] = js.undefined,
    preemptive: js.UndefOr[Boolean] = js.undefined,
    tileJSON: TileJSON = null,
    url: String = null
  ): TileUTFGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptive)) __obj.updateDynamic("preemptive")(preemptive.get.asInstanceOf[js.Any])
    if (tileJSON != null) __obj.updateDynamic("tileJSON")(tileJSON.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileUTFGridOptions]
  }
}

