package typings.officeDashJsDashPreview.Office

import typings.officeDashJsDashPreview.Office.MailboxEnums.DelegatePermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of an appointment or message in a shared folder, mailbox, or calendar.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
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
    * The target/owner's mailbox. Use with targetRestUrl to construct REST operation's URL.
    * 
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetMailbox: String
  /**
    * The REST API's base URL (currently https://outlook.office.com/api).
    * Use with targetMailbox to construct REST operation's URL.
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
    val __obj = js.Dynamic.literal(delegatePermissions = delegatePermissions, owner = owner, targetMailbox = targetMailbox, targetRestUrl = targetRestUrl)
  
    __obj.asInstanceOf[SharedProperties]
  }
}

