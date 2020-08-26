package typings.powerappsComponentFramework.ComponentFramework.UserSettingApi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for the Calendar exposed in DateFormattingInfo
  */
@js.native
trait Calendar extends js.Object {
  /**
    * @example 1
    */
  var algorithmType: Double = js.native
  /**
    * @example 1
    */
  var calendarType: Double = js.native
  /**
    * @example "/Date(253402300799999)/"
    */
  var maxSupportedDateTime: Date = js.native
  /**
    * @example "/Date(-62135568000000)/"
    */
  var minSupportedDateTime: Date = js.native
  /**
    * @example  2029
    */
  var twoDigitYearMax: Double = js.native
}

object Calendar {
  @scala.inline
  def apply(
    algorithmType: Double,
    calendarType: Double,
    maxSupportedDateTime: Date,
    minSupportedDateTime: Date,
    twoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(algorithmType = algorithmType.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], maxSupportedDateTime = maxSupportedDateTime.asInstanceOf[js.Any], minSupportedDateTime = minSupportedDateTime.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
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
    def setAlgorithmType(value: Double): Self = this.set("algorithmType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalendarType(value: Double): Self = this.set("calendarType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSupportedDateTime(value: Date): Self = this.set("maxSupportedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSupportedDateTime(value: Date): Self = this.set("minSupportedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = this.set("twoDigitYearMax", value.asInstanceOf[js.Any])
  }
  
}

