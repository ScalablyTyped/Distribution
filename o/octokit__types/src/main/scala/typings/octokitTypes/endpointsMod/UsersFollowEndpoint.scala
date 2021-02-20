package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersFollowEndpoint extends StObject {
  
  var username: String = js.native
}
object UsersFollowEndpoint {
  
  @scala.inline
  def apply(username: String): UsersFollowEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersFollowEndpoint]
  }
  
  @scala.inline
  implicit class UsersFollowEndpointMutableBuilder[Self <: UsersFollowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
