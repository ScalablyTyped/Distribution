package typings.nodeDashZendesk.nodeDashZendeskMod.Requests

import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Field
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Priority
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Status
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.TicketType
import typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Via
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
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
    assignee_id: Int | Double = null,
    can_be_solved_by_me: js.UndefOr[Boolean] = js.undefined,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    fields: js.Array[Field] = null,
    followup_source_id: String = null,
    group_id: Int | Double = null,
    organization_id: Int | Double = null,
    priority: Priority = null,
    recipient: String = null,
    solved: js.UndefOr[Boolean] = js.undefined,
    ticket_form_id: Int | Double = null,
    `type`: TicketType = null,
    updated_at: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    if (assignee_id != null) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (!js.isUndefined(can_be_solved_by_me)) __obj.updateDynamic("can_be_solved_by_me")(can_be_solved_by_me.asInstanceOf[js.Any])
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (due_at != null) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (followup_source_id != null) __obj.updateDynamic("followup_source_id")(followup_source_id.asInstanceOf[js.Any])
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved.asInstanceOf[js.Any])
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

