package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10EnterpriseModernAppManagementConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Indicates whether or not to uninstall a fixed list of built-in Windows apps.
  var uninstallBuiltInApps: js.UndefOr[Boolean] = js.undefined
}
object Windows10EnterpriseModernAppManagementConfiguration {
  
  inline def apply(): Windows10EnterpriseModernAppManagementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10EnterpriseModernAppManagementConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Windows10EnterpriseModernAppManagementConfiguration] (val x: Self) extends AnyVal {
    
    inline def setUninstallBuiltInApps(value: Boolean): Self = StObject.set(x, "uninstallBuiltInApps", value.asInstanceOf[js.Any])
    
    inline def setUninstallBuiltInAppsUndefined: Self = StObject.set(x, "uninstallBuiltInApps", js.undefined)
  }
}
