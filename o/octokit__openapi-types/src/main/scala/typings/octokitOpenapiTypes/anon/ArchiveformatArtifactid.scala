package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveformatArtifactid extends StObject {
  
  var archive_format: String
  
  /** The unique identifier of the artifact. */
  var artifact_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object ArchiveformatArtifactid {
  
  inline def apply(archive_format: String, artifact_id: Double, owner: String, repo: String): ArchiveformatArtifactid = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveformatArtifactid]
  }
  
  extension [Self <: ArchiveformatArtifactid](x: Self) {
    
    inline def setArchive_format(value: String): Self = StObject.set(x, "archive_format", value.asInstanceOf[js.Any])
    
    inline def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
