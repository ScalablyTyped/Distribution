package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#create-ticket|Zendesk Tickets Create}
  */
trait CreateModel extends js.Object {
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.undefined
  var brand_id: js.UndefOr[Double | Null] = js.undefined
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var collaborators: js.UndefOr[js.Array[_] | Null] = js.undefined
  var comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  var due_at: js.UndefOr[String | Null] = js.undefined
  var email_cc_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var external_id: js.UndefOr[String | Null] = js.undefined
  var fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  var follower_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var forum_topic_id: js.UndefOr[Double | Null] = js.undefined
  var group_id: js.UndefOr[Double | Null] = js.undefined
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var organization_id: js.UndefOr[Double | Null] = js.undefined
  var priority: js.UndefOr[Priority | Null] = js.undefined
  var problem_id: js.UndefOr[Double | Null] = js.undefined
  var raw_subject: js.UndefOr[String | Null] = js.undefined
  var recipient: js.UndefOr[String | Null] = js.undefined
  var requester_id: js.UndefOr[ZendeskID] = js.undefined
  var status: js.UndefOr[Status | Null] = js.undefined
  var subject: js.UndefOr[String | Null] = js.undefined
  var submitter_id: js.UndefOr[ZendeskID | Null] = js.undefined
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  var ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  var `type`: js.UndefOr[TicketType | Null] = js.undefined
  var via_followup_source_id: js.UndefOr[Double | Null] = js.undefined
}

object CreateModel {
  @scala.inline
  def apply(
    comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel,
    assignee_id: Int | Double = null,
    brand_id: Int | Double = null,
    collaborator_ids: js.Array[Double] = null,
    collaborators: js.Array[_] = null,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    email_cc_ids: js.Array[Double] = null,
    external_id: String = null,
    fields: js.Array[Field] = null,
    follower_ids: js.Array[Double] = null,
    forum_topic_id: Int | Double = null,
    group_id: Int | Double = null,
    macro_ids: js.Array[Double] = null,
    organization_id: Int | Double = null,
    priority: Priority = null,
    problem_id: Int | Double = null,
    raw_subject: String = null,
    recipient: String = null,
    requester_id: Int | Double = null,
    status: Status = null,
    subject: String = null,
    submitter_id: Int | Double = null,
    tags: js.Array[String] = null,
    ticket_form_id: Int | Double = null,
    `type`: TicketType = null,
    via_followup_source_id: Int | Double = null
  ): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    if (assignee_id != null) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (brand_id != null) __obj.updateDynamic("brand_id")(brand_id.asInstanceOf[js.Any])
    if (collaborator_ids != null) __obj.updateDynamic("collaborator_ids")(collaborator_ids.asInstanceOf[js.Any])
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (due_at != null) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (email_cc_ids != null) __obj.updateDynamic("email_cc_ids")(email_cc_ids.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (follower_ids != null) __obj.updateDynamic("follower_ids")(follower_ids.asInstanceOf[js.Any])
    if (forum_topic_id != null) __obj.updateDynamic("forum_topic_id")(forum_topic_id.asInstanceOf[js.Any])
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (macro_ids != null) __obj.updateDynamic("macro_ids")(macro_ids.asInstanceOf[js.Any])
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (problem_id != null) __obj.updateDynamic("problem_id")(problem_id.asInstanceOf[js.Any])
    if (raw_subject != null) __obj.updateDynamic("raw_subject")(raw_subject.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (requester_id != null) __obj.updateDynamic("requester_id")(requester_id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (submitter_id != null) __obj.updateDynamic("submitter_id")(submitter_id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (via_followup_source_id != null) __obj.updateDynamic("via_followup_source_id")(via_followup_source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
}

