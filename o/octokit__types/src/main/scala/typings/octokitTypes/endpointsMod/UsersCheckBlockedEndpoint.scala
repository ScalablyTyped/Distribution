package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersCheckBlockedEndpoint extends StObject {
  
  var username: String
}
object UsersCheckBlockedEndpoint {
  
  @scala.inline
  def apply(username: String): UsersCheckBlockedEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckBlockedEndpoint]
  }
  
  @scala.inline
  implicit class UsersCheckBlockedEndpointMutableBuilder[Self <: UsersCheckBlockedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
