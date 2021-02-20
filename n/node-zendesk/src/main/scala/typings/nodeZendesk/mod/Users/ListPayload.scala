package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPayload extends PaginablePayload {
  
  var users: js.Array[ResponseModel] = js.native
}
object ListPayload {
  
  @scala.inline
  def apply(count: Double, users: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit class ListPayloadMutableBuilder[Self <: ListPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[ResponseModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: ResponseModel*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
