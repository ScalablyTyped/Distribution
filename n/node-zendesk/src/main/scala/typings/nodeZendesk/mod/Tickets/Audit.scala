package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audit extends StObject {
  
  val author_id: ZendeskID
  
  val created_at: String
  
  val events: js.Array[Any] | Null
  
  val id: ZendeskID
  
  val metadata: Any | Null
  
  val ticket_id: ZendeskID
  
  val via: Via | Null
}
object Audit {
  
  inline def apply(author_id: ZendeskID, created_at: String, id: ZendeskID, ticket_id: ZendeskID): Audit = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ticket_id = ticket_id.asInstanceOf[js.Any], events = null, metadata = null, via = null)
    __obj.asInstanceOf[Audit]
  }
  
  extension [Self <: Audit](x: Self) {
    
    inline def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: ZendeskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setTicket_id(value: ZendeskID): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
    
    inline def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    inline def setViaNull: Self = StObject.set(x, "via", null)
  }
}
