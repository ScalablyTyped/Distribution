package typings.atOctokitRequestDashError.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorOptions extends js.Object {
  var headers: ResponseHeaders
  var request: RequestOptions
}

object RequestErrorOptions {
  @scala.inline
  def apply(headers: ResponseHeaders, request: RequestOptions): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(headers = headers, request = request)
  
    __obj.asInstanceOf[RequestErrorOptions]
  }
}

