package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.RecipientType
import typings.officeJs.Office.MailboxEnums.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the email properties of the sender or specified recipients of an email message or appointment.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait EmailAddressDetails extends js.Object {
  /**
    * Gets the response that an attendee returned for an appointment. 
    * This property applies to only an attendee of an appointment, as represented by the `optionalAttendees` or `requiredAttendees` property. 
    * This property returns undefined in other scenarios.
    */
  var appointmentResponse: ResponseType | String
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: String
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: String
  /**
    * Gets the email address type of a recipient.
    */
  var recipientType: RecipientType | String
}

object EmailAddressDetails {
  @scala.inline
  def apply(
    appointmentResponse: ResponseType | String,
    displayName: String,
    emailAddress: String,
    recipientType: RecipientType | String
  ): EmailAddressDetails = {
    val __obj = js.Dynamic.literal(appointmentResponse = appointmentResponse.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], recipientType = recipientType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddressDetails]
  }
}

