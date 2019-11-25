package typings.msDashRest.msDashRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOperationResponse[T] extends js.Object {
  var body: T
  var request: WebResource
  var response: typings.node.httpMod.IncomingMessage
}

object HttpOperationResponse {
  @scala.inline
  def apply[T](body: T, request: WebResource, response: typings.node.httpMod.IncomingMessage): HttpOperationResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpOperationResponse[T]]
  }
}

