package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipInOrgResponse extends js.Object {
  var role: String
  var state: String
  var url: String
}

object TeamsAddOrUpdateMembershipInOrgResponse {
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsAddOrUpdateMembershipInOrgResponse = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipInOrgResponse]
  }
}

