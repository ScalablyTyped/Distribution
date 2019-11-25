package typings.openid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: Boolean
  var claimedIdentifier: js.UndefOr[String] = js.undefined
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: Boolean, claimedIdentifier: String = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    if (claimedIdentifier != null) __obj.updateDynamic("claimedIdentifier")(claimedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

