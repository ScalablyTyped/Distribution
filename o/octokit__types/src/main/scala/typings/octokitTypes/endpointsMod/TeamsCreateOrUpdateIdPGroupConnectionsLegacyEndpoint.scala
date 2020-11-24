package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends js.Object {
  
  /**
    * The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove.
    */
  var groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups] = js.native
  
  var team_id: Double = js.native
}
object TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  
  @scala.inline
  def apply(groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups], team_id: Double): TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpointOps[Self <: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupsVarargs(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
  }
}
