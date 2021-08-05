package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsDownloadArtifactEndpoint extends StObject {
  
  var archive_format: String
  
  var artifact_id: Double
  
  var owner: String
  
  var repo: String
}
object ActionsDownloadArtifactEndpoint {
  
  inline def apply(archive_format: String, artifact_id: Double, owner: String, repo: String): ActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDownloadArtifactEndpoint]
  }
  
  extension [Self <: ActionsDownloadArtifactEndpoint](x: Self) {
    
    inline def setArchive_format(value: String): Self = StObject.set(x, "archive_format", value.asInstanceOf[js.Any])
    
    inline def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
