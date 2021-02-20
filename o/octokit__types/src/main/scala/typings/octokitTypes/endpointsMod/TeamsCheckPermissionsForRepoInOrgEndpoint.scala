package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCheckPermissionsForRepoInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var team_slug: String = js.native
}
object TeamsCheckPermissionsForRepoInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, owner: String, repo: String, team_slug: String): TeamsCheckPermissionsForRepoInOrgEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForRepoInOrgEndpointMutableBuilder[Self <: TeamsCheckPermissionsForRepoInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
