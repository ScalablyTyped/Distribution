package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePayload extends StObject {
  
  val audit: Audit
  
  val ticket: ResponseModel
}
object ResponsePayload {
  
  inline def apply(audit: Audit, ticket: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  
  extension [Self <: ResponsePayload](x: Self) {
    
    inline def setAudit(value: Audit): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
    
    inline def setTicket(value: ResponseModel): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}
