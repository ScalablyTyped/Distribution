package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsDeleteLegacyEndpoint extends StObject {
  
  var team_id: Double = js.native
}
object TeamsDeleteLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double): TeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsDeleteLegacyEndpointMutableBuilder[Self <: TeamsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
