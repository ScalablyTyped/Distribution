package typings.officeDashJs.OfficeNs

import typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of an appointment or message in a shared folder, mailbox, or calendar.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
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
    * The remote REST URL related to the owner’s mailbox.
    */
  var restUrl: String
}

object SharedProperties {
  @scala.inline
  def apply(delegatePermissions: DelegatePermissions, owner: String, restUrl: String): SharedProperties = {
    val __obj = js.Dynamic.literal(delegatePermissions = delegatePermissions, owner = owner, restUrl = restUrl)
  
    __obj.asInstanceOf[SharedProperties]
  }
}

