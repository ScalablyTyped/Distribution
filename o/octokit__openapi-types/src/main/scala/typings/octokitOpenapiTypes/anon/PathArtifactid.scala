package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArtifactid extends StObject {
  
  var path: Artifactid
}
object PathArtifactid {
  
  inline def apply(path: Artifactid): PathArtifactid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArtifactid]
  }
  
  extension [Self <: PathArtifactid](x: Self) {
    
    inline def setPath(value: Artifactid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
