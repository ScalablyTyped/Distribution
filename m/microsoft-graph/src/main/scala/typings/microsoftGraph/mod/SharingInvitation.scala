package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingInvitation extends js.Object {
  // The email address provided for the recipient of the sharing invitation. Read-only.
  var email: js.UndefOr[String] = js.undefined
  /**
    * Provides information about who sent the invitation that created this permission, if that information is available.
    * Read-only.
    */
  var invitedBy: js.UndefOr[IdentitySet] = js.undefined
  var redeemedBy: js.UndefOr[String] = js.undefined
  // If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
  var signInRequired: js.UndefOr[Boolean] = js.undefined
}

object SharingInvitation {
  @scala.inline
  def apply(
    email: String = null,
    invitedBy: IdentitySet = null,
    redeemedBy: String = null,
    signInRequired: js.UndefOr[Boolean] = js.undefined
  ): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (invitedBy != null) __obj.updateDynamic("invitedBy")(invitedBy.asInstanceOf[js.Any])
    if (redeemedBy != null) __obj.updateDynamic("redeemedBy")(redeemedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(signInRequired)) __obj.updateDynamic("signInRequired")(signInRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingInvitation]
  }
}

