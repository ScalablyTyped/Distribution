package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path361QueryPagePerpageSort extends StObject {
  
  var path: `361`
  
  var query: PagePerpageSort
}
object Path361QueryPagePerpageSort {
  
  inline def apply(path: `361`, query: PagePerpageSort): Path361QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path361QueryPagePerpageSort]
  }
  
  extension [Self <: Path361QueryPagePerpageSort](x: Self) {
    
    inline def setPath(value: `361`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
