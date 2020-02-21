package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgPermission extends js.Object {
  var org: AnonRequired
  var permission: AnonEnum
  var project_id: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgPermission {
  @scala.inline
  def apply(org: AnonRequired, permission: AnonEnum, project_id: AnonRequired, team_slug: AnonRequired): AnonOrgPermission = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgPermission]
  }
}

