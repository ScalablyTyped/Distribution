package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOffItem extends ScheduleEntity {
  
  // ID of the timeOffReason for this timeOffItem. Required.
  var timeOffReasonId: js.UndefOr[NullableOption[String]] = js.native
}
object TimeOffItem {
  
  @scala.inline
  def apply(): TimeOffItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffItem]
  }
  
  @scala.inline
  implicit class TimeOffItemOps[Self <: TimeOffItem] (val x: Self) extends AnyVal {
    
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
    def setTimeOffReasonId(value: NullableOption[String]): Self = this.set("timeOffReasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffReasonId: Self = this.set("timeOffReasonId", js.undefined)
    
    @scala.inline
    def setTimeOffReasonIdNull: Self = this.set("timeOffReasonId", null)
  }
}
