package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaborator_Options extends js.Object {
  var owner: java.lang.String
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
  var username: java.lang.String
}

object ReposAddCollaborator_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    username: java.lang.String,
    permission: java.lang.String = null
  ): ReposAddCollaborator_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    __obj.asInstanceOf[ReposAddCollaborator_Options]
  }
}

