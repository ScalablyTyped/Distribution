package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosLobAppAssignmentSettings extends MobileAppAssignmentSettings {
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[String] = js.undefined
}

object IosLobAppAssignmentSettings {
  @scala.inline
  def apply(vpnConfigurationId: String = null): IosLobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    if (vpnConfigurationId != null) __obj.updateDynamic("vpnConfigurationId")(vpnConfigurationId)
    __obj.asInstanceOf[IosLobAppAssignmentSettings]
  }
}

