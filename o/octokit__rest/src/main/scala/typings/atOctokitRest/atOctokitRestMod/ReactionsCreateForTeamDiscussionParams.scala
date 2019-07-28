package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`+1`
import typings.atOctokitRest.atOctokitRestStrings.`-1`
import typings.atOctokitRest.atOctokitRestStrings.confused
import typings.atOctokitRest.atOctokitRestStrings.eyes
import typings.atOctokitRest.atOctokitRestStrings.heart
import typings.atOctokitRest.atOctokitRestStrings.hooray
import typings.atOctokitRest.atOctokitRestStrings.laugh
import typings.atOctokitRest.atOctokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var team_id: Double
}

object ReactionsCreateForTeamDiscussionParams {
  @scala.inline
  def apply(
    content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    team_id: Double
  ): ReactionsCreateForTeamDiscussionParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionParams]
  }
}

