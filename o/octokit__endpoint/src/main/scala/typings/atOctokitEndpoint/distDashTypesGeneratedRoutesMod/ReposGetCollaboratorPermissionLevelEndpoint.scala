package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCollaboratorPermissionLevelEndpoint extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposGetCollaboratorPermissionLevelEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelEndpoint]
  }
}

