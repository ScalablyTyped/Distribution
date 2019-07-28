package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#json-format|Zendesk Tickets JSON Format}
  */
trait ResponseModel extends AuditableModel {
  val allow_attachments: Boolean
   // Enterprise version only
  val allow_channelback: Boolean
  val assignee_id: ZendeskID | Null
   // Enterprise version only
  val brand_id: js.UndefOr[Double | Null] = js.undefined
  val collaborator_ids: js.Array[Double]
  val comment_count: js.UndefOr[Double] = js.undefined
  val custom_fields: js.Array[Field]
  val description: String
  val due_at: String | Null
  val email_cc_ids: js.Array[Double]
  val external_id: String | Null
  val fields: js.Array[Field]
  val follower_ids: js.Array[Double]
  val followup_ids: js.Array[Double]
  val forum_topic_id: Double | Null
  val group_id: Double | Null
  val has_incidents: Boolean
  val is_public: Boolean
  val organization_id: Double
  val priority: Priority | Null
  val problem_id: Double | Null
  val raw_subject: String | Null
  val recipient: String | Null
  val requester_id: ZendeskID
  val satisfaction_rating: js.Object | String | Null
  val sharing_agreement_ids: js.Array[Double]
  val status: Status
  val subject: String | Null
  val submitter_id: ZendeskID
  val tags: js.Array[String]
  val ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  val `type`: TicketType | Null
  val url: String
  val via: Via
}

object ResponseModel {
  @scala.inline
  def apply(
    allow_attachments: Boolean,
    allow_channelback: Boolean,
    collaborator_ids: js.Array[Double],
    created_at: String,
    custom_fields: js.Array[Field],
    description: String,
    email_cc_ids: js.Array[Double],
    fields: js.Array[Field],
    follower_ids: js.Array[Double],
    followup_ids: js.Array[Double],
    has_incidents: Boolean,
    id: ZendeskID,
    is_public: Boolean,
    organization_id: Double,
    requester_id: ZendeskID,
    sharing_agreement_ids: js.Array[Double],
    status: Status,
    submitter_id: ZendeskID,
    tags: js.Array[String],
    url: String,
    via: Via,
    assignee_id: js.UndefOr[ZendeskID] = js.undefined,
    brand_id: Int | Double = null,
    comment_count: Int | Double = null,
    due_at: String = null,
    external_id: String = null,
    forum_topic_id: Int | Double = null,
    group_id: Int | Double = null,
    priority: Priority = null,
    problem_id: Int | Double = null,
    raw_subject: String = null,
    recipient: String = null,
    satisfaction_rating: js.Object | String = null,
    subject: String = null,
    ticket_form_id: Int | Double = null,
    `type`: TicketType = null,
    updated_at: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(allow_attachments = allow_attachments, allow_channelback = allow_channelback, collaborator_ids = collaborator_ids, created_at = created_at, custom_fields = custom_fields, description = description, email_cc_ids = email_cc_ids, fields = fields, follower_ids = follower_ids, followup_ids = followup_ids, has_incidents = has_incidents, id = id, is_public = is_public, organization_id = organization_id, requester_id = requester_id, sharing_agreement_ids = sharing_agreement_ids, status = status, submitter_id = submitter_id, tags = tags, url = url, via = via)
    if (!js.isUndefined(assignee_id)) __obj.updateDynamic("assignee_id")(assignee_id)
    if (brand_id != null) __obj.updateDynamic("brand_id")(brand_id.asInstanceOf[js.Any])
    if (comment_count != null) __obj.updateDynamic("comment_count")(comment_count.asInstanceOf[js.Any])
    if (due_at != null) __obj.updateDynamic("due_at")(due_at)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (forum_topic_id != null) __obj.updateDynamic("forum_topic_id")(forum_topic_id.asInstanceOf[js.Any])
    if (group_id != null) __obj.updateDynamic("group_id")(group_id.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (problem_id != null) __obj.updateDynamic("problem_id")(problem_id.asInstanceOf[js.Any])
    if (raw_subject != null) __obj.updateDynamic("raw_subject")(raw_subject)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (satisfaction_rating != null) __obj.updateDynamic("satisfaction_rating")(satisfaction_rating.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (ticket_form_id != null) __obj.updateDynamic("ticket_form_id")(ticket_form_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[ResponseModel]
  }
}

