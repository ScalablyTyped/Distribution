package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledJobTrigger extends js.Object {
  var BeginDay: Double = js.native
  var BeginMonth: Double = js.native
  var BeginYear: Double = js.native
  var EndDay: Double = js.native
  var EndMonth: Double = js.native
  var EndYear: Double = js.native
  var StartHour: Double = js.native
  var StartMinute: Double = js.native
  var Type: ITriggerType = js.native
  var ValidEndDate: Boolean = js.native
  def Clone(): IScheduledJobTrigger = js.native
}

object IScheduledJobTrigger {
  @scala.inline
  def apply(
    BeginDay: Double,
    BeginMonth: Double,
    BeginYear: Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: Double,
    EndMonth: Double,
    EndYear: Double,
    StartHour: Double,
    StartMinute: Double,
    Type: ITriggerType,
    ValidEndDate: Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay.asInstanceOf[js.Any], BeginMonth = BeginMonth.asInstanceOf[js.Any], BeginYear = BeginYear.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EndDay = EndDay.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], StartHour = StartHour.asInstanceOf[js.Any], StartMinute = StartMinute.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidEndDate = ValidEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
  @scala.inline
  implicit class IScheduledJobTriggerOps[Self <: IScheduledJobTrigger] (val x: Self) extends AnyVal {
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
    def setBeginDay(value: Double): Self = this.set("BeginDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginMonth(value: Double): Self = this.set("BeginMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginYear(value: Double): Self = this.set("BeginYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IScheduledJobTrigger): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setEndDay(value: Double): Self = this.set("EndDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndMonth(value: Double): Self = this.set("EndMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndYear(value: Double): Self = this.set("EndYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartHour(value: Double): Self = this.set("StartHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMinute(value: Double): Self = this.set("StartMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ITriggerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidEndDate(value: Boolean): Self = this.set("ValidEndDate", value.asInstanceOf[js.Any])
  }
  
}

