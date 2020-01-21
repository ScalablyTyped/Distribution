package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.admin
import typings.octokitRest.octokitRestStrings.pull
import typings.octokitRest.octokitRestStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaboratorParams extends js.Object {
  var owner: String
  /**
    * The permission to grant the collaborator. **Only valid on organization-owned repositories.** Can be one of:
    * \* `pull` - can pull, but not push to or administer this repository.
    * \* `push` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push and administer this repository.
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  var repo: String
  var username: String
}

object ReposAddCollaboratorParams {
  @scala.inline
  def apply(owner: String, repo: String, username: String, permission: pull | push | admin = null): ReposAddCollaboratorParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddCollaboratorParams]
  }
}

