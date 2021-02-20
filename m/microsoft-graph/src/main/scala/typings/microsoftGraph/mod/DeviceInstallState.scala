package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class DeviceInstallStateMutableBuilder[Self <: DeviceInstallState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setErrorCode(value: NullableOption[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setInstallState(value: InstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallStateUndefined: Self = StObject.set(x, "installState", js.undefined)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setOsDescription(value: NullableOption[String]): Self = StObject.set(x, "osDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsDescriptionNull: Self = StObject.set(x, "osDescription", null)
    
    @scala.inline
    def setOsDescriptionUndefined: Self = StObject.set(x, "osDescription", js.undefined)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
