package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path599QueryPagePerpageSince extends StObject {
  
  var path: `599`
  
  var query: PagePerpageSince
}
object Path599QueryPagePerpageSince {
  
  inline def apply(path: `599`, query: PagePerpageSince): Path599QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path599QueryPagePerpageSince]
  }
  
  extension [Self <: Path599QueryPagePerpageSince](x: Self) {
    
    inline def setPath(value: `599`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
