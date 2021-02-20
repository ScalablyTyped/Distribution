package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsRemovePublicMembershipForAuthenticatedUserEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var username: String = js.native
}
object OrgsRemovePublicMembershipForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(org_ : String, username: String): OrgsRemovePublicMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemovePublicMembershipForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class OrgsRemovePublicMembershipForAuthenticatedUserEndpointMutableBuilder[Self <: OrgsRemovePublicMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
