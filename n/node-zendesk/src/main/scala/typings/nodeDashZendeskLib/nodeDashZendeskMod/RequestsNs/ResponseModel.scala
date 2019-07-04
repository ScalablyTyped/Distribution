package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#json-format|Zendesk Requests JSON Format}
  */
trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  val assignee_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID | scala.Null
  val can_be_solved_by_me: js.UndefOr[scala.Boolean] = js.undefined
  val collaborator_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]
  val custom_fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] | scala.Null
  val description: java.lang.String
  val due_at: java.lang.String | scala.Null
  val email_cc_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID]
  val fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] | scala.Null
  val followup_source_id: java.lang.String | scala.Null
  val group_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID | scala.Null] = js.undefined
  val is_public: scala.Boolean
  val organization_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID | scala.Null
  val priority: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority | scala.Null
  val recipient: java.lang.String | scala.Null
  val requester_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val solved: js.UndefOr[scala.Boolean] = js.undefined
  val status: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  val subject: java.lang.String
  val ticket_form_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
  val `type`: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType | scala.Null
  val url: java.lang.String
  val via: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Via
}

object ResponseModel {
  @scala.inline
  def apply(
    collaborator_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    created_at: java.lang.String,
    description: java.lang.String,
    email_cc_ids: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    is_public: scala.Boolean,
    requester_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    status: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status,
    subject: java.lang.String,
    url: java.lang.String,
    via: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Via,
    assignee_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    can_be_solved_by_me: js.UndefOr[scala.Boolean] = js.undefined,
    custom_fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] = null,
    due_at: java.lang.String = null,
    fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] = null,
    followup_source_id: java.lang.String = null,
    group_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    organization_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    priority: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority = null,
    recipient: java.lang.String = null,
    solved: js.UndefOr[scala.Boolean] = js.undefined,
    ticket_form_id: scala.Int | scala.Double = null,
    `type`: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType = null,
    updated_at: java.lang.String = null
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

