package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentity extends js.Object {
  // The identity's display name. Note that this may not always be available or up-to-date.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Unique identifier for the identity.
  var id: js.UndefOr[java.lang.String] = js.undefined
  // Indicates the client IP address used by user performing the activity (audit log only).
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  // The userPrincipalName attribute of the user.
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object UserIdentity {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    ipAddress: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): UserIdentity = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[UserIdentity]
  }
}

