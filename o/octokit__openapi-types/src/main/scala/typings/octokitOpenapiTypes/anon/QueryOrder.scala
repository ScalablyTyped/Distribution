package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOrder extends StObject {
  
  var query: Order
}
object QueryOrder {
  
  inline def apply(query: Order): QueryOrder = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOrder] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Order): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
