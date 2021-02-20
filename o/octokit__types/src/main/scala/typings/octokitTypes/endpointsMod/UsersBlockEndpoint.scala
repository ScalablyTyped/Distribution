package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersBlockEndpoint extends StObject {
  
  var username: String = js.native
}
object UsersBlockEndpoint {
  
  @scala.inline
  def apply(username: String): UsersBlockEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersBlockEndpoint]
  }
  
  @scala.inline
  implicit class UsersBlockEndpointMutableBuilder[Self <: UsersBlockEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
