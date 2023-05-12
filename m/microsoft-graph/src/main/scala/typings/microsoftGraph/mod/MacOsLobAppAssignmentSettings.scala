package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOsLobAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  /**
    * When TRUE, indicates that the app should be uninstalled when the device is removed from Intune. When FALSE, indicates
    * that the app will not be uninstalled when the device is removed from Intune.
    */
  var uninstallOnDeviceRemoval: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object MacOsLobAppAssignmentSettings {
  
  inline def apply(): MacOsLobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOsLobAppAssignmentSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacOsLobAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    inline def setUninstallOnDeviceRemoval(value: NullableOption[Boolean]): Self = StObject.set(x, "uninstallOnDeviceRemoval", value.asInstanceOf[js.Any])
    
    inline def setUninstallOnDeviceRemovalNull: Self = StObject.set(x, "uninstallOnDeviceRemoval", null)
    
    inline def setUninstallOnDeviceRemovalUndefined: Self = StObject.set(x, "uninstallOnDeviceRemoval", js.undefined)
  }
}
