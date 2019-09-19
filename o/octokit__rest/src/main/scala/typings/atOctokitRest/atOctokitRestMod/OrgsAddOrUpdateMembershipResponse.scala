package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipResponse]
  }
}

