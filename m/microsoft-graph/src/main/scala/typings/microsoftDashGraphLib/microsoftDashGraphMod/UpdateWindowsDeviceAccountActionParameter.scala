package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWindowsDeviceAccountActionParameter extends js.Object {
  // Not yet documented
  var calendarSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Not yet documented
  var deviceAccount: js.UndefOr[WindowsDeviceAccount] = js.undefined
  // Not yet documented
  var deviceAccountEmail: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var exchangeServer: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var passwordRotationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Not yet documented
  var sessionInitiationProtocalAddress: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateWindowsDeviceAccountActionParameter {
  @scala.inline
  def apply(
    calendarSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    deviceAccount: WindowsDeviceAccount = null,
    deviceAccountEmail: java.lang.String = null,
    exchangeServer: java.lang.String = null,
    passwordRotationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    sessionInitiationProtocalAddress: java.lang.String = null
  ): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendarSyncEnabled)) __obj.updateDynamic("calendarSyncEnabled")(calendarSyncEnabled)
    if (deviceAccount != null) __obj.updateDynamic("deviceAccount")(deviceAccount)
    if (deviceAccountEmail != null) __obj.updateDynamic("deviceAccountEmail")(deviceAccountEmail)
    if (exchangeServer != null) __obj.updateDynamic("exchangeServer")(exchangeServer)
    if (!js.isUndefined(passwordRotationEnabled)) __obj.updateDynamic("passwordRotationEnabled")(passwordRotationEnabled)
    if (sessionInitiationProtocalAddress != null) __obj.updateDynamic("sessionInitiationProtocalAddress")(sessionInitiationProtocalAddress)
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
}

