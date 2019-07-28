package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembershipEndpoint extends js.Object {
  var org: String
  var role: js.UndefOr[String] = js.undefined
  var username: String
}

object OrgsAddOrUpdateMembershipEndpoint {
  @scala.inline
  def apply(org: String, username: String, role: String = null): OrgsAddOrUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(org = org, username = username)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[OrgsAddOrUpdateMembershipEndpoint]
  }
}

