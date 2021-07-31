package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveProjectInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var project_id: Double
  
  var team_slug: String
}
object TeamsRemoveProjectInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, project_id: Double, team_slug: String): TeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveProjectInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsRemoveProjectInOrgEndpointMutableBuilder[Self <: TeamsRemoveProjectInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
