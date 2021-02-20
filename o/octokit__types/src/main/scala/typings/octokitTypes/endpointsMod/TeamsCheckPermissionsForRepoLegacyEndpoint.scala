package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCheckPermissionsForRepoLegacyEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var team_id: Double = js.native
}
object TeamsCheckPermissionsForRepoLegacyEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, team_id: Double): TeamsCheckPermissionsForRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForRepoLegacyEndpointMutableBuilder[Self <: TeamsCheckPermissionsForRepoLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
