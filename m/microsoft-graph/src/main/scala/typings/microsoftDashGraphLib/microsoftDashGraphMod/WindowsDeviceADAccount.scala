package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceADAccount extends WindowsDeviceAccount {
  /** Not yet documented */
  var domainName: js.UndefOr[java.lang.String] = js.undefined
  /** Not yet documented */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsDeviceADAccount {
  @scala.inline
  def apply(
    domainName: java.lang.String = null,
    password: java.lang.String = null,
    userName: java.lang.String = null
  ): WindowsDeviceADAccount = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (password != null) __obj.updateDynamic("password")(password)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[WindowsDeviceADAccount]
  }
}

