package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetArtifactEndpoint extends StObject {
  
  var artifact_id: Double
  
  var owner: String
  
  var repo: String
}
object ActionsGetArtifactEndpoint {
  
  inline def apply(artifact_id: Double, owner: String, repo: String): ActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetArtifactEndpoint]
  }
  
  extension [Self <: ActionsGetArtifactEndpoint](x: Self) {
    
    inline def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
