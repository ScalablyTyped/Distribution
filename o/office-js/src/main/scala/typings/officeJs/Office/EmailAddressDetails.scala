package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.RecipientType
import typings.officeJs.Office.MailboxEnums.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait EmailAddressDetails extends StObject {
  
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
  
  @scala.inline
  implicit class EmailAddressDetailsMutableBuilder[Self <: EmailAddressDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentResponse(value: ResponseType | String): Self = StObject.set(x, "appointmentResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientType(value: RecipientType | String): Self = StObject.set(x, "recipientType", value.asInstanceOf[js.Any])
  }
}
