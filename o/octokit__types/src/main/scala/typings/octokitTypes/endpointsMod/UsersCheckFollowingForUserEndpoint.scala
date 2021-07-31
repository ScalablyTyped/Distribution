package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersCheckFollowingForUserEndpoint extends StObject {
  
  var target_user: String
  
  var username: String
}
object UsersCheckFollowingForUserEndpoint {
  
  @scala.inline
  def apply(target_user: String, username: String): UsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckFollowingForUserEndpoint]
  }
  
  @scala.inline
  implicit class UsersCheckFollowingForUserEndpointMutableBuilder[Self <: UsersCheckFollowingForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget_user(value: String): Self = StObject.set(x, "target_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
