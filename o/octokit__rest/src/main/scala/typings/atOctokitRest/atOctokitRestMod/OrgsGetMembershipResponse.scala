package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipResponse extends js.Object {
  var organization: OrgsGetMembershipResponseOrganization
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: OrgsGetMembershipResponseUser
}

object OrgsGetMembershipResponse {
  @scala.inline
  def apply(
    organization: OrgsGetMembershipResponseOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsGetMembershipResponseUser
  ): OrgsGetMembershipResponse = {
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsGetMembershipResponse]
  }
}

