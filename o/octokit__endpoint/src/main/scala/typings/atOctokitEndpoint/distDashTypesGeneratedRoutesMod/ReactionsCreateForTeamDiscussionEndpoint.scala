package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionEndpoint extends js.Object {
  var content: String
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionEndpoint {
  @scala.inline
  def apply(content: String, discussion_number: Double, team_id: Double): ReactionsCreateForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(content = content, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionEndpoint]
  }
}

