package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The SeriesTime object provides methods to get and set the dates and times of appointments in a recurring series and get the dates and times of 
  * meeting requests in a recurring series.
  * 
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait SeriesTime extends js.Object {
  /**
    * Gets the duration in minutes of a usual instance in a recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getDuration(): Double = js.native
  /**
    * Gets the end date of a recurrence pattern in the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD"
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getEndDate(): String = js.native
  /**
    * Gets the end time of a usual appointment or meeting request instance of a recurrence pattern in whichever time zone that the user or 
    * add-in set the recurrence pattern using the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} format: 
    * "THH:mm:ss:mmm"
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getEndTime(): String = js.native
  /**
    * Gets the start date of a recurrence pattern in the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD"
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getStartDate(): String = js.native
  /**
    * Gets the start time of a usual appointment instance of a recurrence pattern in whichever time zone that the user/add-in set the 
    * recurrence pattern using the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} format: "THH:mm:ss:mmm"
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def getStartTime(): String = js.native
  /**
    * Sets the duration of all appointments in a recurrence pattern. This will also change the end time of the recurrence pattern.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param minutes - The length of the appointment in minutes.
    */
  def setDuration(minutes: Double): Unit = js.native
  /**
    * Sets the end date of a recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param date - End date of the recurring appointment series represented in the {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD".
    */
  def setEndDate(date: String): Unit = js.native
  /**
    * Sets the end date of a recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param year - The year value of the end date.
    * @param month - The month value of the end date. Valid range is 0-11 where 0 represents the 1st month and 11 represents the 12th month.
    * @param day - The day value of the end date.
    */
  def setEndDate(year: Double, month: Double, day: Double): Unit = js.native
  /**
    * Sets the start date of a recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param date - Start date of the recurring appointment series represented in the {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD".
    */
  def setStartDate(date: String): Unit = js.native
  /**
    * Sets the start date of a recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param year - The year value of the start date.
    * @param month - The month value of the start date. Valid range is 0-11 where 0 represents the 1st month and 11 represents the 12th month.
    * @param day - The day value of the start date.
    */
  def setStartDate(year: Double, month: Double, day: Double): Unit = js.native
  /**
    * Sets the start time of all instances of a recurring appointment series in whichever time zone the recurrence pattern is set 
    * (the item's time zone is used by default).
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param hours - The hour value of the start time. Valid range: 0-24.
    * @param minutes - The minute value of the start time. Valid range: 0-59.
    */
  def setStartTime(hours: Double, minutes: Double): Unit = js.native
  /**
    * Sets the start time of all instances of a recurring appointment series in whichever time zone the recurrence pattern is set 
    * (the item's time zone is used by default).
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param time - Start time of all instances represented by standard datetime string format: "THH:mm:ss:mmm".
    */
  def setStartTime(time: String): Unit = js.native
}

