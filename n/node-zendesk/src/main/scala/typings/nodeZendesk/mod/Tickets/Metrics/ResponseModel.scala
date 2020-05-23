package typings.nodeZendesk.mod.Tickets.Metrics

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel extends AuditableModel {
  val agent_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val assigned_at: js.UndefOr[String | Null] = js.undefined
  val assignee_stations: js.UndefOr[Double] = js.undefined
  val assignee_updated_at: js.UndefOr[String | Null] = js.undefined
  val first_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val full_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val group_stations: js.UndefOr[Double] = js.undefined
  val initially_assigned_at: js.UndefOr[String | Null] = js.undefined
  val latest_comment_added_at: js.UndefOr[String | Null] = js.undefined
  val reopens: js.UndefOr[Double] = js.undefined
  val replies: js.UndefOr[Double] = js.undefined
  val reply_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val requester_updated_at: js.UndefOr[String | Null] = js.undefined
  val requester_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val solved_at: js.UndefOr[String | Null] = js.undefined
  val ticket_id: js.UndefOr[ZendeskID] = js.undefined
  val url: js.UndefOr[String] = js.undefined
}

object ResponseModel {
  @scala.inline
  def apply(
    created_at: String,
    id: ZendeskID,
    agent_wait_time_in_minutes: MinutesObject = null,
    assigned_at: js.UndefOr[Null | String] = js.undefined,
    assignee_stations: js.UndefOr[Double] = js.undefined,
    assignee_updated_at: js.UndefOr[Null | String] = js.undefined,
    first_resolution_time_in_minutes: MinutesObject = null,
    full_resolution_time_in_minutes: MinutesObject = null,
    group_stations: js.UndefOr[Double] = js.undefined,
    initially_assigned_at: js.UndefOr[Null | String] = js.undefined,
    latest_comment_added_at: js.UndefOr[Null | String] = js.undefined,
    reopens: js.UndefOr[Double] = js.undefined,
    replies: js.UndefOr[Double] = js.undefined,
    reply_time_in_minutes: MinutesObject = null,
    requester_updated_at: js.UndefOr[Null | String] = js.undefined,
    requester_wait_time_in_minutes: MinutesObject = null,
    solved_at: js.UndefOr[Null | String] = js.undefined,
    ticket_id: js.UndefOr[ZendeskID] = js.undefined,
    updated_at: String = null,
    url: String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    if (agent_wait_time_in_minutes != null) __obj.updateDynamic("agent_wait_time_in_minutes")(agent_wait_time_in_minutes.asInstanceOf[js.Any])
    if (!js.isUndefined(assigned_at)) __obj.updateDynamic("assigned_at")(assigned_at.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee_stations)) __obj.updateDynamic("assignee_stations")(assignee_stations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee_updated_at)) __obj.updateDynamic("assignee_updated_at")(assignee_updated_at.asInstanceOf[js.Any])
    if (first_resolution_time_in_minutes != null) __obj.updateDynamic("first_resolution_time_in_minutes")(first_resolution_time_in_minutes.asInstanceOf[js.Any])
    if (full_resolution_time_in_minutes != null) __obj.updateDynamic("full_resolution_time_in_minutes")(full_resolution_time_in_minutes.asInstanceOf[js.Any])
    if (!js.isUndefined(group_stations)) __obj.updateDynamic("group_stations")(group_stations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initially_assigned_at)) __obj.updateDynamic("initially_assigned_at")(initially_assigned_at.asInstanceOf[js.Any])
    if (!js.isUndefined(latest_comment_added_at)) __obj.updateDynamic("latest_comment_added_at")(latest_comment_added_at.asInstanceOf[js.Any])
    if (!js.isUndefined(reopens)) __obj.updateDynamic("reopens")(reopens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replies)) __obj.updateDynamic("replies")(replies.get.asInstanceOf[js.Any])
    if (reply_time_in_minutes != null) __obj.updateDynamic("reply_time_in_minutes")(reply_time_in_minutes.asInstanceOf[js.Any])
    if (!js.isUndefined(requester_updated_at)) __obj.updateDynamic("requester_updated_at")(requester_updated_at.asInstanceOf[js.Any])
    if (requester_wait_time_in_minutes != null) __obj.updateDynamic("requester_wait_time_in_minutes")(requester_wait_time_in_minutes.asInstanceOf[js.Any])
    if (!js.isUndefined(solved_at)) __obj.updateDynamic("solved_at")(solved_at.asInstanceOf[js.Any])
    if (!js.isUndefined(ticket_id)) __obj.updateDynamic("ticket_id")(ticket_id.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

