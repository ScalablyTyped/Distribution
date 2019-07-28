package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsEndpoint extends js.Object {
  var groups: js.Array[js.Object]
  var `groups[].group_description`: String
  var `groups[].group_id`: String
  var `groups[].group_name`: String
  var team_id: Double
}

object TeamsCreateOrUpdateIdPGroupConnectionsEndpoint {
  @scala.inline
  def apply(
    groups: js.Array[js.Object],
    `groups[].group_description`: String,
    `groups[].group_id`: String,
    `groups[].group_name`: String,
    team_id: Double
  ): TeamsCreateOrUpdateIdPGroupConnectionsEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups, team_id = team_id)
    __obj.updateDynamic("groups[].group_description")(`groups[].group_description`)
    __obj.updateDynamic("groups[].group_id")(`groups[].group_id`)
    __obj.updateDynamic("groups[].group_name")(`groups[].group_name`)
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsEndpoint]
  }
}

