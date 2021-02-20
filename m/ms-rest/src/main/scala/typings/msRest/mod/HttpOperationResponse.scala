package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpOperationResponse[T] extends StObject {
  
  var body: T = js.native
  
  var request: WebResource = js.native
  
  var response: typings.node.httpMod.IncomingMessage = js.native
}
object HttpOperationResponse {
  
  @scala.inline
  def apply[T](body: T, request: WebResource, response: typings.node.httpMod.IncomingMessage): HttpOperationResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOperationResponse[T]]
  }
  
  @scala.inline
  implicit class HttpOperationResponseMutableBuilder[Self <: HttpOperationResponse[_], T] (val x: Self with HttpOperationResponse[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: WebResource): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: typings.node.httpMod.IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
