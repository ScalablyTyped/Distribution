package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersDeletePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var key_id: Double
}
object UsersDeletePublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(key_id: Double): UsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersDeletePublicSshKeyForAuthenticatedEndpointMutableBuilder[Self <: UsersDeletePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
