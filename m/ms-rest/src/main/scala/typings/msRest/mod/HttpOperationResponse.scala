package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpOperationResponse[T] extends StObject {
  
  var body: T
  
  var request: WebResource
  
  var response: typings.node.httpMod.IncomingMessage
}
object HttpOperationResponse {
  
  inline def apply[T](body: T, request: WebResource, response: typings.node.httpMod.IncomingMessage): HttpOperationResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOperationResponse[T]]
  }
  
  extension [Self <: HttpOperationResponse[?], T](x: Self & HttpOperationResponse[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: WebResource): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: typings.node.httpMod.IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
