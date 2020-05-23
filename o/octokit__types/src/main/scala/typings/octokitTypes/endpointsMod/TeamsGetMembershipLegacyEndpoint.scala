package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipLegacyEndpoint extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMembershipLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMembershipLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipLegacyEndpoint]
  }
}

