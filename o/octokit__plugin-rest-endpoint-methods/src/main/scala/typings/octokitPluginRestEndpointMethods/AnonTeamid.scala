package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamid extends js.Object {
  var team_id: AnonRequired
  var username: AnonRequired
}

object AnonTeamid {
  @scala.inline
  def apply(team_id: AnonRequired, username: AnonRequired): AnonTeamid = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamid]
  }
}

