package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipLegacyParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMembershipLegacyParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMembershipLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetMembershipLegacyParams]
  }
}

