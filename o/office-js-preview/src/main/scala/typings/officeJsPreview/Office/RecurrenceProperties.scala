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
trait RecurrenceProperties extends js.Object {
  /**
    * Represents the day of the month.
    */
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: js.UndefOr[Days | String] = js.undefined
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.UndefOr[js.Array[Days | String]] = js.undefined
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings. 
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: js.UndefOr[Days | String] = js.undefined
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: Double
  /**
    * Represents the month.
    */
  var month: js.UndefOr[Month | String] = js.undefined
  /**
    * Represents the number of the week in the selected month e.g. 'first' for first week of the month.
    */
  var weekNumber: js.UndefOr[WeekNumber | String] = js.undefined
}

object RecurrenceProperties {
  @scala.inline
  def apply(
    interval: Double,
    dayOfMonth: Int | Double = null,
    dayOfWeek: Days | String = null,
    days: js.Array[Days | String] = null,
    firstDayOfWeek: Days | String = null,
    month: Month | String = null,
    weekNumber: WeekNumber | String = null
  ): RecurrenceProperties = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (weekNumber != null) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceProperties]
  }
}

