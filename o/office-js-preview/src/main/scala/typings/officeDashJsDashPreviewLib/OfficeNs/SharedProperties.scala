package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties of an appointment or message in a shared folder, mailbox, or calendar.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
  * 
  * @beta
  */
trait SharedProperties extends js.Object {
  /**
    * The permissions that the delegate has on a shared folder.
    */
  var delegatePermissions: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  /**
    * The email address of the owner of a shared item.
    */
  var owner: java.lang.String
  /**
    * The remote REST URL related to the owner’s mailbox.
    */
  var restUrl: java.lang.String
}

