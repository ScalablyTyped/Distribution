package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembershipsResponseItem extends js.Object {
  var organization: OrgsListMembershipsResponseItemOrganization
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: OrgsListMembershipsResponseItemUser
}

object OrgsListMembershipsResponseItem {
  @scala.inline
  def apply(
    organization: OrgsListMembershipsResponseItemOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsListMembershipsResponseItemUser
  ): OrgsListMembershipsResponseItem = {
    val __obj = js.Dynamic.literal(organization = organization, organization_url = organization_url, role = role, state = state, url = url, user = user)
  
    __obj.asInstanceOf[OrgsListMembershipsResponseItem]
  }
}

