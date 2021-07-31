package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetByUsernameEndpoint extends StObject {
  
  var username: String
}
object UsersGetByUsernameEndpoint {
  
  @scala.inline
  def apply(username: String): UsersGetByUsernameEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetByUsernameEndpoint]
  }
  
  @scala.inline
  implicit class UsersGetByUsernameEndpointMutableBuilder[Self <: UsersGetByUsernameEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
