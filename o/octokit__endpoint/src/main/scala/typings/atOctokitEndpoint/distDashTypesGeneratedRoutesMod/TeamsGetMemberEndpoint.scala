package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMemberEndpoint extends js.Object {
  var team_id: Double
  var username: String
}

object TeamsGetMemberEndpoint {
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMemberEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsGetMemberEndpoint]
  }
}

