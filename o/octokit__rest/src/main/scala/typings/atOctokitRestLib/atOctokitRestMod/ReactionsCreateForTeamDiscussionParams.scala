package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object ReactionsCreateForTeamDiscussionParams {
  @scala.inline
  def apply(
    content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray | atOctokitRestLib.atOctokitRestLibStrings.rocket | atOctokitRestLib.atOctokitRestLibStrings.eyes,
    discussion_number: scala.Double,
    team_id: scala.Double
  ): ReactionsCreateForTeamDiscussionParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionParams]
  }
}

