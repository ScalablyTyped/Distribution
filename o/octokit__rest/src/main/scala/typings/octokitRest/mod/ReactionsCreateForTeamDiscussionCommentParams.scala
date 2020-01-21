package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.Plussign1
import typings.octokitRest.octokitRestStrings.`-1`
import typings.octokitRest.octokitRestStrings.confused
import typings.octokitRest.octokitRestStrings.eyes
import typings.octokitRest.octokitRestStrings.heart
import typings.octokitRest.octokitRestStrings.hooray
import typings.octokitRest.octokitRestStrings.laugh
import typings.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionCommentParams extends js.Object {
  var comment_number: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionCommentParams {
  @scala.inline
  def apply(
    comment_number: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentParams]
  }
}

