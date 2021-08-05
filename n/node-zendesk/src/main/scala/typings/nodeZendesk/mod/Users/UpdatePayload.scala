package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePayload extends StObject {
  
  var user: UpdateModel
}
object UpdatePayload {
  
  inline def apply(user: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePayload]
  }
  
  extension [Self <: UpdatePayload](x: Self) {
    
    inline def setUser(value: UpdateModel): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
