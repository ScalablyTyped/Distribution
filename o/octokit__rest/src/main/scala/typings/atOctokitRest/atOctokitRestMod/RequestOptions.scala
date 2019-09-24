package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.Anon_Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  /**
    * Media type options, see {@link https://developer.github.com/v3/media/|GitHub Developer Guide}
    */
  var mediaType: js.UndefOr[Anon_Format] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var request: js.UndefOr[OctokitRequestOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: RequestHeaders = null,
    mediaType: Anon_Format = null,
    method: RequestMethod = null,
    request: OctokitRequestOptions = null,
    url: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (method != null) __obj.updateDynamic("method")(method)
    if (request != null) __obj.updateDynamic("request")(request)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestOptions]
  }
}

