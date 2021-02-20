package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersUnblockEndpoint extends StObject {
  
  var username: String = js.native
}
object UsersUnblockEndpoint {
  
  @scala.inline
  def apply(username: String): UsersUnblockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUnblockEndpoint]
  }
  
  @scala.inline
  implicit class UsersUnblockEndpointMutableBuilder[Self <: UsersUnblockEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
