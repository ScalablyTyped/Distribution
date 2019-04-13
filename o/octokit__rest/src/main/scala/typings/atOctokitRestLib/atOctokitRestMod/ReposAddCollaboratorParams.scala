package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaboratorParams extends js.Object {
  var owner: java.lang.String
  /**
    * The permission to grant the collaborator. **Only valid on organization-owned repositories.** Can be one of:  ,* \* `pull` - can pull, but not push to or administer this repository.  ,* \* `push` - can pull and push, but not administer this repository.  ,* \* `admin` - can pull, push and administer this repository.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  var repo: java.lang.String
  var username: java.lang.String
}

object ReposAddCollaboratorParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    username: java.lang.String,
    permission: atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin = null
  ): ReposAddCollaboratorParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddCollaboratorParams]
  }
}

