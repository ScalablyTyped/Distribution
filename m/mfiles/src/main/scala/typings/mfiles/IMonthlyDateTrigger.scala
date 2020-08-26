package typings.mfiles

import typings.mfiles.MFiles.MFTriggerMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMonthlyDateTrigger extends js.Object {
  var Days: Double = js.native
  var Months: MFTriggerMonth = js.native
}

object IMonthlyDateTrigger {
  @scala.inline
  def apply(Days: Double, Months: MFTriggerMonth): IMonthlyDateTrigger = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonthlyDateTrigger]
  }
  @scala.inline
  implicit class IMonthlyDateTriggerOps[Self <: IMonthlyDateTrigger] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: MFTriggerMonth): Self = this.set("Months", value.asInstanceOf[js.Any])
  }
  
}

