package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsRemoveProjectLegacyEndpoint extends StObject {
  
  var project_id: Double = js.native
  
  var team_id: Double = js.native
}
object TeamsRemoveProjectLegacyEndpoint {
  
  @scala.inline
  def apply(project_id: Double, team_id: Double): TeamsRemoveProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveProjectLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsRemoveProjectLegacyEndpointMutableBuilder[Self <: TeamsRemoveProjectLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
