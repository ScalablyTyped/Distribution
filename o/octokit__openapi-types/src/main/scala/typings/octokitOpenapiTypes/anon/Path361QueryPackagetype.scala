package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path361QueryPackagetype extends StObject {
  
  var path: `361`
  
  var query: Packagetype
}
object Path361QueryPackagetype {
  
  inline def apply(path: `361`, query: Packagetype): Path361QueryPackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path361QueryPackagetype]
  }
  
  extension [Self <: Path361QueryPackagetype](x: Self) {
    
    inline def setPath(value: `361`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Packagetype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
