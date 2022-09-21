package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageQ extends StObject {
  
  var query: PerpageQ
}
object QueryPerpageQ {
  
  inline def apply(query: PerpageQ): QueryPerpageQ = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageQ]
  }
  
  extension [Self <: QueryPerpageQ](x: Self) {
    
    inline def setQuery(value: PerpageQ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
