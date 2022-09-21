package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path361QuerySince extends StObject {
  
  var path: `361`
  
  var query: Since
}
object Path361QuerySince {
  
  inline def apply(path: `361`, query: Since): Path361QuerySince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path361QuerySince]
  }
  
  extension [Self <: Path361QuerySince](x: Self) {
    
    inline def setPath(value: `361`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Since): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
