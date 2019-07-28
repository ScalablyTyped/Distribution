package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentEndpoint extends js.Object {
  var body: String
  var discussion_number: Double
  var team_id: Double
}

object TeamsCreateDiscussionCommentEndpoint {
  @scala.inline
  def apply(body: String, discussion_number: Double, team_id: Double): TeamsCreateDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCreateDiscussionCommentEndpoint]
  }
}

