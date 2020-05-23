package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends js.Object {
  /**
    * The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove.
    */
  var groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups]
  var team_id: Double
}

object TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  @scala.inline
  def apply(groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups], team_id: Double): TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
}

