package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsGetMembershipForUserResponseData extends StObject {
  
  var organization: Description = js.native
  
  var organization_url: String = js.native
  
  var role: String = js.native
  
  var state: String = js.native
  
  var url: String = js.native
  
  var user: Avatarurl = js.native
}
object OrgsGetMembershipForUserResponseData {
  
  @scala.inline
  def apply(
    organization: Description,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: Avatarurl
  ): OrgsGetMembershipForUserResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetMembershipForUserResponseData]
  }
  
  @scala.inline
  implicit class OrgsGetMembershipForUserResponseDataMutableBuilder[Self <: OrgsGetMembershipForUserResponseData] (val x: Self) extends AnyVal {
    
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
