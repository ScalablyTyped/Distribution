package typings.ol.sourceUTFGridMod

import typings.ol.sourceTileJSONMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var jsonp: js.UndefOr[Boolean] = js.undefined
  var preemptive: js.UndefOr[Boolean] = js.undefined
  var tileJSON: js.UndefOr[Config] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    jsonp: js.UndefOr[Boolean] = js.undefined,
    preemptive: js.UndefOr[Boolean] = js.undefined,
    tileJSON: Config = null,
    url: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptive)) __obj.updateDynamic("preemptive")(preemptive.asInstanceOf[js.Any])
    if (tileJSON != null) __obj.updateDynamic("tileJSON")(tileJSON.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

