package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an email account on an Exchange Server.
  *
  * `EmailUser` objects are primarily received in {@link Office.MeetingSuggestion | MeetingSuggestion} and
  * {@link Office.TaskSuggestion | TaskSuggestion} entities extracted from an Outlook item. To learn more about this scenario, refer to
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/extract-entity-strings-from-an-item | Extract entity strings from an Outlook item}.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
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
  
  inline def apply(displayName: String, emailAddress: String): EmailUser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailUser] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
  }
}
