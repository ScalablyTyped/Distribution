package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#json-format|Zendesk Tickets JSON Format}
  */
trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  val allow_attachments: scala.Boolean
   // Enterprise version only
  val allow_channelback: scala.Boolean
  val assignee_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID | scala.Null
   // Enterprise version only
  val brand_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
  val collaborator_ids: js.Array[scala.Double]
  val comment_count: js.UndefOr[scala.Double] = js.undefined
  val custom_fields: js.Array[Field]
  val description: java.lang.String
  val due_at: java.lang.String | scala.Null
  val email_cc_ids: js.Array[scala.Double]
  val external_id: java.lang.String | scala.Null
  val fields: js.Array[Field]
  val follower_ids: js.Array[scala.Double]
  val followup_ids: js.Array[scala.Double]
  val forum_topic_id: scala.Double | scala.Null
  val group_id: scala.Double | scala.Null
  val has_incidents: scala.Boolean
  val is_public: scala.Boolean
  val organization_id: scala.Double
  val priority: Priority | scala.Null
  val problem_id: scala.Double | scala.Null
  val raw_subject: java.lang.String | scala.Null
  val recipient: java.lang.String | scala.Null
  val requester_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val satisfaction_rating: js.Object | java.lang.String | scala.Null
  val sharing_agreement_ids: js.Array[scala.Double]
  val status: Status
  val subject: java.lang.String | scala.Null
  val submitter_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID
  val tags: js.Array[java.lang.String]
  val ticket_form_id: js.UndefOr[scala.Double | scala.Null] = js.undefined
  val `type`: TicketType | scala.Null
  val url: java.lang.String
  val via: Via
}

object ResponseModel {
  @scala.inline
  def apply(
    allow_attachments: scala.Boolean,
    allow_channelback: scala.Boolean,
    collaborator_ids: js.Array[scala.Double],
    created_at: java.lang.String,
    custom_fields: js.Array[Field],
    description: java.lang.String,
    email_cc_ids: js.Array[scala.Double],
    fields: js.Array[Field],
    follower_ids: js.Array[scala.Double],
    followup_ids: js.Array[scala.Double],
    has_incidents: scala.Boolean,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    is_public: scala.Boolean,
    organization_id: scala.Double,
    requester_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    sharing_agreement_ids: js.Array[scala.Double],
    status: Status,
    submitter_id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    tags: js.Array[java.lang.String],
    url: java.lang.String,
    via: Via,
    assignee_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    brand_id: scala.Int | scala.Double = null,
    comment_count: scala.Int | scala.Double = null,
    due_at: java.lang.String = null,
    external_id: java.lang.String = null,
    forum_topic_id: scala.Int | scala.Double = null,
    group_id: scala.Int | scala.Double = null,
    priority: Priority = null,
    problem_id: scala.Int | scala.Double = null,
    raw_subject: java.lang.String = null,
    recipient: java.lang.String = null,
    satisfaction_rating: js.Object | java.lang.String = null,
    subject: java.lang.String = null,
    ticket_form_id: scala.Int | scala.Double = null,
    `type`: TicketType = null,
    updated_at: java.lang.String = null
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

