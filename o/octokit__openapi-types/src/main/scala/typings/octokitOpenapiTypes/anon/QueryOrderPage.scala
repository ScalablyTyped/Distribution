package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrderPage extends StObject {
  
  var query: OrderPage
}
object QueryOrderPage {
  
  inline def apply(query: OrderPage): QueryOrderPage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrderPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOrderPage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: OrderPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
