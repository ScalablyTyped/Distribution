package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.Tickets.Field
import typings.nodeZendesk.mod.Tickets.Priority
import typings.nodeZendesk.mod.Tickets.TicketType
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#create-request|Zendesk Requests Create}
  */
trait CreateModel extends StObject {
  
  var collaborators: js.UndefOr[js.Array[Collaborator | String | ZendeskID]] = js.undefined
  
  var comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel
  
  // Anonymous requests can set type, Authenticated requests cannot
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  
  var due_at: js.UndefOr[String | Null] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  
  var priority: js.UndefOr[Priority | Null] = js.undefined
  
  var recipient: js.UndefOr[String | Null] = js.undefined
  
  var requester: js.UndefOr[RequesterAnonymous] = js.undefined
  
  // Required for anonymous requests
  var subject: String
  
  // Anonymous requests can set due date as long as type == task. Authenticated requests cannot
  var ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  
  // Anonymous requests can set priority, Authenticated requests cannot
  var `type`: js.UndefOr[TicketType | Null] = js.undefined
}
object CreateModel {
  
  @scala.inline
  def apply(comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel, subject: String): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
  
  @scala.inline
  implicit class CreateModelMutableBuilder[Self <: CreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollaborators(value: js.Array[Collaborator | String | ZendeskID]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    @scala.inline
    def setCollaboratorsVarargs(value: (Collaborator | String | ZendeskID)*): Self = StObject.set(x, "collaborators", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    @scala.inline
    def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = StObject.set(x, "custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    @scala.inline
    def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    @scala.inline
    def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    @scala.inline
    def setRequester(value: RequesterAnonymous): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_form_id(value: Double): Self = StObject.set(x, "ticket_form_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_form_idNull: Self = StObject.set(x, "ticket_form_id", null)
    
    @scala.inline
    def setTicket_form_idUndefined: Self = StObject.set(x, "ticket_form_id", js.undefined)
    
    @scala.inline
    def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
