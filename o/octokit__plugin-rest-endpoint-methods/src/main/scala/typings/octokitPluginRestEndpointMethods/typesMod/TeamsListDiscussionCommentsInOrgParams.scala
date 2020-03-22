package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionCommentsInOrgParams extends js.Object {
  /**
    * Sorts the discussion comments by the date they were created. To return the oldest comments first, set to `asc`. Can be one of `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  var discussion_number: Double
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var team_slug: String
}

object TeamsListDiscussionCommentsInOrgParams {
  @scala.inline
  def apply(
    discussion_number: Double,
    org: String,
    team_slug: String,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): TeamsListDiscussionCommentsInOrgParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListDiscussionCommentsInOrgParams]
  }
}

