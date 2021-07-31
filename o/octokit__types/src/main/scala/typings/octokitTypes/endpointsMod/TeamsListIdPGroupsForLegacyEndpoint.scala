package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListIdPGroupsForLegacyEndpoint extends StObject {
  
  var team_id: Double
}
object TeamsListIdPGroupsForLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double): TeamsListIdPGroupsForLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsForLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsForLegacyEndpointMutableBuilder[Self <: TeamsListIdPGroupsForLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
