package typings.poi.poiMod.ConfigNs

import typings.poi.poiMod.ConfigNs.CssNs.LoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css extends js.Object {
  var extract: js.UndefOr[Boolean] = js.undefined
  var loaderOptions: js.UndefOr[LoaderOptions] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object Css {
  @scala.inline
  def apply(
    extract: js.UndefOr[Boolean] = js.undefined,
    loaderOptions: LoaderOptions = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): Css = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extract)) __obj.updateDynamic("extract")(extract)
    if (loaderOptions != null) __obj.updateDynamic("loaderOptions")(loaderOptions)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[Css]
  }
}

