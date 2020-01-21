package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMemberLegacyParams extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMemberLegacyParams {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMemberLegacyParams = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetMemberLegacyParams]
  }
}

