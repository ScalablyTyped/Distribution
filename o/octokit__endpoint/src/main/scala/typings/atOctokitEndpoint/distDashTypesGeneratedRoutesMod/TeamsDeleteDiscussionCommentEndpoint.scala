package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionCommentEndpoint extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var team_id: Double
}

object TeamsDeleteDiscussionCommentEndpoint {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, team_id: Double): TeamsDeleteDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsDeleteDiscussionCommentEndpoint]
  }
}

