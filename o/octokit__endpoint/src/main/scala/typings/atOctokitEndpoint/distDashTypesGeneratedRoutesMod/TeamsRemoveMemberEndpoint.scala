package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMemberEndpoint extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsRemoveMemberEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsRemoveMemberEndpoint]
  }
}

