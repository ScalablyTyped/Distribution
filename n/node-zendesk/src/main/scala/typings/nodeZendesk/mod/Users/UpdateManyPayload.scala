package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManyPayload extends StObject {
  
  var users: js.Array[UpdateModel]
}
object UpdateManyPayload {
  
  inline def apply(users: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyPayload]
  }
  
  extension [Self <: UpdateManyPayload](x: Self) {
    
    inline def setUsers(value: js.Array[UpdateModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: UpdateModel*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
