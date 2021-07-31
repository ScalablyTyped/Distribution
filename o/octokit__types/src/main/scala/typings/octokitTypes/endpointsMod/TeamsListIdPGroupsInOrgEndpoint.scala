package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListIdPGroupsInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var team_slug: String
}
object TeamsListIdPGroupsInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, team_slug: String): TeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsInOrgEndpointMutableBuilder[Self <: TeamsListIdPGroupsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
