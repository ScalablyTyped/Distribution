package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageQSort extends StObject {
  
  var query: PerpageQSort
}
object QueryPerpageQSort {
  
  inline def apply(query: PerpageQSort): QueryPerpageQSort = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageQSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPerpageQSort] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PerpageQSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
