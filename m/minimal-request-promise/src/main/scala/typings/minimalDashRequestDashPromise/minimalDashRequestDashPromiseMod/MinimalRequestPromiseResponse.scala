package typings.minimalDashRequestDashPromise.minimalDashRequestDashPromiseMod

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
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[MinimalRequestPromiseResponse]
  }
}

