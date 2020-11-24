package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsGetMembershipForAuthenticatedUserResponseData extends js.Object {
  
  var organization: Description = js.native
  
  var organization_url: String = js.native
  
  var role: String = js.native
  
  var state: String = js.native
  
  var url: String = js.native
  
  var user: Avatarurl = js.native
}
object OrgsGetMembershipForAuthenticatedUserResponseData {
  
  @scala.inline
  def apply(
    organization: Description,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: Avatarurl
  ): OrgsGetMembershipForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserResponseData]
  }
  
  @scala.inline
  implicit class OrgsGetMembershipForAuthenticatedUserResponseDataOps[Self <: OrgsGetMembershipForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrganization(value: Description): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_url(value: String): Self = this.set("organization_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
