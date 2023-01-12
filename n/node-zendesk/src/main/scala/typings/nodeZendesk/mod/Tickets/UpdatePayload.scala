package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePayload extends StObject {
  
  val ticket: UpdateModel
}
object UpdatePayload {
  
  inline def apply(ticket: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePayload] (val x: Self) extends AnyVal {
    
    inline def setTicket(value: UpdateModel): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
