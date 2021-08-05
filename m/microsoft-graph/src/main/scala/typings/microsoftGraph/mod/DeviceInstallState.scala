package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInstallState
  extends StObject
     with Entity {
  
  // Device Id.
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device name.
  var deviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The error code for install failures.
  var errorCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The install state of the eBook. Possible values are: notApplicable, installed, failed, notInstalled, uninstallFailed,
    * unknown.
    */
  var installState: js.UndefOr[InstallState] = js.undefined
  
  // Last sync date and time.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  // OS Description.
  var osDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // OS Version.
  var osVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device User Name.
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceInstallState {
  
  inline def apply(): DeviceInstallState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstallState]
  }
  
  extension [Self <: DeviceInstallState](x: Self) {
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setErrorCode(value: NullableOption[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setInstallState(value: InstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setInstallStateUndefined: Self = StObject.set(x, "installState", js.undefined)
    
    inline def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    inline def setOsDescription(value: NullableOption[String]): Self = StObject.set(x, "osDescription", value.asInstanceOf[js.Any])
    
    inline def setOsDescriptionNull: Self = StObject.set(x, "osDescription", null)
    
    inline def setOsDescriptionUndefined: Self = StObject.set(x, "osDescription", js.undefined)
    
    inline def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
