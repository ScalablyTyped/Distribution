package typings.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplicationCodePersistingDisabled extends js.Object {
  var applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.undefined
  var carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined
  var systemInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined
  var userDataPersistingDisabled: js.UndefOr[Boolean] = js.undefined
}

object AnonApplicationCodePersistingDisabled {
  @scala.inline
  def apply(
    applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.undefined,
    carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined,
    systemInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined,
    userDataPersistingDisabled: js.UndefOr[Boolean] = js.undefined
  ): AnonApplicationCodePersistingDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationCodePersistingDisabled)) __obj.updateDynamic("applicationCodePersistingDisabled")(applicationCodePersistingDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(carrierInfoSendingDisabled)) __obj.updateDynamic("carrierInfoSendingDisabled")(carrierInfoSendingDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(systemInfoSendingDisabled)) __obj.updateDynamic("systemInfoSendingDisabled")(systemInfoSendingDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(userDataPersistingDisabled)) __obj.updateDynamic("userDataPersistingDisabled")(userDataPersistingDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplicationCodePersistingDisabled]
  }
}

