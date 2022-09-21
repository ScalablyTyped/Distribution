package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQ extends StObject {
  
  var query: Q
}
object QueryQ {
  
  inline def apply(query: Q): QueryQ = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQ]
  }
  
  extension [Self <: QueryQ](x: Self) {
    
    inline def setQuery(value: Q): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
