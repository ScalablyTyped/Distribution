package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginablePayload extends StObject {
  
  var count: Double
  
  var next_page: String | Null
  
  var previous_page: String | Null
}
object PaginablePayload {
  
  inline def apply(count: Double): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[PaginablePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginablePayload] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setNext_page(value: String): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
    
    inline def setNext_pageNull: Self = StObject.set(x, "next_page", null)
    
    inline def setPrevious_page(value: String): Self = StObject.set(x, "previous_page", value.asInstanceOf[js.Any])
    
    inline def setPrevious_pageNull: Self = StObject.set(x, "previous_page", null)
  }
}
