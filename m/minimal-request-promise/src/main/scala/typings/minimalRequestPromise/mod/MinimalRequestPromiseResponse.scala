package typings.minimalRequestPromise.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimalRequestPromiseResponse extends js.Object {
  var body: String
  var headers: js.Array[IncomingHttpHeaders]
  var statusCode: Double
  var statusMessage: String
}

object MinimalRequestPromiseResponse {
  @scala.inline
  def apply(body: String, headers: js.Array[IncomingHttpHeaders], statusCode: Double, statusMessage: String): MinimalRequestPromiseResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalRequestPromiseResponse]
  }
}

