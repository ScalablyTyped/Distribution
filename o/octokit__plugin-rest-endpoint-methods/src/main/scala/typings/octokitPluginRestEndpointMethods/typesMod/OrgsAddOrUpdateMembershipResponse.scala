package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembershipResponse extends js.Object {
  var organization: OrgsAddOrUpdateMembershipResponseOrganization
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: OrgsAddOrUpdateMembershipResponseUser
}

object OrgsAddOrUpdateMembershipResponse {
  @scala.inline
  def apply(
    organization: OrgsAddOrUpdateMembershipResponseOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsAddOrUpdateMembershipResponseUser
  ): OrgsAddOrUpdateMembershipResponse = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipResponse]
  }
}

