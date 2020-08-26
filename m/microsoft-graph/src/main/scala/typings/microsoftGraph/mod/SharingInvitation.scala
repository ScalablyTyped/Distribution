package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharingInvitation extends js.Object {
  // The email address provided for the recipient of the sharing invitation. Read-only.
  var email: js.UndefOr[String] = js.native
  /**
    * Provides information about who sent the invitation that created this permission, if that information is available.
    * Read-only.
    */
  var invitedBy: js.UndefOr[IdentitySet] = js.native
  var redeemedBy: js.UndefOr[String] = js.native
  // If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
  var signInRequired: js.UndefOr[Boolean] = js.native
}

object SharingInvitation {
  @scala.inline
  def apply(): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingInvitation]
  }
  @scala.inline
  implicit class SharingInvitationOps[Self <: SharingInvitation] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInvitedBy(value: IdentitySet): Self = this.set("invitedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedBy: Self = this.set("invitedBy", js.undefined)
    @scala.inline
    def setRedeemedBy(value: String): Self = this.set("redeemedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedeemedBy: Self = this.set("redeemedBy", js.undefined)
    @scala.inline
    def setSignInRequired(value: Boolean): Self = this.set("signInRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignInRequired: Self = this.set("signInRequired", js.undefined)
  }
  
}

