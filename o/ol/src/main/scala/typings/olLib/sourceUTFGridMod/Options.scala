package typings
package olLib.sourceUTFGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  var preemptive: js.UndefOr[scala.Boolean] = js.undefined
  var tileJSON: js.UndefOr[olLib.sourceTileJSONMod.Config] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    jsonp: js.UndefOr[scala.Boolean] = js.undefined,
    preemptive: js.UndefOr[scala.Boolean] = js.undefined,
    tileJSON: olLib.sourceTileJSONMod.Config = null,
    url: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (!js.isUndefined(preemptive)) __obj.updateDynamic("preemptive")(preemptive)
    if (tileJSON != null) __obj.updateDynamic("tileJSON")(tileJSON)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Options]
  }
}

