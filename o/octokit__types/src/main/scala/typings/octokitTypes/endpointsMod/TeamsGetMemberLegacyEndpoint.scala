package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMemberLegacyEndpoint extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMemberLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMemberLegacyEndpoint]
  }
}

