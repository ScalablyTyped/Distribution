package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionCommentLegacyParams extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var team_id: Double
}

object TeamsGetDiscussionCommentLegacyParams {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, team_id: Double): TeamsGetDiscussionCommentLegacyParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetDiscussionCommentLegacyParams]
  }
}

