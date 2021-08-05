package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPayload
  extends StObject
     with PaginablePayload {
  
  var users: js.Array[ResponseModel]
}
object ListPayload {
  
  inline def apply(count: Double, users: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[ListPayload]
  }
  
  extension [Self <: ListPayload](x: Self) {
    
    inline def setUsers(value: js.Array[ResponseModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: ResponseModel*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
