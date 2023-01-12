package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path348QueryPagePerpageSort extends StObject {
  
  var path: `348`
  
  var query: PagePerpageSort
}
object Path348QueryPagePerpageSort {
  
  inline def apply(path: `348`, query: PagePerpageSort): Path348QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path348QueryPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path348QueryPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `348`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
