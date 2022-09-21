package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirectionPagePerpageSince extends StObject {
  
  var path: OwnerString
  
  var query: DirectionPagePerpageSince
}
object QueryDirectionPagePerpageSince {
  
  inline def apply(path: OwnerString, query: DirectionPagePerpageSince): QueryDirectionPagePerpageSince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirectionPagePerpageSince]
  }
  
  extension [Self <: QueryDirectionPagePerpageSince](x: Self) {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DirectionPagePerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
