package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reminder extends js.Object {
  /**
    * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows
    * Exchange to apply changes to the correct version of the object.
    */
  var changeKey: js.UndefOr[String] = js.undefined
  // The date, time and time zone that the event ends.
  var eventEndTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The unique ID of the event. Read only.
  var eventId: js.UndefOr[String] = js.undefined
  // The location of the event.
  var eventLocation: js.UndefOr[Location] = js.undefined
  // The date, time, and time zone that the event starts.
  var eventStartTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The text of the event's subject line.
  var eventSubject: js.UndefOr[String] = js.undefined
  /**
    * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox
    * via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL can be
    * accessed from within an iFrame.
    */
  var eventWebLink: js.UndefOr[String] = js.undefined
  // The date, time, and time zone that the reminder is set to occur.
  var reminderFireTime: js.UndefOr[DateTimeTimeZone] = js.undefined
}

object Reminder {
  @scala.inline
  def apply(
    changeKey: String = null,
    eventEndTime: DateTimeTimeZone = null,
    eventId: String = null,
    eventLocation: Location = null,
    eventStartTime: DateTimeTimeZone = null,
    eventSubject: String = null,
    eventWebLink: String = null,
    reminderFireTime: DateTimeTimeZone = null
  ): Reminder = {
    val __obj = js.Dynamic.literal()
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (eventEndTime != null) __obj.updateDynamic("eventEndTime")(eventEndTime)
    if (eventId != null) __obj.updateDynamic("eventId")(eventId)
    if (eventLocation != null) __obj.updateDynamic("eventLocation")(eventLocation)
    if (eventStartTime != null) __obj.updateDynamic("eventStartTime")(eventStartTime)
    if (eventSubject != null) __obj.updateDynamic("eventSubject")(eventSubject)
    if (eventWebLink != null) __obj.updateDynamic("eventWebLink")(eventWebLink)
    if (reminderFireTime != null) __obj.updateDynamic("reminderFireTime")(reminderFireTime)
    __obj.asInstanceOf[Reminder]
  }
}

