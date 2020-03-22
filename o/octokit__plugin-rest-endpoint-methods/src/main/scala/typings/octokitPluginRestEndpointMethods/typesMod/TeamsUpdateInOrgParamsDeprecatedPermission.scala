package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.closed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateInOrgParamsDeprecatedPermission extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the team.
    */
  var name: String
  var org: String
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.undefined
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    * @deprecated "permission" parameter has been deprecated and will be removed in future
    */
  var permission: js.UndefOr[String] = js.undefined
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
  var team_slug: String
}

object TeamsUpdateInOrgParamsDeprecatedPermission {
  @scala.inline
  def apply(
    name: String,
    org: String,
    team_slug: String,
    description: String = null,
    parent_team_id: Int | Double = null,
    permission: String = null,
    privacy: secret | closed = null
  ): TeamsUpdateInOrgParamsDeprecatedPermission = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateInOrgParamsDeprecatedPermission]
  }
}

