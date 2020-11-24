package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInstallStateSummary extends Entity {
  
  // The install state of the eBook.
  var deviceStates: js.UndefOr[NullableOption[js.Array[DeviceInstallState]]] = js.native
  
  // Failed Device Count.
  var failedDeviceCount: js.UndefOr[Double] = js.native
  
  // Installed Device Count.
  var installedDeviceCount: js.UndefOr[Double] = js.native
  
  // Not installed device count.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.native
  
  // User name.
  var userName: js.UndefOr[NullableOption[String]] = js.native
}
object UserInstallStateSummary {
  
  @scala.inline
  def apply(): UserInstallStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInstallStateSummary]
  }
  
  @scala.inline
  implicit class UserInstallStateSummaryOps[Self <: UserInstallStateSummary] (val x: Self) extends AnyVal {
    
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
    def setDeviceStatesVarargs(value: DeviceInstallState*): Self = this.set("deviceStates", js.Array(value :_*))
    
    @scala.inline
    def setDeviceStates(value: NullableOption[js.Array[DeviceInstallState]]): Self = this.set("deviceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceStates: Self = this.set("deviceStates", js.undefined)
    
    @scala.inline
    def setDeviceStatesNull: Self = this.set("deviceStates", null)
    
    @scala.inline
    def setFailedDeviceCount(value: Double): Self = this.set("failedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedDeviceCount: Self = this.set("failedDeviceCount", js.undefined)
    
    @scala.inline
    def setInstalledDeviceCount(value: Double): Self = this.set("installedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledDeviceCount: Self = this.set("installedDeviceCount", js.undefined)
    
    @scala.inline
    def setNotInstalledDeviceCount(value: Double): Self = this.set("notInstalledDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotInstalledDeviceCount: Self = this.set("notInstalledDeviceCount", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserNameNull: Self = this.set("userName", null)
  }
}
