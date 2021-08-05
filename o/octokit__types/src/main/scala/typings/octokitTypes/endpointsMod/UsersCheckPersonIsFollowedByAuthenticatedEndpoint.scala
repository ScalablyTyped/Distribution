package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersCheckPersonIsFollowedByAuthenticatedEndpoint extends StObject {
  
  var username: String
}
object UsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  
  inline def apply(username: String): UsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersCheckPersonIsFollowedByAuthenticatedEndpoint](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
