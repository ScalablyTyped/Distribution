package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a suggested meeting found in an item. Read mode only.
  *
  * The list of meetings suggested in an email message is returned in the `meetingSuggestions` property of the `Entities` object that is returned when
  * the `getEntities` or `getEntitiesByType` method is called on the active item.
  *
  * The start and end values are string representations of a `Date` object that contains the date and time at which the suggested meeting is to
  * begin and end. The values are in the default time zone specified for the current user.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait MeetingSuggestion extends js.Object {
  /**
    * Gets the attendees for a suggested meeting.
    */
  var attendees: js.Array[EmailUser]
  /**
    * Gets the date and time that a suggested meeting is to end.
    */
  var end: String
  /**
    * Gets the location of a suggested meeting.
    */
  var location: String
  /**
    * Gets a string that was identified as a meeting suggestion.
    */
  var meetingString: String
  /**
    * Gets the date and time that a suggested meeting is to begin.
    */
  var start: String
  /**
    * Gets the subject of a suggested meeting.
    */
  var subject: String
}

object MeetingSuggestion {
  @scala.inline
  def apply(
    attendees: js.Array[EmailUser],
    end: String,
    location: String,
    meetingString: String,
    start: String,
    subject: String
  ): MeetingSuggestion = {
    val __obj = js.Dynamic.literal(attendees = attendees.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], meetingString = meetingString.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeetingSuggestion]
  }
}

