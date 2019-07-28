package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsUpdateMembershipResponse]
  }
}

