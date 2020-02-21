package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsRemoveCollaboratorParams extends js.Object {
  var project_id: Double
  var username: String
}

object ProjectsRemoveCollaboratorParams {
  @scala.inline
  def apply(project_id: Double, username: String): ProjectsRemoveCollaboratorParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsRemoveCollaboratorParams]
  }
}

