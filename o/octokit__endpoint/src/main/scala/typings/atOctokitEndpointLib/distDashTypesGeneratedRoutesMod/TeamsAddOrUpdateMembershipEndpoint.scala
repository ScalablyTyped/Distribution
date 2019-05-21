package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateMembershipEndpoint extends js.Object {
  var role: js.UndefOr[java.lang.String] = js.undefined
  var team_id: scala.Double
  var username: java.lang.String
}

object TeamsAddOrUpdateMembershipEndpoint {
  @scala.inline
  def apply(team_id: scala.Double, username: java.lang.String, role: java.lang.String = null): TeamsAddOrUpdateMembershipEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipEndpoint]
  }
}

