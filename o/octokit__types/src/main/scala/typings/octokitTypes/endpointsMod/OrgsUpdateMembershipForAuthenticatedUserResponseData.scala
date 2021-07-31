package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsUpdateMembershipForAuthenticatedUserResponseData extends StObject {
  
  var organization: Description
  
  var organization_url: String
  
  var role: String
  
  var state: String
  
  var url: String
  
  var user: Avatarurl
}
object OrgsUpdateMembershipForAuthenticatedUserResponseData {
  
  @scala.inline
  def apply(
    organization: Description,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: Avatarurl
  ): OrgsUpdateMembershipForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  }
  
  @scala.inline
  implicit class OrgsUpdateMembershipForAuthenticatedUserResponseDataMutableBuilder[Self <: OrgsUpdateMembershipForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: Description): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_url(value: String): Self = StObject.set(x, "organization_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
