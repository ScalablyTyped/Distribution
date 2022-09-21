package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrderPagePerpage extends StObject {
  
  var query: OrderPagePerpage
}
object QueryOrderPagePerpage {
  
  inline def apply(query: OrderPagePerpage): QueryOrderPagePerpage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrderPagePerpage]
  }
  
  extension [Self <: QueryOrderPagePerpage](x: Self) {
    
    inline def setQuery(value: OrderPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
