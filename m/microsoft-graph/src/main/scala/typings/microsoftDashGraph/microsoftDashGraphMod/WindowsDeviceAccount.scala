package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceAccount extends js.Object {
  // Not yet documented
  var password: js.UndefOr[String] = js.undefined
}

object WindowsDeviceAccount {
  @scala.inline
  def apply(password: String = null): WindowsDeviceAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDeviceAccount]
  }
}

