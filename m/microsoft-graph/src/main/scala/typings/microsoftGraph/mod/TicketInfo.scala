package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TicketInfo extends StObject {
  
  // The ticket number.
  var ticketNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the ticket system.
  var ticketSystem: js.UndefOr[NullableOption[String]] = js.undefined
}
object TicketInfo {
  
  inline def apply(): TicketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TicketInfo]
  }
  
  extension [Self <: TicketInfo](x: Self) {
    
    inline def setTicketNumber(value: NullableOption[String]): Self = StObject.set(x, "ticketNumber", value.asInstanceOf[js.Any])
    
    inline def setTicketNumberNull: Self = StObject.set(x, "ticketNumber", null)
    
    inline def setTicketNumberUndefined: Self = StObject.set(x, "ticketNumber", js.undefined)
    
    inline def setTicketSystem(value: NullableOption[String]): Self = StObject.set(x, "ticketSystem", value.asInstanceOf[js.Any])
    
    inline def setTicketSystemNull: Self = StObject.set(x, "ticketSystem", null)
    
    inline def setTicketSystemUndefined: Self = StObject.set(x, "ticketSystem", js.undefined)
  }
}
