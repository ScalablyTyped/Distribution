package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.Tickets.Field
import typings.nodeZendesk.mod.Tickets.Priority
import typings.nodeZendesk.mod.Tickets.Status
import typings.nodeZendesk.mod.Tickets.TicketType
import typings.nodeZendesk.mod.Tickets.Via
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#json-format|Zendesk Requests JSON Format}
  */
@js.native
trait ResponseModel extends AuditableModel {
  val assignee_id: ZendeskID | Null = js.native
  val can_be_solved_by_me: js.UndefOr[Boolean] = js.native
  val collaborator_ids: js.Array[ZendeskID] = js.native
  val custom_fields: js.Array[Field] | Null = js.native
  val description: String = js.native
  val due_at: String | Null = js.native
  val email_cc_ids: js.Array[ZendeskID] = js.native
  val fields: js.Array[Field] | Null = js.native
  val followup_source_id: String | Null = js.native
  val group_id: js.UndefOr[ZendeskID | Null] = js.native
  val is_public: Boolean = js.native
  val organization_id: ZendeskID | Null = js.native
  val priority: Priority | Null = js.native
  val recipient: String | Null = js.native
  val requester_id: ZendeskID = js.native
  val solved: js.UndefOr[Boolean] = js.native
  val status: Status = js.native
  val subject: String = js.native
  val ticket_form_id: js.UndefOr[Double | Null] = js.native
  val `type`: TicketType | Null = js.native
  val url: String = js.native
  val via: Via = js.native
}

object ResponseModel {
  @scala.inline
  def apply(
    collaborator_ids: js.Array[ZendeskID],
    created_at: String,
    description: String,
    email_cc_ids: js.Array[ZendeskID],
    id: ZendeskID,
    is_public: Boolean,
    requester_id: ZendeskID,
    status: Status,
    subject: String,
    url: String,
    via: Via
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
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
    def setCollaborator_idsVarargs(value: ZendeskID*): Self = this.set("collaborator_ids", js.Array(value :_*))
    @scala.inline
    def setCollaborator_ids(value: js.Array[ZendeskID]): Self = this.set("collaborator_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail_cc_idsVarargs(value: ZendeskID*): Self = this.set("email_cc_ids", js.Array(value :_*))
    @scala.inline
    def setEmail_cc_ids(value: js.Array[ZendeskID]): Self = this.set("email_cc_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_public(value: Boolean): Self = this.set("is_public", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = this.set("requester_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVia(value: Via): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = this.set("assignee_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee_idNull: Self = this.set("assignee_id", null)
    @scala.inline
    def setCan_be_solved_by_me(value: Boolean): Self = this.set("can_be_solved_by_me", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCan_be_solved_by_me: Self = this.set("can_be_solved_by_me", js.undefined)
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = this.set("custom_fields", js.Array(value :_*))
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_fieldsNull: Self = this.set("custom_fields", null)
    @scala.inline
    def setDue_at(value: String): Self = this.set("due_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setDue_atNull: Self = this.set("due_at", null)
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    @scala.inline
    def setFollowup_source_id(value: String): Self = this.set("followup_source_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowup_source_idNull: Self = this.set("followup_source_id", null)
    @scala.inline
    def setGroup_id(value: ZendeskID): Self = this.set("group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_id: Self = this.set("group_id", js.undefined)
    @scala.inline
    def setGroup_idNull: Self = this.set("group_id", null)
    @scala.inline
    def setOrganization_id(value: ZendeskID): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization_idNull: Self = this.set("organization_id", null)
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipientNull: Self = this.set("recipient", null)
    @scala.inline
    def setSolved(value: Boolean): Self = this.set("solved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolved: Self = this.set("solved", js.undefined)
    @scala.inline
    def setTicket_form_id(value: Double): Self = this.set("ticket_form_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicket_form_id: Self = this.set("ticket_form_id", js.undefined)
    @scala.inline
    def setTicket_form_idNull: Self = this.set("ticket_form_id", null)
    @scala.inline
    def setType(value: TicketType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

