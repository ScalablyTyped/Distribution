package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCheckPermissionsForProjectLegacyEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var project_id: Double
  
  var team_id: Double
}
object TeamsCheckPermissionsForProjectLegacyEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], project_id: Double, team_id: Double): TeamsCheckPermissionsForProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForProjectLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForProjectLegacyEndpointMutableBuilder[Self <: TeamsCheckPermissionsForProjectLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
