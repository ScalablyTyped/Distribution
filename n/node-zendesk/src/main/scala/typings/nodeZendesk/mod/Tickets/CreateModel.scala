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
    assignee_id: js.UndefOr[Null | ZendeskID] = js.undefined,
    brand_id: js.UndefOr[Null | Double] = js.undefined,
    collaborator_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    collaborators: js.UndefOr[Null | js.Array[_]] = js.undefined,
    custom_fields: js.UndefOr[Null | js.Array[Field]] = js.undefined,
    due_at: js.UndefOr[Null | String] = js.undefined,
    email_cc_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    external_id: js.UndefOr[Null | String] = js.undefined,
    fields: js.UndefOr[Null | js.Array[Field]] = js.undefined,
    follower_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    forum_topic_id: js.UndefOr[Null | Double] = js.undefined,
    group_id: js.UndefOr[Null | Double] = js.undefined,
    macro_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    organization_id: js.UndefOr[Null | Double] = js.undefined,
    priority: js.UndefOr[Null | Priority] = js.undefined,
    problem_id: js.UndefOr[Null | Double] = js.undefined,
    raw_subject: js.UndefOr[Null | String] = js.undefined,
    recipient: js.UndefOr[Null | String] = js.undefined,
    requester_id: js.UndefOr[ZendeskID] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined,
    subject: js.UndefOr[Null | String] = js.undefined,
    submitter_id: js.UndefOr[Null | ZendeskID] = js.undefined,
    tags: js.UndefOr[Null | js.Array[String]] = js.undefined,
    ticket_form_id: js.UndefOr[Null | Double] = js.undefined,
    `type`: js.UndefOr[Null | TicketType] = js.undefined,
    via_followup_source_id: js.UndefOr[Null | Double] = js.undefined
  ): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee_id)) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (!js.isUndefined(brand_id)) __obj.updateDynamic("brand_id")(brand_id.asInstanceOf[js.Any])
    if (!js.isUndefined(collaborator_ids)) __obj.updateDynamic("collaborator_ids")(collaborator_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(collaborators)) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_fields)) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(due_at)) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (!js.isUndefined(email_cc_ids)) __obj.updateDynamic("email_cc_ids")(email_cc_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(external_id)) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(follower_ids)) __obj.updateDynamic("follower_ids")(follower_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(forum_topic_id)) __obj.updateDynamic("forum_topic_id")(forum_topic_id.asInstanceOf[js.Any])
    if (!js.isUndefined(group_id)) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (!js.isUndefined(macro_ids)) __obj.updateDynamic("macro_ids")(macro_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(organization_id)) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(problem_id)) __obj.updateDynamic("problem_id")(problem_id.asInstanceOf[js.Any])
    if (!js.isUndefined(raw_subject)) __obj.updateDynamic("raw_subject")(raw_subject.asInstanceOf[js.Any])
    if (!js.isUndefined(recipient)) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (!js.isUndefined(requester_id)) __obj.updateDynamic("requester_id")(requester_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (!js.isUndefined(submitter_id)) __obj.updateDynamic("submitter_id")(submitter_id.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(ticket_form_id)) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(via_followup_source_id)) __obj.updateDynamic("via_followup_source_id")(via_followup_source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
}

