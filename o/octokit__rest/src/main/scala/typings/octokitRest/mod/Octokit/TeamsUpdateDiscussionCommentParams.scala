package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var comment_number: Double
  var discussion_number: Double
  var team_id: Double
}

object TeamsUpdateDiscussionCommentParams {
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, team_id: Double): TeamsUpdateDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentParams]
  }
}

