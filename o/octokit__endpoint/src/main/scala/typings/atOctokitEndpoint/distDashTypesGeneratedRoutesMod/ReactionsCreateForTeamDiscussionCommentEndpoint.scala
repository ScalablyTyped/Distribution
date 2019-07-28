package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionCommentEndpoint extends js.Object {
  var comment_number: Double
  var content: String
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionCommentEndpoint {
  @scala.inline
  def apply(comment_number: Double, content: String, discussion_number: Double, team_id: Double): ReactionsCreateForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, content = content, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentEndpoint]
  }
}

