package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsReviewUserPermissionLevelResponse extends js.Object {
  var permission: java.lang.String
  var user: ProjectsReviewUserPermissionLevelResponseUser
}

object ProjectsReviewUserPermissionLevelResponse {
  @scala.inline
  def apply(permission: java.lang.String, user: ProjectsReviewUserPermissionLevelResponseUser): ProjectsReviewUserPermissionLevelResponse = {
    val __obj = js.Dynamic.literal(permission = permission, user = user)
  
    __obj.asInstanceOf[ProjectsReviewUserPermissionLevelResponse]
  }
}

