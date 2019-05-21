package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionEndpoint extends js.Object {
  var body: java.lang.String
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var team_id: scala.Double
  var title: java.lang.String
}

object TeamsCreateDiscussionEndpoint {
  @scala.inline
  def apply(
    body: java.lang.String,
    team_id: scala.Double,
    title: java.lang.String,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): TeamsCreateDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(body = body, team_id = team_id, title = title)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsCreateDiscussionEndpoint]
  }
}

