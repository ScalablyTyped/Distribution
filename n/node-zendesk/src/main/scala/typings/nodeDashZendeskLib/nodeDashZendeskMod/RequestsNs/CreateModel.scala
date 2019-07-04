package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#create-request|Zendesk Requests Create}
  */
trait CreateModel extends js.Object {
  var collaborators: js.UndefOr[
    js.Array[
      Collaborator | java.lang.String | nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
    ]
  ] = js.undefined
  var comment: nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel
   // Anonymous requests can set type, Authenticated requests cannot
  var custom_fields: js.UndefOr[js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] | scala.Null] = js.undefined
  var due_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fields: js.UndefOr[js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] | scala.Null] = js.undefined
  var priority: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority | scala.Null] = js.undefined
  var recipient: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var requester: js.UndefOr[RequesterAnonymous] = js.undefined
   // Required for anonymous requests
  var subject: java.lang.String
   // Anonymous requests can set due date as long as type == task. Authenticated requests cannot
  var ticket_form_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
   // Anonymous requests can set priority, Authenticated requests cannot
  var `type`: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType | scala.Null] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    comment: nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel,
    subject: java.lang.String,
    collaborators: js.Array[
      Collaborator | java.lang.String | nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
    ] = null,
    custom_fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] = null,
    due_at: java.lang.String = null,
    fields: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Field] = null,
    priority: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority = null,
    recipient: java.lang.String = null,
    requester: RequesterAnonymous = null,
    ticket_form_id: scala.Int | scala.Double = null,
    `type`: nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType = null
  ): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment, subject = subject)
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators)
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields)
    if (due_at != null) __obj.updateDynamic("due_at")(due_at)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (requester != null) __obj.updateDynamic("requester")(requester)
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateModel]
  }
}

