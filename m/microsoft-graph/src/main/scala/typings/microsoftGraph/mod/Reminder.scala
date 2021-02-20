package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reminder extends StObject {
  
  /**
    * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows
    * Exchange to apply changes to the correct version of the object.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.native
  
  // The date, time and time zone that the event ends.
  var eventEndTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The unique ID of the event. Read only.
  var eventId: js.UndefOr[NullableOption[String]] = js.native
  
  // The location of the event.
  var eventLocation: js.UndefOr[NullableOption[Location]] = js.native
  
  // The date, time, and time zone that the event starts.
  var eventStartTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The text of the event's subject line.
  var eventSubject: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox
    * via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot
    * be accessed from within an iFrame.
    */
  var eventWebLink: js.UndefOr[NullableOption[String]] = js.native
  
  // The date, time, and time zone that the reminder is set to occur.
  var reminderFireTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
}
object Reminder {
  
  @scala.inline
  def apply(): Reminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reminder]
  }
  
  @scala.inline
  implicit class ReminderMutableBuilder[Self <: Reminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    @scala.inline
    def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    @scala.inline
    def setEventEndTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "eventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventEndTimeNull: Self = StObject.set(x, "eventEndTime", null)
    
    @scala.inline
    def setEventEndTimeUndefined: Self = StObject.set(x, "eventEndTime", js.undefined)
    
    @scala.inline
    def setEventId(value: NullableOption[String]): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setEventLocation(value: NullableOption[Location]): Self = StObject.set(x, "eventLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLocationNull: Self = StObject.set(x, "eventLocation", null)
    
    @scala.inline
    def setEventLocationUndefined: Self = StObject.set(x, "eventLocation", js.undefined)
    
    @scala.inline
    def setEventStartTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "eventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStartTimeNull: Self = StObject.set(x, "eventStartTime", null)
    
    @scala.inline
    def setEventStartTimeUndefined: Self = StObject.set(x, "eventStartTime", js.undefined)
    
    @scala.inline
    def setEventSubject(value: NullableOption[String]): Self = StObject.set(x, "eventSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubjectNull: Self = StObject.set(x, "eventSubject", null)
    
    @scala.inline
    def setEventSubjectUndefined: Self = StObject.set(x, "eventSubject", js.undefined)
    
    @scala.inline
    def setEventWebLink(value: NullableOption[String]): Self = StObject.set(x, "eventWebLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWebLinkNull: Self = StObject.set(x, "eventWebLink", null)
    
    @scala.inline
    def setEventWebLinkUndefined: Self = StObject.set(x, "eventWebLink", js.undefined)
    
    @scala.inline
    def setReminderFireTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "reminderFireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderFireTimeNull: Self = StObject.set(x, "reminderFireTime", null)
    
    @scala.inline
    def setReminderFireTimeUndefined: Self = StObject.set(x, "reminderFireTime", js.undefined)
  }
}
