package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdate_Options extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var parent_team_id: js.UndefOr[scala.Double] = js.undefined
  var permission: js.UndefOr[java.lang.String] = js.undefined
  var privacy: js.UndefOr[java.lang.String] = js.undefined
  var team_id: scala.Double
}

object TeamsUpdate_Options {
  @scala.inline
  def apply(
    name: java.lang.String,
    team_id: scala.Double,
    description: java.lang.String = null,
    parent_team_id: scala.Int | scala.Double = null,
    permission: java.lang.String = null,
    privacy: java.lang.String = null
  ): TeamsUpdate_Options = {
    val __obj = js.Dynamic.literal(name = name, team_id = team_id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    __obj.asInstanceOf[TeamsUpdate_Options]
  }
}

