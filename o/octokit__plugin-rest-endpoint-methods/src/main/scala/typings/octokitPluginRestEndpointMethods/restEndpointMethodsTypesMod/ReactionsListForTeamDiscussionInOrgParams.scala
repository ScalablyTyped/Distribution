package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsListForTeamDiscussionInOrgParams extends js.Object {
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a team discussion.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.undefined
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

object ReactionsListForTeamDiscussionInOrgParams {
  @scala.inline
  def apply(
    discussion_number: Double,
    org: String,
    team_slug: String,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForTeamDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionInOrgParams]
  }
}

