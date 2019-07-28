package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String
  var discussion_number: Double
  var team_id: Double
}

object TeamsCreateDiscussionCommentParams {
  @scala.inline
  def apply(body: String, discussion_number: Double, team_id: Double): TeamsCreateDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(body = body, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCreateDiscussionCommentParams]
  }
}

