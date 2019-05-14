package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreate_Options extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var maintainers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var org: java.lang.String
  var parent_team_id: js.UndefOr[scala.Double] = js.undefined
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var privacy: js.UndefOr[java.lang.String] = js.undefined
  var repo_names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TeamsCreate_Options {
  @scala.inline
  def apply(
    name: java.lang.String,
    org: java.lang.String,
    description: java.lang.String = null,
    maintainers: js.Array[java.lang.String] = null,
    parent_team_id: scala.Int | scala.Double = null,
    permission: java.lang.String = null,
    privacy: java.lang.String = null,
    repo_names: js.Array[java.lang.String] = null
  ): TeamsCreate_Options = {
    val __obj = js.Dynamic.literal(name = name, org = org)
    if (description != null) __obj.updateDynamic("description")(description)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    if (repo_names != null) __obj.updateDynamic("repo_names")(repo_names)
    __obj.asInstanceOf[TeamsCreate_Options]
  }
}

