package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an email account on an Exchange Server.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait EmailUser extends StObject {
  
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: String
  
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: String
}
object EmailUser {
  
  @scala.inline
  def apply(displayName: String, emailAddress: String): EmailUser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailUser]
  }
  
  @scala.inline
  implicit class EmailUserMutableBuilder[Self <: EmailUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
  }
}
