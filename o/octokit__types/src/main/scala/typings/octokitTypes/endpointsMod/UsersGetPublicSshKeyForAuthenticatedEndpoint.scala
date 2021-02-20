package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersGetPublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var key_id: Double = js.native
}
object UsersGetPublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(key_id: Double): UsersGetPublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetPublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersGetPublicSshKeyForAuthenticatedEndpointMutableBuilder[Self <: UsersGetPublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
