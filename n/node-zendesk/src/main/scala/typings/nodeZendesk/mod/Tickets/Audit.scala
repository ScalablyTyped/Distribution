package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audit extends js.Object {
  
  val author_id: ZendeskID = js.native
  
  val created_at: String = js.native
  
  val events: js.Array[_] | Null = js.native
  
  val id: ZendeskID = js.native
  
  val metadata: js.Any | Null = js.native
  
  val ticket_id: ZendeskID = js.native
  
  val via: Via | Null = js.native
}
object Audit {
  
  @scala.inline
  def apply(author_id: ZendeskID, created_at: String, id: ZendeskID, ticket_id: ZendeskID): Audit = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ticket_id = ticket_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audit]
  }
  
  @scala.inline
  implicit class AuditOps[Self <: Audit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor_id(value: ZendeskID): Self = this.set("author_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ZendeskID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_id(value: ZendeskID): Self = this.set("ticket_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: js.Any*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsNull: Self = this.set("events", null)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataNull: Self = this.set("metadata", null)
    
    @scala.inline
    def setVia(value: Via): Self = this.set("via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaNull: Self = this.set("via", null)
  }
}
