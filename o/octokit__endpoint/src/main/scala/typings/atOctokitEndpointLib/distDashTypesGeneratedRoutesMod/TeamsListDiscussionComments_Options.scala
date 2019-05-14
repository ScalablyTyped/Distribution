package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListDiscussionComments_Options extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var discussion_number: scala.Double
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var team_id: scala.Double
}

object TeamsListDiscussionComments_Options {
  @scala.inline
  def apply(
    discussion_number: scala.Double,
    team_id: scala.Double,
    direction: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): TeamsListDiscussionComments_Options = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListDiscussionComments_Options]
  }
}

