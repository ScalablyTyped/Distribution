package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteLegacyEndpoint extends js.Object {
  var team_id: Double
}

object TeamsDeleteLegacyEndpoint {
  @scala.inline
  def apply(team_id: Double): TeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteLegacyEndpoint]
  }
}

