package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends StObject {
  
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
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpointMutableBuilder[Self <: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyParamsGroups*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
