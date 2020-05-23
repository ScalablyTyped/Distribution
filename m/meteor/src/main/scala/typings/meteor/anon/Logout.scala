package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logout extends js.Object {
  var logout: js.UndefOr[js.Object] = js.undefined
}

object Logout {
  @scala.inline
  def apply(logout: js.Object = null): Logout = {
    val __obj = js.Dynamic.literal()
    if (logout != null) __obj.updateDynamic("logout")(logout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logout]
  }
}

