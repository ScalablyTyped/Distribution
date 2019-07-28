package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsAddCollaboratorEndpoint extends js.Object {
  var permission: js.UndefOr[String] = js.undefined
  var project_id: Double
  var username: String
}

object ProjectsAddCollaboratorEndpoint {
  @scala.inline
  def apply(project_id: Double, username: String, permission: String = null): ProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ProjectsAddCollaboratorEndpoint]
  }
}

