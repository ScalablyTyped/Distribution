package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarSharingMessage extends Message {
  
  var canAccept: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var sharingMessageAction: js.UndefOr[NullableOption[CalendarSharingMessageAction]] = js.native
  
  var sharingMessageActions: js.UndefOr[NullableOption[js.Array[CalendarSharingMessageAction]]] = js.native
  
  var suggestedCalendarName: js.UndefOr[NullableOption[String]] = js.native
}
object CalendarSharingMessage {
  
  @scala.inline
  def apply(): CalendarSharingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessage]
  }
  
  @scala.inline
  implicit class CalendarSharingMessageOps[Self <: CalendarSharingMessage] (val x: Self) extends AnyVal {
    
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
    def setCanAccept(value: NullableOption[Boolean]): Self = this.set("canAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanAccept: Self = this.set("canAccept", js.undefined)
    
    @scala.inline
    def setCanAcceptNull: Self = this.set("canAccept", null)
    
    @scala.inline
    def setSharingMessageAction(value: NullableOption[CalendarSharingMessageAction]): Self = this.set("sharingMessageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingMessageAction: Self = this.set("sharingMessageAction", js.undefined)
    
    @scala.inline
    def setSharingMessageActionNull: Self = this.set("sharingMessageAction", null)
    
    @scala.inline
    def setSharingMessageActionsVarargs(value: CalendarSharingMessageAction*): Self = this.set("sharingMessageActions", js.Array(value :_*))
    
    @scala.inline
    def setSharingMessageActions(value: NullableOption[js.Array[CalendarSharingMessageAction]]): Self = this.set("sharingMessageActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingMessageActions: Self = this.set("sharingMessageActions", js.undefined)
    
    @scala.inline
    def setSharingMessageActionsNull: Self = this.set("sharingMessageActions", null)
    
    @scala.inline
    def setSuggestedCalendarName(value: NullableOption[String]): Self = this.set("suggestedCalendarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedCalendarName: Self = this.set("suggestedCalendarName", js.undefined)
    
    @scala.inline
    def setSuggestedCalendarNameNull: Self = this.set("suggestedCalendarName", null)
  }
}
