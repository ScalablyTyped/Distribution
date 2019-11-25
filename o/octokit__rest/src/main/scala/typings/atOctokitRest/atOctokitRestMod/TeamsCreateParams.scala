package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.closed
import typings.atOctokitRest.atOctokitRestStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateParams extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The logins of organization members to add as maintainers of the team.
    */
  var maintainers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The name of the team.
    */
  var name: String
  var org: String
  /**
    * The ID of a team to set as the parent team. **Note**: You must pass the `hellcat-preview` media type to use this parameter.
    */
  var parent_team_id: js.UndefOr[Double] = js.undefined
  /**
    * The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    * **Note**: You must pass the `hellcat-preview` media type to set privacy default to `closed` for child teams.
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
  /**
    * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
    */
  var repo_names: js.UndefOr[js.Array[String]] = js.undefined
}

object TeamsCreateParams {
  @scala.inline
  def apply(
    name: String,
    org: String,
    description: String = null,
    maintainers: js.Array[String] = null,
    parent_team_id: Int | Double = null,
    privacy: secret | closed = null,
    repo_names: js.Array[String] = null
  ): TeamsCreateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers.asInstanceOf[js.Any])
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (repo_names != null) __obj.updateDynamic("repo_names")(repo_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateParams]
  }
}

