package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPermission extends js.Object {
  var permission: AnonEnum
  var project_id: AnonRequired
  var username: AnonRequired
}

object AnonPermission {
  @scala.inline
  def apply(permission: AnonEnum, project_id: AnonRequired, username: AnonRequired): AnonPermission = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPermission]
  }
}

