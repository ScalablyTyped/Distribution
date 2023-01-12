package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosVppAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  // Whether or not to use device licensing.
  var useDeviceLicensing: js.UndefOr[Boolean] = js.undefined
  
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosVppAppAssignmentSettings {
  
  inline def apply(): IosVppAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppAppAssignmentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosVppAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    inline def setUseDeviceLicensing(value: Boolean): Self = StObject.set(x, "useDeviceLicensing", value.asInstanceOf[js.Any])
    
    inline def setUseDeviceLicensingUndefined: Self = StObject.set(x, "useDeviceLicensing", js.undefined)
    
    inline def setVpnConfigurationId(value: NullableOption[String]): Self = StObject.set(x, "vpnConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpnConfigurationIdNull: Self = StObject.set(x, "vpnConfigurationId", null)
    
    inline def setVpnConfigurationIdUndefined: Self = StObject.set(x, "vpnConfigurationId", js.undefined)
  }
}
