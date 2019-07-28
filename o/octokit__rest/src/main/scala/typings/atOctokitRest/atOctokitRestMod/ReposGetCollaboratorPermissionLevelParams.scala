package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCollaboratorPermissionLevelParams extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposGetCollaboratorPermissionLevelParams {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposGetCollaboratorPermissionLevelParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelParams]
  }
}

