package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceAzureADAccount extends WindowsDeviceAccount {
  // Not yet documented
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object WindowsDeviceAzureADAccount {
  @scala.inline
  def apply(password: String = null, userPrincipalName: String = null): WindowsDeviceAzureADAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDeviceAzureADAccount]
  }
}

