package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathOptions extends js.Object {
  /**
    * Query parameters buiding and matching options, see
    * https://github.com/troch/search-params#options
    */
  var queryParams: js.UndefOr[IOptions] = js.native
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
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
}

object PathOptions {
  @scala.inline
  def apply(): PathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOptions]
  }
  @scala.inline
  implicit class PathOptionsOps[Self <: PathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryParams(value: IOptions): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setUrlParamsEncoding(value: URLParamsEncodingType): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParamsEncoding: Self = this.set("urlParamsEncoding", js.undefined)
  }
  
}

