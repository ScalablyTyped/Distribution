package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.MetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  val agent_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val assigned_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val assignee_stations: js.UndefOr[scala.Double] = js.undefined
  val assignee_updated_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val first_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val full_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val group_stations: js.UndefOr[scala.Double] = js.undefined
  val initially_assigned_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val latest_comment_added_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val reopens: js.UndefOr[scala.Double] = js.undefined
  val replies: js.UndefOr[scala.Double] = js.undefined
  val reply_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val requester_updated_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val requester_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.undefined
  val solved_at: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val ticket_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined
  val url: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseModel {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    agent_wait_time_in_minutes: MinutesObject = null,
    assigned_at: java.lang.String = null,
    assignee_stations: scala.Int | scala.Double = null,
    assignee_updated_at: java.lang.String = null,
    first_resolution_time_in_minutes: MinutesObject = null,
    full_resolution_time_in_minutes: MinutesObject = null,
    group_stations: scala.Int | scala.Double = null,
    initially_assigned_at: java.lang.String = null,
    latest_comment_added_at: java.lang.String = null,
    reopens: scala.Int | scala.Double = null,
    replies: scala.Int | scala.Double = null,
    reply_time_in_minutes: MinutesObject = null,
    requester_updated_at: java.lang.String = null,
    requester_wait_time_in_minutes: MinutesObject = null,
    solved_at: java.lang.String = null,
    ticket_id: js.UndefOr[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID] = js.undefined,
    updated_at: java.lang.String = null,
    url: java.lang.String = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id)
    if (agent_wait_time_in_minutes != null) __obj.updateDynamic("agent_wait_time_in_minutes")(agent_wait_time_in_minutes)
    if (assigned_at != null) __obj.updateDynamic("assigned_at")(assigned_at)
    if (assignee_stations != null) __obj.updateDynamic("assignee_stations")(assignee_stations.asInstanceOf[js.Any])
    if (assignee_updated_at != null) __obj.updateDynamic("assignee_updated_at")(assignee_updated_at)
    if (first_resolution_time_in_minutes != null) __obj.updateDynamic("first_resolution_time_in_minutes")(first_resolution_time_in_minutes)
    if (full_resolution_time_in_minutes != null) __obj.updateDynamic("full_resolution_time_in_minutes")(full_resolution_time_in_minutes)
    if (group_stations != null) __obj.updateDynamic("group_stations")(group_stations.asInstanceOf[js.Any])
    if (initially_assigned_at != null) __obj.updateDynamic("initially_assigned_at")(initially_assigned_at)
    if (latest_comment_added_at != null) __obj.updateDynamic("latest_comment_added_at")(latest_comment_added_at)
    if (reopens != null) __obj.updateDynamic("reopens")(reopens.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (reply_time_in_minutes != null) __obj.updateDynamic("reply_time_in_minutes")(reply_time_in_minutes)
    if (requester_updated_at != null) __obj.updateDynamic("requester_updated_at")(requester_updated_at)
    if (requester_wait_time_in_minutes != null) __obj.updateDynamic("requester_wait_time_in_minutes")(requester_wait_time_in_minutes)
    if (solved_at != null) __obj.updateDynamic("solved_at")(solved_at)
    if (!js.isUndefined(ticket_id)) __obj.updateDynamic("ticket_id")(ticket_id)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResponseModel]
  }
}

