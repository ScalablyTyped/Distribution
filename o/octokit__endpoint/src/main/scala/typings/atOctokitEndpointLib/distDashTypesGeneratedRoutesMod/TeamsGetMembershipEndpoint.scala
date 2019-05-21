package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetMembershipEndpoint extends js.Object {
  var team_id: scala.Double
  var username: java.lang.String
}

object TeamsGetMembershipEndpoint {
  @scala.inline
  def apply(team_id: scala.Double, username: java.lang.String): TeamsGetMembershipEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id, username = username)
  
    __obj.asInstanceOf[TeamsGetMembershipEndpoint]
  }
}

