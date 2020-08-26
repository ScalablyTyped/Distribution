package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertHistoryState extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var assignedTo: js.UndefOr[String] = js.native
  var comments: js.UndefOr[js.Array[String]] = js.native
  var feedback: js.UndefOr[AlertFeedback] = js.native
  var status: js.UndefOr[AlertStatus] = js.native
  var updatedDateTime: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
}

object AlertHistoryState {
  @scala.inline
  def apply(): AlertHistoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertHistoryState]
  }
  @scala.inline
  implicit class AlertHistoryStateOps[Self <: AlertHistoryState] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[String]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setFeedback(value: AlertFeedback): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    @scala.inline
    def setStatus(value: AlertStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUpdatedDateTime(value: String): Self = this.set("updatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedDateTime: Self = this.set("updatedDateTime", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

