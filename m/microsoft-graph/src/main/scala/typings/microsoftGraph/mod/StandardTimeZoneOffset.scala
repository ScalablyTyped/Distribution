package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardTimeZoneOffset extends js.Object {
  
  // Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
  var dayOccurrence: js.UndefOr[NullableOption[Double]] = js.native
  
  // Represents the day of the week when the transition from daylight saving time to standard time.
  var dayOfWeek: js.UndefOr[NullableOption[DayOfWeek]] = js.native
  
  // Represents the month of the year when the transition from daylight saving time to standard time occurs.
  var month: js.UndefOr[NullableOption[Double]] = js.native
  
  // Represents the time of day when the transition from daylight saving time to standard time occurs.
  var time: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example,
    * a value of 0 means every year.
    */
  var year: js.UndefOr[NullableOption[Double]] = js.native
}
object StandardTimeZoneOffset {
  
  @scala.inline
  def apply(): StandardTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardTimeZoneOffset]
  }
  
  @scala.inline
  implicit class StandardTimeZoneOffsetOps[Self <: StandardTimeZoneOffset] (val x: Self) extends AnyVal {
    
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
    def setDayOccurrence(value: NullableOption[Double]): Self = this.set("dayOccurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOccurrence: Self = this.set("dayOccurrence", js.undefined)
    
    @scala.inline
    def setDayOccurrenceNull: Self = this.set("dayOccurrence", null)
    
    @scala.inline
    def setDayOfWeek(value: NullableOption[DayOfWeek]): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setDayOfWeekNull: Self = this.set("dayOfWeek", null)
    
    @scala.inline
    def setMonth(value: NullableOption[Double]): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonthNull: Self = this.set("month", null)
    
    @scala.inline
    def setTime(value: NullableOption[String]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeNull: Self = this.set("time", null)
    
    @scala.inline
    def setYear(value: NullableOption[Double]): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    
    @scala.inline
    def setYearNull: Self = this.set("year", null)
  }
}
