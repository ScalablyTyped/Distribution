package typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.Field
import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.Priority
import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.Status
import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.TicketType
import typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.Via
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
    assignee_id: js.UndefOr[ZendeskID] = js.undefined,
    can_be_solved_by_me: js.UndefOr[Boolean] = js.undefined,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    fields: js.Array[Field] = null,
    followup_source_id: String = null,
    group_id: js.UndefOr[ZendeskID] = js.undefined,
    organization_id: js.UndefOr[ZendeskID] = js.undefined,
    priority: Priority = null,
    recipient: String = null,
    solved: js.UndefOr[Boolean] = js.undefined,
    ticket_form_id: Int | Double = null,
    `type`: TicketType = null,
    updated_at: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(collaborator_ids = collaborator_ids, created_at = created_at, description = description, email_cc_ids = email_cc_ids, id = id, is_public = is_public, requester_id = requester_id, status = status, subject = subject, url = url, via = via)
    if (!js.isUndefined(assignee_id)) __obj.updateDynamic("assignee_id")(assignee_id)
    if (!js.isUndefined(can_be_solved_by_me)) __obj.updateDynamic("can_be_solved_by_me")(can_be_solved_by_me)
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields)
    if (due_at != null) __obj.updateDynamic("due_at")(due_at)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (followup_source_id != null) __obj.updateDynamic("followup_source_id")(followup_source_id)
    if (!js.isUndefined(group_id)) __obj.updateDynamic("group_id")(group_id)
    if (!js.isUndefined(organization_id)) __obj.updateDynamic("organization_id")(organization_id)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (!js.isUndefined(solved)) __obj.updateDynamic("solved")(solved)
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[ResponseModel]
  }
}

