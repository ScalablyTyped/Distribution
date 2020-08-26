package typings.mfiles

import typings.mfiles.MFiles.MFTriggerWeekDay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWeeklyTrigger extends js.Object {
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  var WeeksInterval: Double = js.native
}

object IWeeklyTrigger {
  @scala.inline
  def apply(DaysOfTheWeek: MFTriggerWeekDay, WeeksInterval: Double): IWeeklyTrigger = {
    val __obj = js.Dynamic.literal(DaysOfTheWeek = DaysOfTheWeek.asInstanceOf[js.Any], WeeksInterval = WeeksInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeeklyTrigger]
  }
  @scala.inline
  implicit class IWeeklyTriggerOps[Self <: IWeeklyTrigger] (val x: Self) extends AnyVal {
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
    def setWeeksInterval(value: Double): Self = this.set("WeeksInterval", value.asInstanceOf[js.Any])
  }
  
}

