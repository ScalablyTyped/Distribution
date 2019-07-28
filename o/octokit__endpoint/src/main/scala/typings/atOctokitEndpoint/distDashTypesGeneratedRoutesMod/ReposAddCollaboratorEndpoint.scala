package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaboratorEndpoint extends js.Object {
  var owner: String
  var permission: js.UndefOr[String] = js.undefined
  var repo: String
  var username: String
}

object ReposAddCollaboratorEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, username: String, permission: String = null): ReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ReposAddCollaboratorEndpoint]
  }
}

