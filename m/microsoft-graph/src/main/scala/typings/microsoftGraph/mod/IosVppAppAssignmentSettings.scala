package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosVppAppAssignmentSettings extends MobileAppAssignmentSettings {
  
  // Whether or not to use device licensing.
  var useDeviceLicensing: js.UndefOr[Boolean] = js.native
  
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[NullableOption[String]] = js.native
}
object IosVppAppAssignmentSettings {
  
  @scala.inline
  def apply(): IosVppAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class IosVppAppAssignmentSettingsOps[Self <: IosVppAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUseDeviceLicensing(value: Boolean): Self = this.set("useDeviceLicensing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDeviceLicensing: Self = this.set("useDeviceLicensing", js.undefined)
    
    @scala.inline
    def setVpnConfigurationId(value: NullableOption[String]): Self = this.set("vpnConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConfigurationId: Self = this.set("vpnConfigurationId", js.undefined)
    
    @scala.inline
    def setVpnConfigurationIdNull: Self = this.set("vpnConfigurationId", null)
  }
}
