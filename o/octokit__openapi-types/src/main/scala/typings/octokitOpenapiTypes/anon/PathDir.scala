package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDir extends StObject {
  
  var path: Dir
  
  var query: `188`
}
object PathDir {
  
  inline def apply(path: Dir, query: `188`): PathDir = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDir]
  }
  
  extension [Self <: PathDir](x: Self) {
    
    inline def setPath(value: Dir): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `188`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
