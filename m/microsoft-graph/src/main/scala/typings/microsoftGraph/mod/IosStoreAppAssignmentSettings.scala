package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosStoreAppAssignmentSettings extends MobileAppAssignmentSettings {
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[String] = js.undefined
}

object IosStoreAppAssignmentSettings {
  @scala.inline
  def apply(vpnConfigurationId: String = null): IosStoreAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (vpnConfigurationId != null) __obj.updateDynamic("vpnConfigurationId")(vpnConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosStoreAppAssignmentSettings]
  }
}

