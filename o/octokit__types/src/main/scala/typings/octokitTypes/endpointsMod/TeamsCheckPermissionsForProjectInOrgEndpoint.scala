package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCheckPermissionsForProjectInOrgEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  @JSName("org")
  var org_ : String
  
  var project_id: Double
  
  var team_slug: String
}
object TeamsCheckPermissionsForProjectInOrgEndpoint {
  
  inline def apply(mediaType: `0`[inertia], org_ : String, project_id: Double, team_slug: String): TeamsCheckPermissionsForProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForProjectInOrgEndpoint]
  }
  
  extension [Self <: TeamsCheckPermissionsForProjectInOrgEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
