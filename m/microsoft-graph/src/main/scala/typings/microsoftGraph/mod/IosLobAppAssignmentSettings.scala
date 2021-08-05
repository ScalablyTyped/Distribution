package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosLobAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  // The VPN Configuration Id to apply for this app.
  var vpnConfigurationId: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosLobAppAssignmentSettings {
  
  inline def apply(): IosLobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosLobAppAssignmentSettings]
  }
  
  extension [Self <: IosLobAppAssignmentSettings](x: Self) {
    
    inline def setVpnConfigurationId(value: NullableOption[String]): Self = StObject.set(x, "vpnConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpnConfigurationIdNull: Self = StObject.set(x, "vpnConfigurationId", null)
    
    inline def setVpnConfigurationIdUndefined: Self = StObject.set(x, "vpnConfigurationId", js.undefined)
  }
}
