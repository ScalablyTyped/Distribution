package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWindowsDeviceAccountActionParameter extends js.Object {
  // Not yet documented
  var calendarSyncEnabled: js.UndefOr[Boolean] = js.undefined
  // Not yet documented
  var deviceAccount: js.UndefOr[WindowsDeviceAccount] = js.undefined
  // Not yet documented
  var deviceAccountEmail: js.UndefOr[String] = js.undefined
  // Not yet documented
  var exchangeServer: js.UndefOr[String] = js.undefined
  // Not yet documented
  var passwordRotationEnabled: js.UndefOr[Boolean] = js.undefined
  // Not yet documented
  var sessionInitiationProtocalAddress: js.UndefOr[String] = js.undefined
}

object UpdateWindowsDeviceAccountActionParameter {
  @scala.inline
  def apply(
    calendarSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    deviceAccount: WindowsDeviceAccount = null,
    deviceAccountEmail: String = null,
    exchangeServer: String = null,
    passwordRotationEnabled: js.UndefOr[Boolean] = js.undefined,
    sessionInitiationProtocalAddress: String = null
  ): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendarSyncEnabled)) __obj.updateDynamic("calendarSyncEnabled")(calendarSyncEnabled.asInstanceOf[js.Any])
    if (deviceAccount != null) __obj.updateDynamic("deviceAccount")(deviceAccount.asInstanceOf[js.Any])
    if (deviceAccountEmail != null) __obj.updateDynamic("deviceAccountEmail")(deviceAccountEmail.asInstanceOf[js.Any])
    if (exchangeServer != null) __obj.updateDynamic("exchangeServer")(exchangeServer.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRotationEnabled)) __obj.updateDynamic("passwordRotationEnabled")(passwordRotationEnabled.asInstanceOf[js.Any])
    if (sessionInitiationProtocalAddress != null) __obj.updateDynamic("sessionInitiationProtocalAddress")(sessionInitiationProtocalAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
}

