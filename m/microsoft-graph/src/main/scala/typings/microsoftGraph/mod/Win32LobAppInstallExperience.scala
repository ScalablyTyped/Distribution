package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppInstallExperience extends StObject {
  
  // Device restart behavior. Possible values are: basedOnReturnCode, allow, suppress, force.
  var deviceRestartBehavior: js.UndefOr[Win32LobAppRestartBehavior] = js.native
  
  // Indicates the type of execution context the app runs in.
  var runAsAccount: js.UndefOr[RunAsAccountType] = js.native
}
object Win32LobAppInstallExperience {
  
  @scala.inline
  def apply(): Win32LobAppInstallExperience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppInstallExperience]
  }
  
  @scala.inline
  implicit class Win32LobAppInstallExperienceMutableBuilder[Self <: Win32LobAppInstallExperience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceRestartBehavior(value: Win32LobAppRestartBehavior): Self = StObject.set(x, "deviceRestartBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRestartBehaviorUndefined: Self = StObject.set(x, "deviceRestartBehavior", js.undefined)
    
    @scala.inline
    def setRunAsAccount(value: RunAsAccountType): Self = StObject.set(x, "runAsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsAccountUndefined: Self = StObject.set(x, "runAsAccount", js.undefined)
  }
}
