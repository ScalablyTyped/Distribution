package typings
package atOctokitRequestDashErrorLib.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: RequestHeaders
  var method: Method
  var request: js.UndefOr[EndpointRequestOptions] = js.undefined
  var url: Url
}

object RequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: Method,
    url: Url,
    body: js.Any = null,
    request: EndpointRequestOptions = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers, method = method, url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[RequestOptions]
  }
}

