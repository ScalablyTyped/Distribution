package typings.octokitTypes.requestOptionsMod

import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: RequestHeaders
  var method: RequestMethod
  var request: js.UndefOr[RequestRequestOptions] = js.undefined
  var url: Url
}

object RequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: RequestMethod,
    url: Url,
    body: js.Any = null,
    request: RequestRequestOptions = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

