package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipResponse extends js.Object {
  var organization: OrgsUpdateMembershipResponseOrganization
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: OrgsUpdateMembershipResponseUser
}

object OrgsUpdateMembershipResponse {
  @scala.inline
  def apply(
    organization: OrgsUpdateMembershipResponseOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsUpdateMembershipResponseUser
  ): OrgsUpdateMembershipResponse = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsUpdateMembershipResponse]
  }
}

