package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQSort extends StObject {
  
  var query: QSort
}
object QueryQSort {
  
  inline def apply(query: QSort): QueryQSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQSort]
  }
  
  extension [Self <: QueryQSort](x: Self) {
    
    inline def setQuery(value: QSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
