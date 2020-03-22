package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathPartialTestOptions extends PathOptions {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var delimited: js.UndefOr[Boolean] = js.undefined
}

object PathPartialTestOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    delimited: js.UndefOr[Boolean] = js.undefined,
    queryParams: IOptions = null,
    urlParamsEncoding: URLParamsEncodingType = null
  ): PathPartialTestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPartialTestOptions]
  }
}

