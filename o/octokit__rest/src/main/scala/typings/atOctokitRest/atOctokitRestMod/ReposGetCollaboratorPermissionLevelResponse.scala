package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCollaboratorPermissionLevelResponse extends js.Object {
  var permission: String
  var user: ReposGetCollaboratorPermissionLevelResponseUser
}

object ReposGetCollaboratorPermissionLevelResponse {
  @scala.inline
  def apply(permission: String, user: ReposGetCollaboratorPermissionLevelResponseUser): ReposGetCollaboratorPermissionLevelResponse = {
    val __obj = js.Dynamic.literal(permission = permission, user = user)
  
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelResponse]
  }
}

