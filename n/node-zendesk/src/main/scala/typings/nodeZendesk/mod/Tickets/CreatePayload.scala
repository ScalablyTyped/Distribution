package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayload extends StObject {
  
  val ticket: CreateModel
}
object CreatePayload {
  
  @scala.inline
  def apply(ticket: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  
  @scala.inline
  implicit class CreatePayloadMutableBuilder[Self <: CreatePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicket(value: CreateModel): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
