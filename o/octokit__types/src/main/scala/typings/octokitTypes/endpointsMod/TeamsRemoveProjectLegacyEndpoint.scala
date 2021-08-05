package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveProjectLegacyEndpoint extends StObject {
  
  var project_id: Double
  
  var team_id: Double
}
object TeamsRemoveProjectLegacyEndpoint {
  
  inline def apply(project_id: Double, team_id: Double): TeamsRemoveProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveProjectLegacyEndpoint]
  }
  
  extension [Self <: TeamsRemoveProjectLegacyEndpoint](x: Self) {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
