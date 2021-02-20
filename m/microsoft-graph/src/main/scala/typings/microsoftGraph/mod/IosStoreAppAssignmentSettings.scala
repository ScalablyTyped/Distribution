package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosStoreAppAssignmentSettings extends MobileAppAssignmentSettings {
  
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[NullableOption[String]] = js.native
}
object IosStoreAppAssignmentSettings {
  
  @scala.inline
  def apply(): IosStoreAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosStoreAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class IosStoreAppAssignmentSettingsMutableBuilder[Self <: IosStoreAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpnConfigurationId(value: NullableOption[String]): Self = StObject.set(x, "vpnConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConfigurationIdNull: Self = StObject.set(x, "vpnConfigurationId", null)
    
    @scala.inline
    def setVpnConfigurationIdUndefined: Self = StObject.set(x, "vpnConfigurationId", js.undefined)
  }
}
