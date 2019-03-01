package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logout extends js.Object {
  var logout: js.UndefOr[js.Object] = js.undefined
}

object Anon_Logout {
  @scala.inline
  def apply(logout: js.Object = null): Anon_Logout = {
    val __obj = js.Dynamic.literal()
    if (logout != null) __obj.updateDynamic("logout")(logout)
    __obj.asInstanceOf[Anon_Logout]
  }
}

