package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectidTeamid extends js.Object {
  var project_id: AnonRequired
  var team_id: AnonRequired
}

object AnonProjectidTeamid {
  @scala.inline
  def apply(project_id: AnonRequired, team_id: AnonRequired): AnonProjectidTeamid = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProjectidTeamid]
  }
}

