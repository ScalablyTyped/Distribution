package typings.officeUiFabricReact.datePickerTypesMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerStrings extends ICalendarStrings {
  /**
    * Error message to render for TextField if input date string parsing fails.
    */
  var invalidInputErrorMessage: js.UndefOr[String] = js.native
  /**
    * Error message to render for TextField if date boundary (minDate, maxDate) validation fails.
    */
  var isOutOfBoundsErrorMessage: js.UndefOr[String] = js.native
  /**
    * Error message to render for TextField if isRequired validation fails.
    */
  var isRequiredErrorMessage: js.UndefOr[String] = js.native
}

object IDatePickerStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): IDatePickerStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStrings]
  }
  @scala.inline
  implicit class IDatePickerStringsOps[Self <: IDatePickerStrings] (val x: Self) extends AnyVal {
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
    def setInvalidInputErrorMessage(value: String): Self = this.set("invalidInputErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidInputErrorMessage: Self = this.set("invalidInputErrorMessage", js.undefined)
    @scala.inline
    def setIsOutOfBoundsErrorMessage(value: String): Self = this.set("isOutOfBoundsErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutOfBoundsErrorMessage: Self = this.set("isOutOfBoundsErrorMessage", js.undefined)
    @scala.inline
    def setIsRequiredErrorMessage(value: String): Self = this.set("isRequiredErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRequiredErrorMessage: Self = this.set("isRequiredErrorMessage", js.undefined)
  }
  
}

