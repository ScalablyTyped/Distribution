package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosLobAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  /**
    * When TRUE, indicates that the app can be uninstalled by the user. When FALSE, indicates that the app cannot be
    * uninstalled by the user. By default, this property is set to null which internally is treated as TRUE.
    */
  var isRemovable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates
    * that the app will not be uninstalled when the device is removed from Intune. By default, property is set to null which
    * internally is treated as TRUE.
    */
  var uninstallOnDeviceRemoval: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // This is the unique identifier (Id) of the VPN Configuration to apply to the app.
  var vpnConfigurationId: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosLobAppAssignmentSettings {
  
  inline def apply(): IosLobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosLobAppAssignmentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosLobAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    inline def setIsRemovable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    inline def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
    
    inline def setIsRemovableUndefined: Self = StObject.set(x, "isRemovable", js.undefined)
    
    inline def setUninstallOnDeviceRemoval(value: NullableOption[Boolean]): Self = StObject.set(x, "uninstallOnDeviceRemoval", value.asInstanceOf[js.Any])
    
    inline def setUninstallOnDeviceRemovalNull: Self = StObject.set(x, "uninstallOnDeviceRemoval", null)
    
    inline def setUninstallOnDeviceRemovalUndefined: Self = StObject.set(x, "uninstallOnDeviceRemoval", js.undefined)
    
    inline def setVpnConfigurationId(value: NullableOption[String]): Self = StObject.set(x, "vpnConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpnConfigurationIdNull: Self = StObject.set(x, "vpnConfigurationId", null)
    
    inline def setVpnConfigurationIdUndefined: Self = StObject.set(x, "vpnConfigurationId", js.undefined)
  }
}
