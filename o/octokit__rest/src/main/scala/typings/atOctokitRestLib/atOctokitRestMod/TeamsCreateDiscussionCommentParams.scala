package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: java.lang.String
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsCreateDiscussionCommentParams {
  @scala.inline
  def apply(body: java.lang.String, discussion_number: scala.Double, team_id: scala.Double): TeamsCreateDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(body = body, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCreateDiscussionCommentParams]
  }
}

