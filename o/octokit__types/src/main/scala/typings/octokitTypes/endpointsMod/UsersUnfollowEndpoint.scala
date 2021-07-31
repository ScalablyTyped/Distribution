package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersUnfollowEndpoint extends StObject {
  
  var username: String
}
object UsersUnfollowEndpoint {
  
  @scala.inline
  def apply(username: String): UsersUnfollowEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersUnfollowEndpoint]
  }
  
  @scala.inline
  implicit class UsersUnfollowEndpointMutableBuilder[Self <: UsersUnfollowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
