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
trait ResponseModel extends AuditableModel {
  val assignee_id: ZendeskID | Null
  val can_be_solved_by_me: js.UndefOr[Boolean] = js.undefined
  val collaborator_ids: js.Array[ZendeskID]
  val custom_fields: js.Array[Field] | Null
  val description: String
  val due_at: String | Null
  val email_cc_ids: js.Array[ZendeskID]
  val fields: js.Array[Field] | Null
  val followup_source_id: String | Null
  val group_id: js.UndefOr[ZendeskID | Null] = js.undefined
  val is_public: Boolean
  val organization_id: ZendeskID | Null
  val priority: Priority | Null
  val recipient: String | Null
  val requester_id: ZendeskID
  val solved: js.UndefOr[Boolean] = js.undefined
  val status: Status
  val subject: String
  val ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  val `type`: TicketType | Null
  val url: String
  val via: Via
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
    via: Via,
    assignee_id: ZendeskID = null.asInstanceOf[ZendeskID],
    can_be_solved_by_me: js.UndefOr[Boolean] = js.undefined,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    fields: js.Array[Field] = null,
    followup_source_id: String = null,
    group_id: js.UndefOr[Null | ZendeskID] = js.undefined,
    organization_id: ZendeskID = null.asInstanceOf[ZendeskID],
    priority: Priority = null,
    recipient: String = null,
    solved: js.UndefOr[Boolean] = js.undefined,
    ticket_form_id: js.UndefOr[Null | Double] = js.undefined,
    `type`: TicketType = null,
    updated_at: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any], assignee_id = assignee_id.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], due_at = due_at.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], followup_source_id = followup_source_id.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    if (!js.isUndefined(can_be_solved_by_me)) __obj.updateDynamic("can_be_solved_by_me")(can_be_solved_by_me.get.asInstanceOf[js.Any])
    if (!js.isUndefined(group_id)) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticket_form_id)) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

