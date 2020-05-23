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
    custom_fields: js.UndefOr[Null | js.Array[Field]] = js.undefined,
    due_at: js.UndefOr[Null | String] = js.undefined,
    fields: js.UndefOr[Null | js.Array[Field]] = js.undefined,
    priority: js.UndefOr[Null | Priority] = js.undefined,
    recipient: js.UndefOr[Null | String] = js.undefined,
    requester: RequesterAnonymous = null,
    ticket_form_id: js.UndefOr[Null | Double] = js.undefined,
    `type`: js.UndefOr[Null | TicketType] = js.undefined
  ): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_fields)) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(due_at)) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(recipient)) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (!js.isUndefined(ticket_form_id)) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
}

