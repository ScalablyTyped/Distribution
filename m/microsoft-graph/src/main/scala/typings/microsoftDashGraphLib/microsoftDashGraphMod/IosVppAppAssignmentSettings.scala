package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosVppAppAssignmentSettings extends MobileAppAssignmentSettings {
  // Whether or not to use device licensing.
  var useDeviceLicensing: js.UndefOr[scala.Boolean] = js.undefined
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[java.lang.String] = js.undefined
}

object IosVppAppAssignmentSettings {
  @scala.inline
  def apply(
    useDeviceLicensing: js.UndefOr[scala.Boolean] = js.undefined,
    vpnConfigurationId: java.lang.String = null
  ): IosVppAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useDeviceLicensing)) __obj.updateDynamic("useDeviceLicensing")(useDeviceLicensing)
    if (vpnConfigurationId != null) __obj.updateDynamic("vpnConfigurationId")(vpnConfigurationId)
    __obj.asInstanceOf[IosVppAppAssignmentSettings]
  }
}

