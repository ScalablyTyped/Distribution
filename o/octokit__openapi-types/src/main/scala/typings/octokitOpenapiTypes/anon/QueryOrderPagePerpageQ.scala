package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrderPagePerpageQ extends StObject {
  
  var query: OrderPagePerpageQ
}
object QueryOrderPagePerpageQ {
  
  inline def apply(query: OrderPagePerpageQ): QueryOrderPagePerpageQ = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrderPagePerpageQ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOrderPagePerpageQ] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: OrderPagePerpageQ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
