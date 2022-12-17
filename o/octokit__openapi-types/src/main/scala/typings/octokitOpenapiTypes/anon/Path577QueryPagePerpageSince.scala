package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path577QueryPagePerpageSince extends StObject {
  
  var path: `577`
  
  var query: PagePerpageSince
}
object Path577QueryPagePerpageSince {
  
  inline def apply(path: `577`, query: PagePerpageSince): Path577QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path577QueryPagePerpageSince]
  }
  
  extension [Self <: Path577QueryPagePerpageSince](x: Self) {
    
    inline def setPath(value: `577`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
