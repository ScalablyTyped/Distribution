package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManyPayload extends StObject {
  
  var users: js.Array[CreateModel]
}
object CreateManyPayload {
  
  inline def apply(users: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManyPayload]
  }
  
  extension [Self <: CreateManyPayload](x: Self) {
    
    inline def setUsers(value: js.Array[CreateModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: CreateModel*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
