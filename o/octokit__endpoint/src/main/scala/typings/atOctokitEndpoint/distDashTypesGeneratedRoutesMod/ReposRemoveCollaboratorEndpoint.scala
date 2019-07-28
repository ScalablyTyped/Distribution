package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveCollaboratorEndpoint extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposRemoveCollaboratorEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposRemoveCollaboratorEndpoint]
  }
}

