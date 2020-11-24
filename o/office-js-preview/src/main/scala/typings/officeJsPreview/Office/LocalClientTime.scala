package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a date and time in the local client's time zone. Read mode only.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait LocalClientTime extends js.Object {
  
  /**
    * Integer value representing the day of the month.
    */
  var date: Double = js.native
  
  /**
    * Integer value representing the hour on a 24-hour clock.
    */
  var hours: Double = js.native
  
  /**
    * Integer value representing the milliseconds.
    */
  var milliseconds: Double = js.native
  
  /**
    * Integer value representing the minutes.
    */
  var minutes: Double = js.native
  
  /**
    * Integer value representing the month, beginning with 0 for January to 11 for December.
    */
  var month: Double = js.native
  
  /**
    * Integer value representing the seconds.
    */
  var seconds: Double = js.native
  
  /**
    * Integer value representing the number of minutes difference between the local time zone and UTC.
    */
  var timezoneOffset: Double = js.native
  
  /**
    * Integer value representing the year.
    */
  var year: Double = js.native
}
object LocalClientTime {
  
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    month: Double,
    seconds: Double,
    timezoneOffset: Double,
    year: Double
  ): LocalClientTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalClientTime]
  }
  
  @scala.inline
  implicit class LocalClientTimeOps[Self <: LocalClientTime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneOffset(value: Double): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
