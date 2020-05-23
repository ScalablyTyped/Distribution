package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.maintain
import typings.octokitTypes.octokitTypesStrings.pull
import typings.octokitTypes.octokitTypesStrings.push
import typings.octokitTypes.octokitTypesStrings.triage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaboratorEndpoint extends js.Object {
  var owner: String
  /**
    * The permission to grant the collaborator. **Only valid on organization-owned repositories.** Can be one of:
    * \* `pull` - can pull, but not push to or administer this repository.
    * \* `push` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push and administer this repository.
    * \* `maintain` - Recommended for project managers who need to manage the repository without access to sensitive or destructive actions.
    * \* `triage` - Recommended for contributors who need to proactively manage issues and pull requests without write access.
    */
  var permission: js.UndefOr[pull | push | admin | maintain | triage] = js.undefined
  var repo: String
  var username: String
}

object ReposAddCollaboratorEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    username: String,
    permission: pull | push | admin | maintain | triage = null
  ): ReposAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddCollaboratorEndpoint]
  }
}

