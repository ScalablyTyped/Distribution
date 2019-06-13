package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsDeviceAccount extends js.Object {
  /** Not yet documented */
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsDeviceAccount {
  @scala.inline
  def apply(password: java.lang.String = null): WindowsDeviceAccount = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[WindowsDeviceAccount]
  }
}

