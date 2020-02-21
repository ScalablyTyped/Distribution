package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsReviewUserPermissionLevelResponse extends js.Object {
  var permission: String
  var user: ProjectsReviewUserPermissionLevelResponseUser
}

object ProjectsReviewUserPermissionLevelResponse {
  @scala.inline
  def apply(permission: String, user: ProjectsReviewUserPermissionLevelResponseUser): ProjectsReviewUserPermissionLevelResponse = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsReviewUserPermissionLevelResponse]
  }
}

