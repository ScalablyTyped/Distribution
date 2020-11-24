package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.RecipientType
import typings.officeJsPreview.Office.MailboxEnums.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the email properties of the sender or specified recipients of an email message or appointment.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait EmailAddressDetails extends js.Object {
  
  /**
    * Gets the response that an attendee returned for an appointment.
    * This property applies to only an attendee of an appointment, as represented by the `optionalAttendees` or `requiredAttendees` property.
    * This property returns undefined in other scenarios.
    */
  var appointmentResponse: ResponseType | String = js.native
  
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: String = js.native
  
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: String = js.native
  
  /**
    * Gets the email address type of a recipient.
    */
  var recipientType: RecipientType | String = js.native
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
  
  @scala.inline
  implicit class EmailAddressDetailsOps[Self <: EmailAddressDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointmentResponse(value: ResponseType | String): Self = this.set("appointmentResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientType(value: RecipientType | String): Self = this.set("recipientType", value.asInstanceOf[js.Any])
  }
}
