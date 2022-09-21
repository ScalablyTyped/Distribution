package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppInstallExperience extends StObject {
  
  // Device restart behavior. Possible values are: basedOnReturnCode, allow, suppress, force.
  var deviceRestartBehavior: js.UndefOr[Win32LobAppRestartBehavior] = js.undefined
  
  // Indicates the type of execution context the app runs in. Possible values are: system, user.
  var runAsAccount: js.UndefOr[RunAsAccountType] = js.undefined
}
object Win32LobAppInstallExperience {
  
  inline def apply(): Win32LobAppInstallExperience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppInstallExperience]
  }
  
  extension [Self <: Win32LobAppInstallExperience](x: Self) {
    
    inline def setDeviceRestartBehavior(value: Win32LobAppRestartBehavior): Self = StObject.set(x, "deviceRestartBehavior", value.asInstanceOf[js.Any])
    
    inline def setDeviceRestartBehaviorUndefined: Self = StObject.set(x, "deviceRestartBehavior", js.undefined)
    
    inline def setRunAsAccount(value: RunAsAccountType): Self = StObject.set(x, "runAsAccount", value.asInstanceOf[js.Any])
    
    inline def setRunAsAccountUndefined: Self = StObject.set(x, "runAsAccount", js.undefined)
  }
}
