package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsRemoveMemberEndpoint extends js.Object {
  var team_id: scala.Double
  var username: java.lang.String
}

object TeamsRemoveMemberEndpoint {
  @scala.inline
  def apply(team_id: scala.Double, username: java.lang.String): TeamsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsRemoveMemberEndpoint]
  }
}

