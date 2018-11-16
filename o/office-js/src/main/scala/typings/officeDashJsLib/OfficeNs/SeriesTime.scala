package typings
package officeDashJsLib.OfficeNs

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
     * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
     *
     * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
     */
@js.native
trait SeriesTime extends js.Object {
  /**
           * Gets the duration in minutes of a usual instance in a recurring appointment series.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
           */
  def getDuration(): scala.Double = js.native
  /**
           * Gets the end date of a recurrence pattern in the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD"
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
           */
  def getEndDate(): java.lang.String = js.native
  /**
           * Gets the end time of a usual appointment or meeting request instance of a recurrence pattern in whichever time zone that the user or 
           * add-in set the recurrence pattern using the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} format: 
           * "THH:mm:ss:mmm"
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
           */
  def getEndTime(): java.lang.String = js.native
  /**
           * Gets the start date of a recurrence pattern in the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD"
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
           */
  def getStartDate(): java.lang.String = js.native
  /**
           * Gets the start time of a usual appointment instance of a recurrence pattern in whichever time zone that the user/add-in set the 
           * recurrence pattern using the following {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} format: "THH:mm:ss:mmm"
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
           */
  def getStartTime(): java.lang.String = js.native
  /**
           * Sets the duration of all appointments in a recurrence pattern. This will also change the end time of the recurrence pattern.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
           * 
           * @param minutes The length of the appointment in minutes.
           */
  def setDuration(minutes: scala.Double): scala.Unit = js.native
  /**
           * Sets the end date of a recurring appointment series.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid date format - The date is not in an acceptable format.</td></tr></table>
           * 
           * @param date End date of the recurring appointment series represented in the {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD".
           */
  def setEndDate(date: java.lang.String): scala.Unit = js.native
  /**
           * Sets the end date of a recurring appointment series.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid date format - The date is not in an acceptable format.</td></tr></table>
           * 
           * In addition to this signature, this method also has the following signature:
           * 
           * `setEndDate(date: string): void;` (Where date is the end date of the recurring appointment series represented in the 
           * {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD").
           * 
           * @param year The year value of the end date.
           * @param month The month value of the end date. Valid range is 0-11 where 0 represents the 1st month and 11 represents the 12th month.
           * @param day The day value of the end date.
           */
  def setEndDate(year: scala.Double, month: scala.Double, day: scala.Double): scala.Unit = js.native
  /**
           * Sets the start date of a recurring appointment series.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid date format - The date is not in an acceptable format.</td></tr></table>
           * 
           * @param date Start date of the recurring appointment series represented in the {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD".
           */
  def setStartDate(date: java.lang.String): scala.Unit = js.native
  /**
           * Sets the start date of a recurring appointment series.
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid date format - The date is not in an acceptable format.</td></tr></table>
           * 
           * In addition to this signature, this method also has the following signature:
           * 
           * `setStartDate(date: string): void;` (Where date is the start date of the recurring appointment series represented in the {@link https://www.iso.org/iso-8601-date-and-time-format.html | ISO 8601} date format: "YYYY-MM-DD").
           *  
           * @param year The year value of the start date.
           * @param month The month value of the start date. Valid range is 0-11 where 0 represents the 1st month and 11 represents the 12th month.
           * @param day The day value of the start date.
           */
  def setStartDate(year: scala.Double, month: scala.Double, day: scala.Double): scala.Unit = js.native
  /**
           * Sets the start time of all instances of a recurring appointment series in whichever time zone the recurrence pattern is set 
           * (the item's time zone is used by default).
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid time format - The time is not in an acceptable format.</td></tr></table>
           * 
           * In addition to this signature, this method also has the following signature:
           * 
           * `setStartTime(time: string): void;` (Where time is the start time of all instances represented by standard datetime string format: "THH:mm:ss:mmm").
           * 
           * @param hours The hour value of the start time. Valid range: 0-24.
           * @param minutes The minute value of the start time. Valid range: 0-59.
           */
  def setStartTime(hours: scala.Double, minutes: scala.Double): scala.Unit = js.native
  /**
           * Sets the start time of all instances of a recurring appointment series in whichever time zone the recurrence pattern is set 
           * (the item's time zone is used by default).
           * 
           * [Api set: Mailbox 1.7]
           *
           * @remarks
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
           * 
           * <tr><td>Errors</td><td>Invalid time format - The time is not in an acceptable format.</td></tr></table>
           * 
           * @param time Start time of all instances represented by standard datetime string format: "THH:mm:ss:mmm".
           */
  def setStartTime(time: java.lang.String): scala.Unit = js.native
}

