package typings.octokitRest.mod.Octokit

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

trait ReactionsListForTeamDiscussionParams extends js.Object {
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a team discussion.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.undefined
  var discussion_number: Double
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object ReactionsListForTeamDiscussionParams {
  @scala.inline
  def apply(
    discussion_number: Double,
    team_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForTeamDiscussionParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionParams]
  }
}

