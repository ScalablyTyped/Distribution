package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.admin
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.maintain
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.pull
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.push
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.triage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateRepoInOrgParams extends js.Object {
  var org: String
  var owner: String
  /**
    * The permission to grant the team on this repository. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer this repository.
    * \* `push` - team members can pull and push, but not administer this repository.
    * \* `admin` - team members can pull, push and administer this repository.
    * \* `maintain` - team members can manage the repository without access to sensitive or destructive actions. Recommended for project managers. Only applies to repositories owned by organizations.
    * \* `triage` - team members can proactively manage issues and pull requests without write access. Recommended for contributors who triage a repository. Only applies to repositories owned by organizations.
    *
    * If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    */
  var permission: js.UndefOr[pull | push | admin | maintain | triage] = js.undefined
  var repo: String
  var team_slug: String
}

object TeamsAddOrUpdateRepoInOrgParams {
  @scala.inline
  def apply(
    org: String,
    owner: String,
    repo: String,
    team_slug: String,
    permission: pull | push | admin | maintain | triage = null
  ): TeamsAddOrUpdateRepoInOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateRepoInOrgParams]
  }
}

