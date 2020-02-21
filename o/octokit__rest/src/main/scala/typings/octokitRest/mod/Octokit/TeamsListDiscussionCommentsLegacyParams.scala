package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.asc
import typings.octokitRest.octokitRestStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionCommentsLegacyParams extends js.Object {
  /**
    * Sorts the discussion comments by the date they were created. To return the oldest comments first, set to `asc`. Can be one of `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
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

object TeamsListDiscussionCommentsLegacyParams {
  @scala.inline
  def apply(
    discussion_number: Double,
    team_id: Double,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): TeamsListDiscussionCommentsLegacyParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListDiscussionCommentsLegacyParams]
  }
}

