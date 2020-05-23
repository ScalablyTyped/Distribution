package typings.octokitRequestError.typesMod

import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorOptions extends js.Object {
  var headers: js.UndefOr[ResponseHeaders] = js.undefined
  var request: RequestOptions
}

object RequestErrorOptions {
  @scala.inline
  def apply(request: RequestOptions, headers: ResponseHeaders = null): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorOptions]
  }
}

