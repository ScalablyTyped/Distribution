package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsDeleteLegacyEndpoint extends StObject {
  
  var team_id: Double
}
object TeamsDeleteLegacyEndpoint {
  
  inline def apply(team_id: Double): TeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteLegacyEndpoint]
  }
  
  extension [Self <: TeamsDeleteLegacyEndpoint](x: Self) {
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
