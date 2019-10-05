package typings.openapiDashTypes.openapiDashTypesMod.OpenAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
}

object Request {
  @scala.inline
  def apply(body: js.Any = null, headers: js.Object = null, params: js.Object = null, query: js.Object = null): Request = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Request]
  }
}

