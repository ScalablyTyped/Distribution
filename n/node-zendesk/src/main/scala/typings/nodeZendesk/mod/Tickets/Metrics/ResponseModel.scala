package typings.nodeZendesk.mod.Tickets.Metrics

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseModel extends AuditableModel {
  val agent_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val assigned_at: js.UndefOr[String | Null] = js.native
  val assignee_stations: js.UndefOr[Double] = js.native
  val assignee_updated_at: js.UndefOr[String | Null] = js.native
  val first_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val full_resolution_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val group_stations: js.UndefOr[Double] = js.native
  val initially_assigned_at: js.UndefOr[String | Null] = js.native
  val latest_comment_added_at: js.UndefOr[String | Null] = js.native
  val reopens: js.UndefOr[Double] = js.native
  val replies: js.UndefOr[Double] = js.native
  val reply_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val requester_updated_at: js.UndefOr[String | Null] = js.native
  val requester_wait_time_in_minutes: js.UndefOr[MinutesObject] = js.native
  val solved_at: js.UndefOr[String | Null] = js.native
  val ticket_id: js.UndefOr[ZendeskID] = js.native
  val url: js.UndefOr[String] = js.native
}

object ResponseModel {
  @scala.inline
  def apply(created_at: String, id: ZendeskID): ResponseModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent_wait_time_in_minutes(value: MinutesObject): Self = this.set("agent_wait_time_in_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent_wait_time_in_minutes: Self = this.set("agent_wait_time_in_minutes", js.undefined)
    @scala.inline
    def setAssigned_at(value: String): Self = this.set("assigned_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigned_at: Self = this.set("assigned_at", js.undefined)
    @scala.inline
    def setAssigned_atNull: Self = this.set("assigned_at", null)
    @scala.inline
    def setAssignee_stations(value: Double): Self = this.set("assignee_stations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee_stations: Self = this.set("assignee_stations", js.undefined)
    @scala.inline
    def setAssignee_updated_at(value: String): Self = this.set("assignee_updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee_updated_at: Self = this.set("assignee_updated_at", js.undefined)
    @scala.inline
    def setAssignee_updated_atNull: Self = this.set("assignee_updated_at", null)
    @scala.inline
    def setFirst_resolution_time_in_minutes(value: MinutesObject): Self = this.set("first_resolution_time_in_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_resolution_time_in_minutes: Self = this.set("first_resolution_time_in_minutes", js.undefined)
    @scala.inline
    def setFull_resolution_time_in_minutes(value: MinutesObject): Self = this.set("full_resolution_time_in_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFull_resolution_time_in_minutes: Self = this.set("full_resolution_time_in_minutes", js.undefined)
    @scala.inline
    def setGroup_stations(value: Double): Self = this.set("group_stations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_stations: Self = this.set("group_stations", js.undefined)
    @scala.inline
    def setInitially_assigned_at(value: String): Self = this.set("initially_assigned_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitially_assigned_at: Self = this.set("initially_assigned_at", js.undefined)
    @scala.inline
    def setInitially_assigned_atNull: Self = this.set("initially_assigned_at", null)
    @scala.inline
    def setLatest_comment_added_at(value: String): Self = this.set("latest_comment_added_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest_comment_added_at: Self = this.set("latest_comment_added_at", js.undefined)
    @scala.inline
    def setLatest_comment_added_atNull: Self = this.set("latest_comment_added_at", null)
    @scala.inline
    def setReopens(value: Double): Self = this.set("reopens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReopens: Self = this.set("reopens", js.undefined)
    @scala.inline
    def setReplies(value: Double): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setReply_time_in_minutes(value: MinutesObject): Self = this.set("reply_time_in_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_time_in_minutes: Self = this.set("reply_time_in_minutes", js.undefined)
    @scala.inline
    def setRequester_updated_at(value: String): Self = this.set("requester_updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester_updated_at: Self = this.set("requester_updated_at", js.undefined)
    @scala.inline
    def setRequester_updated_atNull: Self = this.set("requester_updated_at", null)
    @scala.inline
    def setRequester_wait_time_in_minutes(value: MinutesObject): Self = this.set("requester_wait_time_in_minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester_wait_time_in_minutes: Self = this.set("requester_wait_time_in_minutes", js.undefined)
    @scala.inline
    def setSolved_at(value: String): Self = this.set("solved_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolved_at: Self = this.set("solved_at", js.undefined)
    @scala.inline
    def setSolved_atNull: Self = this.set("solved_at", null)
    @scala.inline
    def setTicket_id(value: ZendeskID): Self = this.set("ticket_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicket_id: Self = this.set("ticket_id", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

