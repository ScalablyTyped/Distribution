package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  team_id :number,   project_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait TeamsCheckPermissionsForProjectLegacyEndpoint extends StObject {
  
  var mediaType: `7` = js.native
  
  var project_id: Double = js.native
  
  var team_id: Double = js.native
}
object TeamsCheckPermissionsForProjectLegacyEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, project_id: Double, team_id: Double): TeamsCheckPermissionsForProjectLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForProjectLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForProjectLegacyEndpointMutableBuilder[Self <: TeamsCheckPermissionsForProjectLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
