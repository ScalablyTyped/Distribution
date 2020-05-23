package typings.poi.mod.Config

import typings.poi.mod.Config.Css.LoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css_ extends js.Object {
  var extract: js.UndefOr[Boolean] = js.undefined
  var loaderOptions: js.UndefOr[LoaderOptions] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object Css_ {
  @scala.inline
  def apply(
    extract: js.UndefOr[Boolean] = js.undefined,
    loaderOptions: LoaderOptions = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): Css_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extract)) __obj.updateDynamic("extract")(extract.get.asInstanceOf[js.Any])
    if (loaderOptions != null) __obj.updateDynamic("loaderOptions")(loaderOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css_]
  }
}

