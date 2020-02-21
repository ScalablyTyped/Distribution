package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the user associated with the mailbox. This includes their account type, display name, email address, and time zone.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait UserProfile extends js.Object {
  /**
    * Gets the account type of the user associated with the mailbox. 
    *
    * **Note**: This member is currently only supported in Outlook 2016 or later on Mac, build 16.9.1212 and greater.
    *
    * [Api set: Mailbox 1.6]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * The possible account types are listed in the following table.
    * 
    * <table>
    *   <tr>
    *     <th>Value</th>
    *     <th>Description?</th>
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
    *     <td>The mailbox is associated with an Office 365 work or school account.</td>
    *   </tr>
    *   <tr>
    *     <td>outlookCom</td>
    *     <td>The mailbox is associated with a personal Outlook.com account.</td>
    *   </tr>
    * </table>
    */
  var accountType: String
  /**
    * Gets the user's display name.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var displayName: String
  /**
    * Gets the user's SMTP email address.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var emailAddress: String
  /**
    * Gets the user's time zone in Windows format.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var timeZone: String
}

object UserProfile {
  @scala.inline
  def apply(accountType: String, displayName: String, emailAddress: String, timeZone: String): UserProfile = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserProfile]
  }
}

