package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentEndpoint extends js.Object {
  var body: String
  var comment_number: Double
  var discussion_number: Double
  var team_id: Double
}

object TeamsUpdateDiscussionCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, team_id: Double): TeamsUpdateDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentEndpoint]
  }
}

