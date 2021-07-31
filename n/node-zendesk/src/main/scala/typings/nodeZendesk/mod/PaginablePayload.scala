package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginablePayload extends StObject {
  
  var count: Double
  
  var next_page: Double | Null
  
  var previous_page: Double | Null
}
object PaginablePayload {
  
  @scala.inline
  def apply(count: Double): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[PaginablePayload]
  }
  
  @scala.inline
  implicit class PaginablePayloadMutableBuilder[Self <: PaginablePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_page(value: Double): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_pageNull: Self = StObject.set(x, "next_page", null)
    
    @scala.inline
    def setPrevious_page(value: Double): Self = StObject.set(x, "previous_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious_pageNull: Self = StObject.set(x, "previous_page", null)
  }
}
