package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPermissionProjectid extends js.Object {
  var permission: AnonEnum
  var project_id: AnonRequired
  var team_id: AnonRequired
}

object AnonPermissionProjectid {
  @scala.inline
  def apply(permission: AnonEnum, project_id: AnonRequired, team_id: AnonRequired): AnonPermissionProjectid = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPermissionProjectid]
  }
}

