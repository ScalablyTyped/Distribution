package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsRemoveCollaboratorParams extends js.Object {
  var project_id: scala.Double
  var username: java.lang.String
}

object ProjectsRemoveCollaboratorParams {
  @scala.inline
  def apply(project_id: scala.Double, username: java.lang.String): ProjectsRemoveCollaboratorParams = {
    val __obj = js.Dynamic.literal(project_id = project_id, username = username)
  
    __obj.asInstanceOf[ProjectsRemoveCollaboratorParams]
  }
}

