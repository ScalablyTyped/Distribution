package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an email account on an Exchange Server.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Read
  */
trait EmailUser extends js.Object {
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
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress)
  
    __obj.asInstanceOf[EmailUser]
  }
}

