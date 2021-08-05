package typings.nodeZendesk.mod.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePayload extends StObject {
  
  val request: ResponseModel
}
object ResponsePayload {
  
  inline def apply(request: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  
  extension [Self <: ResponsePayload](x: Self) {
    
    inline def setRequest(value: ResponseModel): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
