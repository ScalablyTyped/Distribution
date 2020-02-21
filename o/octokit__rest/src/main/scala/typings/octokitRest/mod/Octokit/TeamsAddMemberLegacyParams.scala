package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberLegacyParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsAddMemberLegacyParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsAddMemberLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberLegacyParams]
  }
}

