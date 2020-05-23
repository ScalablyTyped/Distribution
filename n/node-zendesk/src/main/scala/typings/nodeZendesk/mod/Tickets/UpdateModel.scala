package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#update-ticket|Zendesk Tickets Update}
  */
trait UpdateModel extends js.Object {
  var additional_collaborators: js.UndefOr[js.Array[_] | Null] = js.undefined
  var assignee_email: js.UndefOr[String | Null] = js.undefined
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.undefined
  var attribute_value_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.undefined
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  var due_at: js.UndefOr[String | Null] = js.undefined
  var email_ccs: js.UndefOr[js.Array[EmailCC] | Null] = js.undefined
  var external_id: js.UndefOr[String | Null] = js.undefined
  var followers: js.UndefOr[js.Array[Follower] | Null] = js.undefined
  var group_id: js.UndefOr[Double | Null] = js.undefined
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var organization_id: js.UndefOr[Double | Null] = js.undefined
  var priority: js.UndefOr[Priority | Null] = js.undefined
  var problem_id: js.UndefOr[Double | Null] = js.undefined
  var requester_id: js.UndefOr[ZendeskID] = js.undefined
  var safe_update: js.UndefOr[Boolean] = js.undefined
  var sharing_agreement_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var status: js.UndefOr[Status | Null] = js.undefined
  var subject: js.UndefOr[String | Null] = js.undefined
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  var `type`: js.UndefOr[TicketType | Null] = js.undefined
  var updated_stamp: js.UndefOr[String | Null] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    additional_collaborators: js.UndefOr[Null | js.Array[_]] = js.undefined,
    assignee_email: js.UndefOr[Null | String] = js.undefined,
    assignee_id: js.UndefOr[Null | ZendeskID] = js.undefined,
    attribute_value_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    collaborator_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel = null,
    custom_fields: js.UndefOr[Null | js.Array[Field]] = js.undefined,
    due_at: js.UndefOr[Null | String] = js.undefined,
    email_ccs: js.UndefOr[Null | js.Array[EmailCC]] = js.undefined,
    external_id: js.UndefOr[Null | String] = js.undefined,
    followers: js.UndefOr[Null | js.Array[Follower]] = js.undefined,
    group_id: js.UndefOr[Null | Double] = js.undefined,
    macro_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    organization_id: js.UndefOr[Null | Double] = js.undefined,
    priority: js.UndefOr[Null | Priority] = js.undefined,
    problem_id: js.UndefOr[Null | Double] = js.undefined,
    requester_id: js.UndefOr[ZendeskID] = js.undefined,
    safe_update: js.UndefOr[Boolean] = js.undefined,
    sharing_agreement_ids: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined,
    subject: js.UndefOr[Null | String] = js.undefined,
    tags: js.UndefOr[Null | js.Array[String]] = js.undefined,
    `type`: js.UndefOr[Null | TicketType] = js.undefined,
    updated_stamp: js.UndefOr[Null | String] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additional_collaborators)) __obj.updateDynamic("additional_collaborators")(additional_collaborators.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee_email)) __obj.updateDynamic("assignee_email")(assignee_email.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee_id)) __obj.updateDynamic("assignee_id")(assignee_id.asInstanceOf[js.Any])
    if (!js.isUndefined(attribute_value_ids)) __obj.updateDynamic("attribute_value_ids")(attribute_value_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(collaborator_ids)) __obj.updateDynamic("collaborator_ids")(collaborator_ids.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_fields)) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(due_at)) __obj.updateDynamic("due_at")(due_at.asInstanceOf[js.Any])
    if (!js.isUndefined(email_ccs)) __obj.updateDynamic("email_ccs")(email_ccs.asInstanceOf[js.Any])
    if (!js.isUndefined(external_id)) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(followers)) __obj.updateDynamic("followers")(followers.asInstanceOf[js.Any])
    if (!js.isUndefined(group_id)) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (!js.isUndefined(macro_ids)) __obj.updateDynamic("macro_ids")(macro_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(organization_id)) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(problem_id)) __obj.updateDynamic("problem_id")(problem_id.asInstanceOf[js.Any])
    if (!js.isUndefined(requester_id)) __obj.updateDynamic("requester_id")(requester_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safe_update)) __obj.updateDynamic("safe_update")(safe_update.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharing_agreement_ids)) __obj.updateDynamic("sharing_agreement_ids")(sharing_agreement_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updated_stamp)) __obj.updateDynamic("updated_stamp")(updated_stamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModel]
  }
}

