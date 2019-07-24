package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceAzureADAccount extends WindowsDeviceAccount {
  // Not yet documented
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsDeviceAzureADAccount {
  @scala.inline
  def apply(password: java.lang.String = null, userPrincipalName: java.lang.String = null): WindowsDeviceAzureADAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[WindowsDeviceAzureADAccount]
  }
}

