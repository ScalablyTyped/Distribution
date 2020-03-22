package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathBuildOptions extends PathOptions {
  var ignoreConstraints: js.UndefOr[Boolean] = js.undefined
  var ignoreSearch: js.UndefOr[Boolean] = js.undefined
}

object PathBuildOptions {
  @scala.inline
  def apply(
    ignoreConstraints: js.UndefOr[Boolean] = js.undefined,
    ignoreSearch: js.UndefOr[Boolean] = js.undefined,
    queryParams: IOptions = null,
    urlParamsEncoding: URLParamsEncodingType = null
  ): PathBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreConstraints)) __obj.updateDynamic("ignoreConstraints")(ignoreConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSearch)) __obj.updateDynamic("ignoreSearch")(ignoreSearch.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBuildOptions]
  }
}

