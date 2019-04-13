package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveCollaboratorParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var username: java.lang.String
}

object ReposRemoveCollaboratorParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, username: java.lang.String): ReposRemoveCollaboratorParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposRemoveCollaboratorParams]
  }
}

