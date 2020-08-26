package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an email account on an Exchange Server.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait EmailUser extends js.Object {
  /**
    * Gets the display name associated with an email address.
    */
  var displayName: String = js.native
  /**
    * Gets the SMTP email address.
    */
  var emailAddress: String = js.native
}

object EmailUser {
  @scala.inline
  def apply(displayName: String, emailAddress: String): EmailUser = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailUser]
  }
  @scala.inline
  implicit class EmailUserOps[Self <: EmailUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
  }
  
}

