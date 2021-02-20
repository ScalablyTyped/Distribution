package typings.msRest.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceError extends Error {
  
  var body: js.Any = js.native
  
  var request: WebResource = js.native
  
  var response: typings.node.httpMod.IncomingMessage = js.native
  
  var statusCode: Double = js.native
}
object ServiceError {
  
  @scala.inline
  def apply(
    body: js.Any,
    message: String,
    name: String,
    request: WebResource,
    response: typings.node.httpMod.IncomingMessage,
    statusCode: Double
  ): ServiceError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceError]
  }
  
  @scala.inline
  implicit class ServiceErrorMutableBuilder[Self <: ServiceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: WebResource): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: typings.node.httpMod.IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
