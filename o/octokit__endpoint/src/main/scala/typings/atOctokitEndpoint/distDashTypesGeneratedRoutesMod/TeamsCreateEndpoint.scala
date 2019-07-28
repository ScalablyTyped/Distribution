package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var maintainers: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var org: String
  var parent_team_id: js.UndefOr[Double] = js.undefined
  var permission: js.UndefOr[String] = js.undefined
  var privacy: js.UndefOr[String] = js.undefined
  var repo_names: js.UndefOr[js.Array[String]] = js.undefined
}

object TeamsCreateEndpoint {
  @scala.inline
  def apply(
    name: String,
    org: String,
    description: String = null,
    maintainers: js.Array[String] = null,
    parent_team_id: Int | Double = null,
    permission: String = null,
    privacy: String = null,
    repo_names: js.Array[String] = null
  ): TeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(name = name, org = org)
    if (description != null) __obj.updateDynamic("description")(description)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    if (repo_names != null) __obj.updateDynamic("repo_names")(repo_names)
    __obj.asInstanceOf[TeamsCreateEndpoint]
  }
}

