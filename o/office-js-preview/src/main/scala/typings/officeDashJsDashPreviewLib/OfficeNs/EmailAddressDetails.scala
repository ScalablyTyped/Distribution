package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the email properties of the sender or specified recipients of an email message or appointment.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
trait EmailAddressDetails extends js.Object {
  /**
    * Gets the response that an attendee returned for an appointment. 
    * This property applies to only an attendee of an appointment, as represented by the optionalAttendees or requiredAttendees property. 
    * This property returns undefined in other scenarios.
    */
  var appointmentResponse: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.ResponseType
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: java.lang.String
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: java.lang.String
  /**
    * Gets the email address type of a recipient.
    */
  var recipientType: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecipientType
}

object EmailAddressDetails {
  @scala.inline
  def apply(
    appointmentResponse: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.ResponseType,
    displayName: java.lang.String,
    emailAddress: java.lang.String,
    recipientType: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.RecipientType
  ): EmailAddressDetails = {
    val __obj = js.Dynamic.literal(appointmentResponse = appointmentResponse, displayName = displayName, emailAddress = emailAddress, recipientType = recipientType)
  
    __obj.asInstanceOf[EmailAddressDetails]
  }
}

