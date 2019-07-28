package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveCollaboratorParams extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposRemoveCollaboratorParams {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposRemoveCollaboratorParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposRemoveCollaboratorParams]
  }
}

