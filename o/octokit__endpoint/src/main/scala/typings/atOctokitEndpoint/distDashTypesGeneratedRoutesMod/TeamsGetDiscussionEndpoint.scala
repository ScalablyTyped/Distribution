package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionEndpoint extends js.Object {
  var discussion_number: Double
  var team_id: Double
}

object TeamsGetDiscussionEndpoint {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsGetDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsGetDiscussionEndpoint]
  }
}

