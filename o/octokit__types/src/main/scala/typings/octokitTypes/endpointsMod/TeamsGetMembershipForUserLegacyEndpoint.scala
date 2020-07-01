package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipForUserLegacyEndpoint extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMembershipForUserLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipForUserLegacyEndpoint]
  }
}

