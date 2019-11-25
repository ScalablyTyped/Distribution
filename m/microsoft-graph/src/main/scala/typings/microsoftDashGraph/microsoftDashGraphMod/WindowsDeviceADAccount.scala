package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceADAccount extends WindowsDeviceAccount {
  // Not yet documented
  var domainName: js.UndefOr[String] = js.undefined
  // Not yet documented
  var userName: js.UndefOr[String] = js.undefined
}

object WindowsDeviceADAccount {
  @scala.inline
  def apply(domainName: String = null, password: String = null, userName: String = null): WindowsDeviceADAccount = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDeviceADAccount]
  }
}

