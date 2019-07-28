package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsRemoveCollaboratorEndpoint extends js.Object {
  var project_id: Double
  var username: String
}

object ProjectsRemoveCollaboratorEndpoint {
  @scala.inline
  def apply(project_id: Double, username: String): ProjectsRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id, username = username)
  
    __obj.asInstanceOf[ProjectsRemoveCollaboratorEndpoint]
  }
}

