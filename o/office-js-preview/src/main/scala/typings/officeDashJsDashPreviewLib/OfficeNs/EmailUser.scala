package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an email account on an Exchange Server.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait EmailUser extends js.Object {
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: java.lang.String
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: java.lang.String
}

object EmailUser {
  @scala.inline
  def apply(displayName: java.lang.String, emailAddress: java.lang.String): EmailUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.asInstanceOf[EmailUser]
  }
}

