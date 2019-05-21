package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionEndpoint extends js.Object {
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsDeleteDiscussionEndpoint {
  @scala.inline
  def apply(discussion_number: scala.Double, team_id: scala.Double): TeamsDeleteDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsDeleteDiscussionEndpoint]
  }
}

