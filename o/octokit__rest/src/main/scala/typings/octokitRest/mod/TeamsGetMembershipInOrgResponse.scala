package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipInOrgResponse extends js.Object {
  var role: String
  var state: String
  var url: String
}

object TeamsGetMembershipInOrgResponse {
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsGetMembershipInOrgResponse = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetMembershipInOrgResponse]
  }
}

