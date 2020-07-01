package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsGetPermissionForUserResponseData extends js.Object {
  var permission: String
  var user: Eventsurl
}

object ProjectsGetPermissionForUserResponseData {
  @scala.inline
  def apply(permission: String, user: Eventsurl): ProjectsGetPermissionForUserResponseData = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetPermissionForUserResponseData]
  }
}

