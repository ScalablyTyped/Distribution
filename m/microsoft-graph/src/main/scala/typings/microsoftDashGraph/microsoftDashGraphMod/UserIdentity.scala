package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentity extends js.Object {
  // The identity's display name. Note that this may not always be available or up-to-date.
  var displayName: js.UndefOr[String] = js.undefined
  // Unique identifier for the identity.
  var id: js.UndefOr[String] = js.undefined
  // Indicates the client IP address used by user performing the activity (audit log only).
  var ipAddress: js.UndefOr[String] = js.undefined
  // The userPrincipalName attribute of the user.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object UserIdentity {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    ipAddress: String = null,
    userPrincipalName: String = null
  ): UserIdentity = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
}

