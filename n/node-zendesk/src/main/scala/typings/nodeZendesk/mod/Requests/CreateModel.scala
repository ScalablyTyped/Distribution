package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.Tickets.Field
import typings.nodeZendesk.mod.Tickets.Priority
import typings.nodeZendesk.mod.Tickets.TicketType
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/requests#create-request|Zendesk Requests Create}
  */
trait CreateModel extends js.Object {
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
  def apply(
    comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel,
    subject: String,
    collaborators: js.Array[Collaborator | String | ZendeskID] = null,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    fields: js.Array[Field] = null,
    priority: Priority = null,
    recipient: String = null,
    requester: RequesterAnonymous = null,
    ticket_form_id: Int | Double = null,
    `type`: TicketType = null
  ): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (due_at != null) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
}

