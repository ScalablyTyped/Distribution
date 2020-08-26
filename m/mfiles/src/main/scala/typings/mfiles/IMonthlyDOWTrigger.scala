package typings.mfiles

import typings.mfiles.MFiles.MFTriggerMonth
import typings.mfiles.MFiles.MFTriggerWeekDay
import typings.mfiles.MFiles.MFTriggerWeekOfMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonthlyDOWTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  var Months: MFTriggerMonth = js.native
  var WhichWeek: MFTriggerWeekOfMonth = js.native
}

object IMonthlyDOWTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, Months: MFTriggerMonth, WhichWeek: MFTriggerWeekOfMonth): IMonthlyDOWTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], WhichWeek = WhichWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthlyDOWTrigger]
  }
  @scala.inline
  implicit class IMonthlyDOWTriggerOps[Self <: IMonthlyDOWTrigger] (val x: Self) extends AnyVal {
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
    def setDaysOfTheWeek(value: MFTriggerWeekDay): Self = this.set("DaysOfTheWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: MFTriggerMonth): Self = this.set("Months", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhichWeek(value: MFTriggerWeekOfMonth): Self = this.set("WhichWeek", value.asInstanceOf[js.Any])
  }
  
}

