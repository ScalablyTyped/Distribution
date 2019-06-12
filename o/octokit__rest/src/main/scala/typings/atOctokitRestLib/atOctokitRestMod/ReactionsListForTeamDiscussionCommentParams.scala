package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionCommentParams extends js.Object {
  var comment_number: scala.Double
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a team discussion comment.
    */
  var content: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes
  ] = js.undefined
  var discussion_number: scala.Double
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var team_id: scala.Double
}

object ReactionsListForTeamDiscussionCommentParams {
  @scala.inline
  def apply(
    comment_number: scala.Double,
    discussion_number: scala.Double,
    team_id: scala.Double,
    content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ReactionsListForTeamDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentParams]
  }
}

