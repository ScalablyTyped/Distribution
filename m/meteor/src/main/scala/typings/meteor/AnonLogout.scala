package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogout extends js.Object {
  var logout: js.UndefOr[js.Object] = js.undefined
}

object AnonLogout {
  @scala.inline
  def apply(logout: js.Object = null): AnonLogout = {
    val __obj = js.Dynamic.literal()
    if (logout != null) __obj.updateDynamic("logout")(logout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogout]
  }
}

