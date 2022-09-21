package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTreesha extends StObject {
  
  var path: Treesha
  
  var query: Recursive
}
object PathTreesha {
  
  inline def apply(path: Treesha, query: Recursive): PathTreesha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTreesha]
  }
  
  extension [Self <: PathTreesha](x: Self) {
    
    inline def setPath(value: Treesha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Recursive): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
