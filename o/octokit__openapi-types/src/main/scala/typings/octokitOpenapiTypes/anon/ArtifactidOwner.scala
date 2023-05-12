package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactidOwner extends StObject {
  
  var artifact_id: Double
  
  var owner: String
  
  var repo: String
}
object ArtifactidOwner {
  
  inline def apply(artifact_id: Double, owner: String, repo: String): ArtifactidOwner = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactidOwner] (val x: Self) extends AnyVal {
    
    inline def setArtifact_id(value: Double): Self = StObject.set(x, "artifact_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
