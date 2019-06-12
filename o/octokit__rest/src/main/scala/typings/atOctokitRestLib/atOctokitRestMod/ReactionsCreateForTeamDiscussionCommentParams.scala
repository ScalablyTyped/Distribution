package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionCommentParams extends js.Object {
  var comment_number: scala.Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object ReactionsCreateForTeamDiscussionCommentParams {
  @scala.inline
  def apply(
    comment_number: scala.Double,
    content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes,
    discussion_number: scala.Double,
    team_id: scala.Double
  ): ReactionsCreateForTeamDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, content = content.asInstanceOf[js.Any], discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentParams]
  }
}

