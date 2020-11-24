package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertHistoryState extends js.Object {
  
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  var assignedTo: js.UndefOr[NullableOption[String]] = js.native
  
  var comments: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var feedback: js.UndefOr[NullableOption[AlertFeedback]] = js.native
  
  var status: js.UndefOr[NullableOption[AlertStatus]] = js.native
  
  var updatedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var user: js.UndefOr[NullableOption[String]] = js.native
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
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setAssignedTo(value: NullableOption[String]): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    
    @scala.inline
    def setAssignedToNull: Self = this.set("assignedTo", null)
    
    @scala.inline
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: NullableOption[js.Array[String]]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setFeedback(value: NullableOption[AlertFeedback]): Self = this.set("feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    
    @scala.inline
    def setFeedbackNull: Self = this.set("feedback", null)
    
    @scala.inline
    def setStatus(value: NullableOption[AlertStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setUpdatedDateTime(value: NullableOption[String]): Self = this.set("updatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedDateTime: Self = this.set("updatedDateTime", js.undefined)
    
    @scala.inline
    def setUpdatedDateTimeNull: Self = this.set("updatedDateTime", null)
    
    @scala.inline
    def setUser(value: NullableOption[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
}
