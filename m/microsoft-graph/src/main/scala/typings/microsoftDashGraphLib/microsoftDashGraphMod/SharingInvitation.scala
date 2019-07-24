package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingInvitation extends js.Object {
  // The email address provided for the recipient of the sharing invitation. Read-only.
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides information about who sent the invitation that created this permission, if that information is available.
    * Read-only.
    */
  var invitedBy: js.UndefOr[IdentitySet] = js.undefined
  var redeemedBy: js.UndefOr[java.lang.String] = js.undefined
  // If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
  var signInRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object SharingInvitation {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    invitedBy: IdentitySet = null,
    redeemedBy: java.lang.String = null,
    signInRequired: js.UndefOr[scala.Boolean] = js.undefined
  ): SharingInvitation = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (invitedBy != null) __obj.updateDynamic("invitedBy")(invitedBy)
    if (redeemedBy != null) __obj.updateDynamic("redeemedBy")(redeemedBy)
    if (!js.isUndefined(signInRequired)) __obj.updateDynamic("signInRequired")(signInRequired)
    __obj.asInstanceOf[SharingInvitation]
  }
}

