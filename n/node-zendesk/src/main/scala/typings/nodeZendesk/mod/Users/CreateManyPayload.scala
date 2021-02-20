package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateManyPayload extends StObject {
  
  var users: js.Array[CreateModel] = js.native
}
object CreateManyPayload {
  
  @scala.inline
  def apply(users: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManyPayload]
  }
  
  @scala.inline
  implicit class CreateManyPayloadMutableBuilder[Self <: CreateManyPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[CreateModel]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: CreateModel*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
