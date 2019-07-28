package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var parent_team_id: js.UndefOr[Double] = js.undefined
  var permission: js.UndefOr[String] = js.undefined
  var privacy: js.UndefOr[String] = js.undefined
  var team_id: Double
}

object TeamsUpdateEndpoint {
  @scala.inline
  def apply(
    name: String,
    team_id: Double,
    description: String = null,
    parent_team_id: Int | Double = null,
    permission: String = null,
    privacy: String = null
  ): TeamsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(name = name, team_id = team_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    __obj.asInstanceOf[TeamsUpdateEndpoint]
  }
}

