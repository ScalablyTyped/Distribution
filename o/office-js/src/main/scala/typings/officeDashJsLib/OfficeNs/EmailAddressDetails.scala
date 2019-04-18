package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the email properties of the sender or specified recipients of an email message or appointment.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait EmailAddressDetails extends js.Object {
  /**
    * Gets the response that an attendee returned for an appointment. 
    * This property applies to only an attendee of an appointment, as represented by the optionalAttendees or requiredAttendees property. 
    * This property returns undefined in other scenarios.
    */
  var appointmentResponse: officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType
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
  var recipientType: officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
}

object EmailAddressDetails {
  @scala.inline
  def apply(
    appointmentResponse: officeDashJsLib.OfficeNs.MailboxEnumsNs.ResponseType,
    displayName: java.lang.String,
    emailAddress: java.lang.String,
    recipientType: officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
  ): EmailAddressDetails = {
    val __obj = js.Dynamic.literal(appointmentResponse = appointmentResponse, displayName = displayName, emailAddress = emailAddress, recipientType = recipientType)
  
    __obj.asInstanceOf[EmailAddressDetails]
  }
}

