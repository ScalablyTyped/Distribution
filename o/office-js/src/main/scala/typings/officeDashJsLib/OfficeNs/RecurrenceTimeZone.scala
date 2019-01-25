package typings
package officeDashJsLib.OfficeNs

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
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  * 
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
  */
trait RecurrenceTimeZone extends js.Object {
  /**
    * Represents the name of the recurrence time zone.
    */
  var name: officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceTimeZone
  /**
    * Integer value representing the difference in minutes between the local time zone and UTC at the date that the meeting series began.
    */
  var offset: scala.Double
}

