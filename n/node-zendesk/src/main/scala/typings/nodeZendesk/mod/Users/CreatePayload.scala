package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayload extends StObject {
  
  var user: CreateModel
}
object CreatePayload {
  
  inline def apply(user: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  
  extension [Self <: CreatePayload](x: Self) {
    
    inline def setUser(value: CreateModel): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
