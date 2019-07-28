package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
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
  var comment: js.UndefOr[typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel] = js.undefined
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
    additional_collaborators: js.Array[_] = null,
    assignee_email: String = null,
    assignee_id: js.UndefOr[ZendeskID] = js.undefined,
    attribute_value_ids: js.Array[Double] = null,
    collaborator_ids: js.Array[Double] = null,
    comment: typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.CreateModel = null,
    custom_fields: js.Array[Field] = null,
    due_at: String = null,
    email_ccs: js.Array[EmailCC] = null,
    external_id: String = null,
    followers: js.Array[Follower] = null,
    group_id: Int | Double = null,
    macro_ids: js.Array[Double] = null,
    organization_id: Int | Double = null,
    priority: Priority = null,
    problem_id: Int | Double = null,
    requester_id: js.UndefOr[ZendeskID] = js.undefined,
    safe_update: js.UndefOr[Boolean] = js.undefined,
    sharing_agreement_ids: js.Array[Double] = null,
    status: Status = null,
    subject: String = null,
    tags: js.Array[String] = null,
    `type`: TicketType = null,
    updated_stamp: String = null
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (additional_collaborators != null) __obj.updateDynamic("additional_collaborators")(additional_collaborators)
    if (assignee_email != null) __obj.updateDynamic("assignee_email")(assignee_email)
    if (!js.isUndefined(assignee_id)) __obj.updateDynamic("assignee_id")(assignee_id)
    if (attribute_value_ids != null) __obj.updateDynamic("attribute_value_ids")(attribute_value_ids)
    if (collaborator_ids != null) __obj.updateDynamic("collaborator_ids")(collaborator_ids)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields)
    if (due_at != null) __obj.updateDynamic("due_at")(due_at)
    if (email_ccs != null) __obj.updateDynamic("email_ccs")(email_ccs)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (followers != null) __obj.updateDynamic("followers")(followers)
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (macro_ids != null) __obj.updateDynamic("macro_ids")(macro_ids)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (problem_id != null) __obj.updateDynamic("problem_id")(problem_id.asInstanceOf[js.Any])
    if (!js.isUndefined(requester_id)) __obj.updateDynamic("requester_id")(requester_id)
    if (!js.isUndefined(safe_update)) __obj.updateDynamic("safe_update")(safe_update)
    if (sharing_agreement_ids != null) __obj.updateDynamic("sharing_agreement_ids")(sharing_agreement_ids)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated_stamp != null) __obj.updateDynamic("updated_stamp")(updated_stamp)
    __obj.asInstanceOf[UpdateModel]
  }
}

