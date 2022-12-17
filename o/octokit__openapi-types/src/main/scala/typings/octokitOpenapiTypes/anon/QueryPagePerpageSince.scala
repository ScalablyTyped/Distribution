package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePerpageSince extends StObject {
  
  var query: PagePerpageSince
}
object QueryPagePerpageSince {
  
  inline def apply(query: PagePerpageSince): QueryPagePerpageSince = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePerpageSince]
  }
  
  extension [Self <: QueryPagePerpageSince](x: Self) {
    
    inline def setQuery(value: PagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
