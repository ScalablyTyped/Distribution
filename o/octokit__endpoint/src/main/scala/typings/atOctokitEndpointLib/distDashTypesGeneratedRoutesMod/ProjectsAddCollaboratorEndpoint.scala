package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsAddCollaboratorEndpoint extends js.Object {
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var project_id: scala.Double
  var username: java.lang.String
}

object ProjectsAddCollaboratorEndpoint {
  @scala.inline
  def apply(project_id: scala.Double, username: java.lang.String, permission: java.lang.String = null): ProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ProjectsAddCollaboratorEndpoint]
  }
}

