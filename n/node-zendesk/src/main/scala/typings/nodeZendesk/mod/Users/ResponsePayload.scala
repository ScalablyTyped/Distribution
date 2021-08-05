package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePayload extends StObject {
  
  var user: ResponseModel
}
object ResponsePayload {
  
  inline def apply(user: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  
  extension [Self <: ResponsePayload](x: Self) {
    
    inline def setUser(value: ResponseModel): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
