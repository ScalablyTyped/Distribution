package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathExportid extends StObject {
  
  var path: Exportid
}
object PathExportid {
  
  inline def apply(path: Exportid): PathExportid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathExportid]
  }
  
  extension [Self <: PathExportid](x: Self) {
    
    inline def setPath(value: Exportid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
