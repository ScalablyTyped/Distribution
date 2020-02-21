package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRole extends js.Object {
  var role: AnonEnum
  var team_id: AnonRequired
  var username: AnonRequired
}

object AnonRole {
  @scala.inline
  def apply(role: AnonEnum, team_id: AnonRequired, username: AnonRequired): AnonRole = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRole]
  }
}

