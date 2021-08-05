package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetCollaboratorPermissionLevelEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var username: String
}
object ReposGetCollaboratorPermissionLevelEndpoint {
  
  inline def apply(owner: String, repo: String, username: String): ReposGetCollaboratorPermissionLevelEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelEndpoint]
  }
  
  extension [Self <: ReposGetCollaboratorPermissionLevelEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
