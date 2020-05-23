package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups extends js.Object {
  var group_description: String
  var group_id: String
  var group_name: String
}

object TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups {
  @scala.inline
  def apply(group_description: String, group_id: String, group_name: String): TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups]
  }
}

