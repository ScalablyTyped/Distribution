package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppInstallExperience extends js.Object {
  
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
  implicit class Win32LobAppInstallExperienceOps[Self <: Win32LobAppInstallExperience] (val x: Self) extends AnyVal {
    
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
    def setDeviceRestartBehavior(value: Win32LobAppRestartBehavior): Self = this.set("deviceRestartBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceRestartBehavior: Self = this.set("deviceRestartBehavior", js.undefined)
    
    @scala.inline
    def setRunAsAccount(value: RunAsAccountType): Self = this.set("runAsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsAccount: Self = this.set("runAsAccount", js.undefined)
  }
}
