package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.Tickets.Field
import typings.nodeZendesk.mod.Tickets.Priority
import typings.nodeZendesk.mod.Tickets.TicketType
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#create-request|Zendesk Requests Create}
  */
@js.native
trait CreateModel extends js.Object {
  
  var collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.native
  
  var comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel = js.native
  
   // Anonymous requests can set type, Authenticated requests cannot
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.native
  
  var due_at: js.UndefOr[String | Null] = js.native
  
  var fields: js.UndefOr[js.Array[Field] | Null] = js.native
  
  var priority: js.UndefOr[Priority | Null] = js.native
  
  var recipient: js.UndefOr[String | Null] = js.native
  
  var requester: js.UndefOr[RequesterAnonymous] = js.native
  
   // Required for anonymous requests
  var subject: String = js.native
  
   // Anonymous requests can set due date as long as type == task. Authenticated requests cannot
  var ticket_form_id: js.UndefOr[Double | Null] = js.native
  
   // Anonymous requests can set priority, Authenticated requests cannot
  var `type`: js.UndefOr[TicketType | Null] = js.native
}
object CreateModel {
  
  @scala.inline
  def apply(comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel, subject: String): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
  
  @scala.inline
  implicit class CreateModelOps[Self <: CreateModel] (val x: Self) extends AnyVal {
    
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
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaboratorsVarargs(value: (Collaborator | String | ZendeskID)*): Self = this.set("collaborators", js.Array(value :_*))
    
    @scala.inline
    def setCollaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollaborators: Self = this.set("collaborators", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = this.set("custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_fields: Self = this.set("custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsNull: Self = this.set("custom_fields", null)
    
    @scala.inline
    def setDue_at(value: String): Self = this.set("due_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDue_at: Self = this.set("due_at", js.undefined)
    
    @scala.inline
    def setDue_atNull: Self = this.set("due_at", null)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    
    @scala.inline
    def setRecipientNull: Self = this.set("recipient", null)
    
    @scala.inline
    def setRequester(value: RequesterAnonymous): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    
    @scala.inline
    def setTicket_form_id(value: Double): Self = this.set("ticket_form_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicket_form_id: Self = this.set("ticket_form_id", js.undefined)
    
    @scala.inline
    def setTicket_form_idNull: Self = this.set("ticket_form_id", null)
    
    @scala.inline
    def setType(value: TicketType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
