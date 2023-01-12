package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the user associated with the mailbox. This includes their account type, display name, email address, and time zone.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait UserProfile extends StObject {
  
  /**
    * Gets the account type of the user associated with the mailbox.
    *
    * **Note**: This member is currently only supported in Outlook 2016 or later on Mac, build 16.9.1212 and greater.
    *
    * @remarks
    * [Api set: Mailbox 1.6]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * The possible account types are listed in the following table.
    *
    * <table>
    *   <tr>
    *     <th>Value</th>
    *     <th>Description</th>
    *   </tr>
    *   <tr>
    *     <td>enterprise</td>
    *     <td>The mailbox is on an on-premises Exchange server.</td>
    *   </tr>
    *   <tr>
    *     <td>gmail</td>
    *     <td>The mailbox is associated with a Gmail account.</td>
    *   </tr>
    *   <tr>
    *     <td>office365</td>
    *     <td>The mailbox is associated with a Microsoft 365 work or school account.</td>
    *   </tr>
    *   <tr>
    *     <td>outlookCom</td>
    *     <td>The mailbox is associated with a personal Outlook.com account.</td>
    *   </tr>
    * </table>
    * 
    * **Note**: For hybrid Exchange environments, the returned account type value depends on where the mailbox is hosted.
    * If the mailbox is on an on-premises server, the account type value is **enterprise**. However, if it's hosted on 
    * Exchange Online, the account type value is **office365**.
    */
  var accountType: String
  
  /**
    * Gets the user's display name.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var displayName: String
  
  /**
    * Gets the user's SMTP email address.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var emailAddress: String
  
  /**
    * Gets the user's time zone in Windows format.
    *
    * The system time zone is usually returned. However, in Outlook on the web, the default time zone in the calendar preferences is returned instead.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var timeZone: String
}
object UserProfile {
  
  inline def apply(accountType: String, displayName: String, emailAddress: String, timeZone: String): UserProfile = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
    
    inline def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
