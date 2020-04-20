package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembershipsResponseItem]
  }
}

