package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateParams extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the team.
    */
  var name: java.lang.String
  /**
    * The ID of a team to set as the parent team. **Note**: You must pass the `hellcat-preview` media type to use this parameter.
    */
  var parent_team_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[java.lang.String] = js.undefined
  var team_id: scala.Double
}

object TeamsUpdateParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    team_id: scala.Double,
    description: java.lang.String = null,
    parent_team_id: scala.Int | scala.Double = null,
    permission: atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin = null,
    privacy: java.lang.String = null
  ): TeamsUpdateParams = {
    val __obj = js.Dynamic.literal(name = name, team_id = team_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    __obj.asInstanceOf[TeamsUpdateParams]
  }
}

