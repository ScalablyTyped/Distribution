package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  /**
    * Query parameters buiding and matching options, see
    * https://github.com/troch/search-params#options
    */
  var queryParams: js.UndefOr[IOptions] = js.undefined
  /**
    * Specifies the method used to encode URL parameters:
    *   - `'default': `encodeURIComponent` and `decodeURIComponent`
    *      are used but some characters to encode and decode URL parameters,
    *      but some characters are preserved when encoding
    *      (sub-delimiters: `+`, `:`, `'`, `!`, `,`, `;`, `'*'`).
    *   - `'uriComponent'`: use `encodeURIComponent` and `decodeURIComponent`
    *      for encoding and decoding URL parameters.
    *   - `'uri'`: use `encodeURI` and `decodeURI for encoding amd decoding
    *      URL parameters.
    *   - `'none'`: no encoding or decoding is performed
    *   - `'legacy'`: the approach for version 5.x and below (not recoomended)
    */
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(queryParams: IOptions = null, urlParamsEncoding: URLParamsEncodingType = null): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (urlParamsEncoding != null) __obj.updateDynamic("urlParamsEncoding")(urlParamsEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

