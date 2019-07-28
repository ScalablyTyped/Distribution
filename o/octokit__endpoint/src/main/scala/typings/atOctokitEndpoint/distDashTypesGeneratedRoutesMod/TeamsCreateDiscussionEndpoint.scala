package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionEndpoint extends js.Object {
  var body: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var team_id: Double
  var title: String
}

object TeamsCreateDiscussionEndpoint {
  @scala.inline
  def apply(body: String, team_id: Double, title: String, `private`: js.UndefOr[Boolean] = js.undefined): TeamsCreateDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(body = body, team_id = team_id, title = title)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TeamsCreateDiscussionEndpoint]
  }
}

