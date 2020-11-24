package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceInstallState extends Entity {
  
  // Device Id.
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  // Device name.
  var deviceName: js.UndefOr[NullableOption[String]] = js.native
  
  // The error code for install failures.
  var errorCode: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed,
    * unknown.
    */
  var installState: js.UndefOr[InstallState] = js.native
  
  // Last sync date and time.
  var lastSyncDateTime: js.UndefOr[String] = js.native
  
  // OS Description.
  var osDescription: js.UndefOr[NullableOption[String]] = js.native
  
  // OS Version.
  var osVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Device User Name.
  var userName: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceInstallState {
  
  @scala.inline
  def apply(): DeviceInstallState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstallState]
  }
  
  @scala.inline
  implicit class DeviceInstallStateOps[Self <: DeviceInstallState] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: NullableOption[String]): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdNull: Self = this.set("deviceId", null)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDeviceNameNull: Self = this.set("deviceName", null)
    
    @scala.inline
    def setErrorCode(value: NullableOption[String]): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorCodeNull: Self = this.set("errorCode", null)
    
    @scala.inline
    def setInstallState(value: InstallState): Self = this.set("installState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallState: Self = this.set("installState", js.undefined)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOsDescription(value: NullableOption[String]): Self = this.set("osDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsDescription: Self = this.set("osDescription", js.undefined)
    
    @scala.inline
    def setOsDescriptionNull: Self = this.set("osDescription", null)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    
    @scala.inline
    def setOsVersionNull: Self = this.set("osVersion", null)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    
    @scala.inline
    def setUserNameNull: Self = this.set("userName", null)
  }
}
