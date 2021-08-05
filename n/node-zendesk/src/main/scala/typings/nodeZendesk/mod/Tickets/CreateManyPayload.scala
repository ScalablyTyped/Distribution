package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManyPayload extends StObject {
  
  val tickets: js.Array[CreateModel]
}
object CreateManyPayload {
  
  inline def apply(tickets: js.Array[CreateModel]): CreateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManyPayload]
  }
  
  extension [Self <: CreateManyPayload](x: Self) {
    
    inline def setTickets(value: js.Array[CreateModel]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTicketsVarargs(value: CreateModel*): Self = StObject.set(x, "tickets", js.Array(value :_*))
  }
}
