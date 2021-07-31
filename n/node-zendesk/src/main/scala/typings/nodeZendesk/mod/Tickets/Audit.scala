package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audit extends StObject {
  
  val author_id: ZendeskID
  
  val created_at: String
  
  val events: js.Array[js.Any] | Null
  
  val id: ZendeskID
  
  val metadata: js.Any | Null
  
  val ticket_id: ZendeskID
  
  val via: Via | Null
}
object Audit {
  
  @scala.inline
  def apply(author_id: ZendeskID, created_at: String, id: ZendeskID, ticket_id: ZendeskID): Audit = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ticket_id = ticket_id.asInstanceOf[js.Any], events = null, metadata = null, via = null)
    __obj.asInstanceOf[Audit]
  }
  
  @scala.inline
  implicit class AuditMutableBuilder[Self <: Audit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor_id(value: ZendeskID): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = StObject.set(x, "events", null)
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ZendeskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    @scala.inline
    def setTicket_id(value: ZendeskID): Self = StObject.set(x, "ticket_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaNull: Self = StObject.set(x, "via", null)
  }
}
