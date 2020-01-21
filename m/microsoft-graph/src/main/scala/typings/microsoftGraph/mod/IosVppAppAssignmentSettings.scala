package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosVppAppAssignmentSettings extends MobileAppAssignmentSettings {
  // Whether or not to use device licensing.
  var useDeviceLicensing: js.UndefOr[Boolean] = js.undefined
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[String] = js.undefined
}

object IosVppAppAssignmentSettings {
  @scala.inline
  def apply(useDeviceLicensing: js.UndefOr[Boolean] = js.undefined, vpnConfigurationId: String = null): IosVppAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeviceLicensing)) __obj.updateDynamic("useDeviceLicensing")(useDeviceLicensing.asInstanceOf[js.Any])
    if (vpnConfigurationId != null) __obj.updateDynamic("vpnConfigurationId")(vpnConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosVppAppAssignmentSettings]
  }
}

