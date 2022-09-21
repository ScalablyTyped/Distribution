package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSince extends StObject {
  
  var query: PerpageSince
}
object QueryPerpageSince {
  
  inline def apply(query: PerpageSince): QueryPerpageSince = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSince]
  }
  
  extension [Self <: QueryPerpageSince](x: Self) {
    
    inline def setQuery(value: PerpageSince): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
