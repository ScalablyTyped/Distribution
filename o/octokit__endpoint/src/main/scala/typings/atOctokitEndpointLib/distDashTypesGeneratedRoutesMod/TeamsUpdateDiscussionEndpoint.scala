package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionEndpoint extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var discussion_number: scala.Double
  var team_id: scala.Double
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TeamsUpdateDiscussionEndpoint {
  @scala.inline
  def apply(
    discussion_number: scala.Double,
    team_id: scala.Double,
    body: java.lang.String = null,
    title: java.lang.String = null
  ): TeamsUpdateDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number, team_id = team_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TeamsUpdateDiscussionEndpoint]
  }
}

