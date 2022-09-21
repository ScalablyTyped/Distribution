package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArchiveformat extends StObject {
  
  var path: Archiveformat
}
object PathArchiveformat {
  
  inline def apply(path: Archiveformat): PathArchiveformat = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArchiveformat]
  }
  
  extension [Self <: PathArchiveformat](x: Self) {
    
    inline def setPath(value: Archiveformat): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
