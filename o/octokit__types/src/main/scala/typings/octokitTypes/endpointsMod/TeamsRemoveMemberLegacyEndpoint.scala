package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveMemberLegacyEndpoint extends StObject {
  
  var team_id: Double
  
  var username: String
}
object TeamsRemoveMemberLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double, username: String): TeamsRemoveMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsRemoveMemberLegacyEndpointMutableBuilder[Self <: TeamsRemoveMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
