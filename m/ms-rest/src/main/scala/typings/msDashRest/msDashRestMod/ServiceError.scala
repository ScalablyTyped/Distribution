package typings.msDashRest.msDashRestMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceError extends Error {
  var body: js.Any
  var request: WebResource
  var response: typings.node.httpMod.IncomingMessage
  var statusCode: Double
}

object ServiceError {
  @scala.inline
  def apply(
    body: js.Any,
    message: String,
    name: String,
    request: WebResource,
    response: typings.node.httpMod.IncomingMessage,
    statusCode: Double,
    stack: String = null
  ): ServiceError = {
    val __obj = js.Dynamic.literal(body = body, message = message, name = name, request = request, response = response, statusCode = statusCode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ServiceError]
  }
}

