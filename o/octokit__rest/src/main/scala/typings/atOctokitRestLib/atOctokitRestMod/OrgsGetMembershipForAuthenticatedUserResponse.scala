package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetMembershipForAuthenticatedUserResponse extends js.Object {
  var organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization
  var organization_url: java.lang.String
  var role: java.lang.String
  var state: java.lang.String
  var url: java.lang.String
  var user: OrgsGetMembershipForAuthenticatedUserResponseUser
}

object OrgsGetMembershipForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization,
    organization_url: java.lang.String,
    role: java.lang.String,
    state: java.lang.String,
    url: java.lang.String,
    user: OrgsGetMembershipForAuthenticatedUserResponseUser
  ): OrgsGetMembershipForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserResponse]
  }
}

