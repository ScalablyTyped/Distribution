package typings.openid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticated extends js.Object {
  var authenticated: Boolean
  var claimedIdentifier: js.UndefOr[String] = js.undefined
}

object AnonAuthenticated {
  @scala.inline
  def apply(authenticated: Boolean, claimedIdentifier: String = null): AnonAuthenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    if (claimedIdentifier != null) __obj.updateDynamic("claimedIdentifier")(claimedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticated]
  }
}

