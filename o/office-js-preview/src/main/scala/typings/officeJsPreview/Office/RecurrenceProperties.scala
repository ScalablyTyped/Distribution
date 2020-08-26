package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.Days
import typings.officeJsPreview.Office.MailboxEnums.Month
import typings.officeJsPreview.Office.MailboxEnums.WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of the recurrence.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait RecurrenceProperties extends js.Object {
  /**
    * Represents the day of the month.
    */
  var dayOfMonth: js.UndefOr[Double] = js.native
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: js.UndefOr[Days | String] = js.native
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.UndefOr[js.Array[Days | String]] = js.native
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings.
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: js.UndefOr[Days | String] = js.native
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: Double = js.native
  /**
    * Represents the month.
    */
  var month: js.UndefOr[Month | String] = js.native
  /**
    * Represents the number of the week in the selected month e.g., 'first' for first week of the month.
    */
  var weekNumber: js.UndefOr[WeekNumber | String] = js.native
}

object RecurrenceProperties {
  @scala.inline
  def apply(interval: Double): RecurrenceProperties = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceProperties]
  }
  @scala.inline
  implicit class RecurrencePropertiesOps[Self <: RecurrenceProperties] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfMonth(value: Double): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
    @scala.inline
    def setDayOfWeek(value: Days | String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setDaysVarargs(value: (Days | String)*): Self = this.set("days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[Days | String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: Days | String): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setMonth(value: Month | String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setWeekNumber(value: WeekNumber | String): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
  }
  
}

