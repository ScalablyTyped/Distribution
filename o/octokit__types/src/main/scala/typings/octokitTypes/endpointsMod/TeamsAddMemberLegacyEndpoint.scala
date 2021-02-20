package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAddMemberLegacyEndpoint extends StObject {
  
  var team_id: Double = js.native
  
  var username: String = js.native
}
object TeamsAddMemberLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double, username: String): TeamsAddMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsAddMemberLegacyEndpointMutableBuilder[Self <: TeamsAddMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
