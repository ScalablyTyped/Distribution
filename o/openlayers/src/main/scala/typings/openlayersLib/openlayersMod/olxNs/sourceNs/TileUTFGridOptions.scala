package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileUTFGridOptions extends js.Object {
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  var preemptive: js.UndefOr[scala.Boolean] = js.undefined
  var tileJSON: js.UndefOr[TileJSON] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TileUTFGridOptions {
  @scala.inline
  def apply(
    jsonp: js.UndefOr[scala.Boolean] = js.undefined,
    preemptive: js.UndefOr[scala.Boolean] = js.undefined,
    tileJSON: TileJSON = null,
    url: java.lang.String = null
  ): TileUTFGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (!js.isUndefined(preemptive)) __obj.updateDynamic("preemptive")(preemptive)
    if (tileJSON != null) __obj.updateDynamic("tileJSON")(tileJSON)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TileUTFGridOptions]
  }
}

