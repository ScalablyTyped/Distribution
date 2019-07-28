package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipForAuthenticatedUserResponse extends js.Object {
  var organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: OrgsGetMembershipForAuthenticatedUserResponseUser
}

object OrgsGetMembershipForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsGetMembershipForAuthenticatedUserResponseUser
  ): OrgsGetMembershipForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserResponse]
  }
}

