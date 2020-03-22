package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.DelegatePermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of an appointment or message in a shared folder, mailbox, or calendar.
  *
  * For more information on how this object is used, see the
  * {@link https://docs.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait SharedProperties extends js.Object {
  /**
    * The permissions that the delegate has on a shared folder.
    */
  var delegatePermissions: DelegatePermissions
  /**
    * The email address of the owner of a shared item.
    */
  var owner: String
  /**
    * The target/owner's mailbox. Use with `targetRestUrl` to construct REST operation's URL.
    * 
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetMailbox: String
  /**
    * The REST API's base URL (currently https://outlook.office.com/api).
    * Use with `targetMailbox` to construct REST operation's URL.
    * 
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetRestUrl: String
}

object SharedProperties {
  @scala.inline
  def apply(
    delegatePermissions: DelegatePermissions,
    owner: String,
    targetMailbox: String,
    targetRestUrl: String
  ): SharedProperties = {
    val __obj = js.Dynamic.literal(delegatePermissions = delegatePermissions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], targetMailbox = targetMailbox.asInstanceOf[js.Any], targetRestUrl = targetRestUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedProperties]
  }
}

