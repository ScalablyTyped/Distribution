package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsRemoveRepoLegacyEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var team_id: Double
}
object TeamsRemoveRepoLegacyEndpoint {
  
  inline def apply(owner: String, repo: String, team_id: Double): TeamsRemoveRepoLegacyEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveRepoLegacyEndpoint]
  }
  
  extension [Self <: TeamsRemoveRepoLegacyEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
