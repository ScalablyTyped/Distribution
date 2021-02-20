package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDownloadArtifactEndpoint extends StObject {
  
  var archive_format: String = js.native
  
  var artifact_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ActionsDownloadArtifactEndpoint {
  
  @scala.inline
  def apply(archive_format: String, artifact_id: Double, owner: String, repo: String): ActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDownloadArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDownloadArtifactEndpointMutableBuilder[Self <: ActionsDownloadArtifactEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive_format(value: String): Self = StObject.set(x, "archive_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
