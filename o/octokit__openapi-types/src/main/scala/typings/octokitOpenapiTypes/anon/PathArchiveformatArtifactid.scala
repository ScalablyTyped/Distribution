package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArchiveformatArtifactid extends StObject {
  
  var path: ArchiveformatArtifactid
}
object PathArchiveformatArtifactid {
  
  inline def apply(path: ArchiveformatArtifactid): PathArchiveformatArtifactid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArchiveformatArtifactid]
  }
  
  extension [Self <: PathArchiveformatArtifactid](x: Self) {
    
    inline def setPath(value: ArchiveformatArtifactid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
