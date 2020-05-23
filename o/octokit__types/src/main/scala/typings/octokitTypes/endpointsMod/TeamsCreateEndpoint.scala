package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.pull
import typings.octokitTypes.octokitTypesStrings.push
import typings.octokitTypes.octokitTypesStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateEndpoint extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * List GitHub IDs for organization members who will become team maintainers.
    */
  var maintainers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the team.
    */
  var name: String
  @JSName("org")
  var org_ : String
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.undefined
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  /**
    * The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
  /**
    * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
    */
  var repo_names: js.UndefOr[js.Array[String]] = js.undefined
}

object TeamsCreateEndpoint {
  @scala.inline
  def apply(
    name: String,
    org_ : String,
    description: String = null,
    maintainers: js.Array[String] = null,
    parent_team_id: js.UndefOr[Double] = js.undefined,
    permission: pull | push | admin = null,
    privacy: secret | closed = null,
    repo_names: js.Array[String] = null
  ): TeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (!js.isUndefined(parent_team_id)) __obj.updateDynamic("parent_team_id")(parent_team_id.get.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (repo_names != null) __obj.updateDynamic("repo_names")(repo_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateEndpoint]
  }
}

