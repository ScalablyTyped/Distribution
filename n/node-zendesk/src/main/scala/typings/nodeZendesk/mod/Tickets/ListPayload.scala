package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPayload
  extends StObject
     with PaginablePayload {
  
  val tickets: js.Array[ResponseModel]
}
object ListPayload {
  
  @scala.inline
  def apply(count: Double, tickets: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit class ListPayloadMutableBuilder[Self <: ListPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTickets(value: js.Array[ResponseModel]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketsVarargs(value: ResponseModel*): Self = StObject.set(x, "tickets", js.Array(value :_*))
  }
}
