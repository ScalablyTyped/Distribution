package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class IosVppAppAssignmentSettingsMutableBuilder[Self <: IosVppAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseDeviceLicensing(value: Boolean): Self = StObject.set(x, "useDeviceLicensing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDeviceLicensingUndefined: Self = StObject.set(x, "useDeviceLicensing", js.undefined)
    
    @scala.inline
    def setVpnConfigurationId(value: NullableOption[String]): Self = StObject.set(x, "vpnConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConfigurationIdNull: Self = StObject.set(x, "vpnConfigurationId", null)
    
    @scala.inline
    def setVpnConfigurationIdUndefined: Self = StObject.set(x, "vpnConfigurationId", js.undefined)
  }
}
