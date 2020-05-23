package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetLegacyEndpoint extends js.Object {
  var team_id: Double
}

object TeamsGetLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double): TeamsGetLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetLegacyEndpoint]
  }
}

