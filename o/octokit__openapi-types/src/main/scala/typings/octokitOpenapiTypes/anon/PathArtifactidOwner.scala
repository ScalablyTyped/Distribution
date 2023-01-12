package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArtifactidOwner extends StObject {
  
  var path: ArtifactidOwner
}
object PathArtifactidOwner {
  
  inline def apply(path: ArtifactidOwner): PathArtifactidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArtifactidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathArtifactidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ArtifactidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
