package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the time zone of the recurrence.
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait RecurrenceTimeZone extends js.Object {
  /**
    * Represents the name of the recurrence time zone.
    */
  var name: typings.officeDashJs.Office.MailboxEnums.RecurrenceTimeZone | String
  /**
    * Integer value representing the difference in minutes between the local time zone and UTC at the date that the meeting series began.
    */
  var offset: Double
}

object RecurrenceTimeZone {
  @scala.inline
  def apply(name: typings.officeDashJs.Office.MailboxEnums.RecurrenceTimeZone | String, offset: Double): RecurrenceTimeZone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], offset = offset)
  
    __obj.asInstanceOf[RecurrenceTimeZone]
  }
}

