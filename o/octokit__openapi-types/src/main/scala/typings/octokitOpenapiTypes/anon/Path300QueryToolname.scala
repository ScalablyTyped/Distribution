package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path300QueryToolname extends StObject {
  
  var path: `300`
  
  var query: Toolname
}
object Path300QueryToolname {
  
  inline def apply(path: `300`, query: Toolname): Path300QueryToolname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path300QueryToolname]
  }
  
  extension [Self <: Path300QueryToolname](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Toolname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
