package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsReviewUserPermissionLevelParams extends js.Object {
  var project_id: Double
  var username: String
}

object ProjectsReviewUserPermissionLevelParams {
  @scala.inline
  def apply(project_id: Double, username: String): ProjectsReviewUserPermissionLevelParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsReviewUserPermissionLevelParams]
  }
}

