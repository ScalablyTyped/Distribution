package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipInOrgResponseData extends js.Object {
  var role: String
  var state: String
  var url: String
}

object TeamsAddOrUpdateMembershipInOrgResponseData {
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsAddOrUpdateMembershipInOrgResponseData = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipInOrgResponseData]
  }
}

