package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCollaboratorPermissionLevelResponseData extends js.Object {
  var permission: String
  var user: Eventsurl
}

object ReposGetCollaboratorPermissionLevelResponseData {
  @scala.inline
  def apply(permission: String, user: Eventsurl): ReposGetCollaboratorPermissionLevelResponseData = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelResponseData]
  }
}

