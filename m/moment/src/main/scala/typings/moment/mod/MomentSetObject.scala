package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentSetObject extends MomentInputObject {
  var DDD: js.UndefOr[numberlike] = js.native
  var E: js.UndefOr[numberlike] = js.native
  var GG: js.UndefOr[numberlike] = js.native
  var Q: js.UndefOr[numberlike] = js.native
  var W: js.UndefOr[numberlike] = js.native
  var dayOfYear: js.UndefOr[numberlike] = js.native
  var dayOfYears: js.UndefOr[numberlike] = js.native
  var e: js.UndefOr[numberlike] = js.native
  var gg: js.UndefOr[numberlike] = js.native
  var isoWeek: js.UndefOr[numberlike] = js.native
  var isoWeekYear: js.UndefOr[numberlike] = js.native
  var isoWeekYears: js.UndefOr[numberlike] = js.native
  var isoWeekday: js.UndefOr[numberlike] = js.native
  var isoWeekdays: js.UndefOr[numberlike] = js.native
  var isoWeeks: js.UndefOr[numberlike] = js.native
  var quarter: js.UndefOr[numberlike] = js.native
  var quarters: js.UndefOr[numberlike] = js.native
  var w: js.UndefOr[numberlike] = js.native
  var week: js.UndefOr[numberlike] = js.native
  var weekYear: js.UndefOr[numberlike] = js.native
  var weekYears: js.UndefOr[numberlike] = js.native
  var weekday: js.UndefOr[numberlike] = js.native
  var weekdays: js.UndefOr[numberlike] = js.native
  var weeks: js.UndefOr[numberlike] = js.native
}

object MomentSetObject {
  @scala.inline
  def apply(): MomentSetObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentSetObject]
  }
  @scala.inline
  implicit class MomentSetObjectOps[Self <: MomentSetObject] (val x: Self) extends AnyVal {
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
    def setDDD(value: numberlike): Self = this.set("DDD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDDD: Self = this.set("DDD", js.undefined)
    @scala.inline
    def setE(value: numberlike): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("E", js.undefined)
    @scala.inline
    def setGG(value: numberlike): Self = this.set("GG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGG: Self = this.set("GG", js.undefined)
    @scala.inline
    def setQ(value: numberlike): Self = this.set("Q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("Q", js.undefined)
    @scala.inline
    def setW(value: numberlike): Self = this.set("W", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("W", js.undefined)
    @scala.inline
    def setDayOfYear(value: numberlike): Self = this.set("dayOfYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfYear: Self = this.set("dayOfYear", js.undefined)
    @scala.inline
    def setDayOfYears(value: numberlike): Self = this.set("dayOfYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfYears: Self = this.set("dayOfYears", js.undefined)
    @scala.inline
    def setIsoWeek(value: numberlike): Self = this.set("isoWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeek: Self = this.set("isoWeek", js.undefined)
    @scala.inline
    def setIsoWeekYear(value: numberlike): Self = this.set("isoWeekYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeekYear: Self = this.set("isoWeekYear", js.undefined)
    @scala.inline
    def setIsoWeekYears(value: numberlike): Self = this.set("isoWeekYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeekYears: Self = this.set("isoWeekYears", js.undefined)
    @scala.inline
    def setIsoWeekday(value: numberlike): Self = this.set("isoWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeekday: Self = this.set("isoWeekday", js.undefined)
    @scala.inline
    def setIsoWeekdays(value: numberlike): Self = this.set("isoWeekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeekdays: Self = this.set("isoWeekdays", js.undefined)
    @scala.inline
    def setIsoWeeks(value: numberlike): Self = this.set("isoWeeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoWeeks: Self = this.set("isoWeeks", js.undefined)
    @scala.inline
    def setQuarter(value: numberlike): Self = this.set("quarter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarter: Self = this.set("quarter", js.undefined)
    @scala.inline
    def setQuarters(value: numberlike): Self = this.set("quarters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarters: Self = this.set("quarters", js.undefined)
    @scala.inline
    def setWeek(value: numberlike): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setWeekYear(value: numberlike): Self = this.set("weekYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekYear: Self = this.set("weekYear", js.undefined)
    @scala.inline
    def setWeekYears(value: numberlike): Self = this.set("weekYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekYears: Self = this.set("weekYears", js.undefined)
    @scala.inline
    def setWeekday(value: numberlike): Self = this.set("weekday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    @scala.inline
    def setWeekdays(value: numberlike): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    @scala.inline
    def setWeeks(value: numberlike): Self = this.set("weeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
  }
  
}

