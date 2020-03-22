package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathTestOptions extends PathOptions {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
}

object PathTestOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    queryParams: IOptions = null,
    strictTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    urlParamsEncoding: URLParamsEncodingType = null
  ): PathTestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(strictTrailingSlash)) __obj.updateDynamic("strictTrailingSlash")(strictTrailingSlash.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTestOptions]
  }
}

