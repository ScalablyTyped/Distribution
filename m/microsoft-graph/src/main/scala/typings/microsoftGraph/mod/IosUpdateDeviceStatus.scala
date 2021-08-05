package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosUpdateDeviceStatus
  extends StObject
     with Entity {
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The device id that is being reported.
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The device model that is being reported
  var deviceModel: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The installation status of the policy report. Possible values are: success, available, idle, unknown, downloading,
    * downloadFailed, downloadRequiresComputer, downloadInsufficientSpace, downloadInsufficientPower,
    * downloadInsufficientNetwork, installing, installInsufficientSpace, installInsufficientPower,
    * installPhoneCallInProgress, installFailed, notSupportedOperation, sharedDeviceUserLoggedInError.
    */
  var installStatus: js.UndefOr[IosUpdatesInstallStatus] = js.undefined
  
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  
  // The device version that is being reported.
  var osVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  
  // The User id that is being reported.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The User Name that is being reported
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosUpdateDeviceStatus {
  
  inline def apply(): IosUpdateDeviceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateDeviceStatus]
  }
  
  extension [Self <: IosUpdateDeviceStatus](x: Self) {
    
    inline def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    inline def setDeviceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeviceDisplayNameNull: Self = StObject.set(x, "deviceDisplayName", null)
    
    inline def setDeviceDisplayNameUndefined: Self = StObject.set(x, "deviceDisplayName", js.undefined)
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceModel(value: NullableOption[String]): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelNull: Self = StObject.set(x, "deviceModel", null)
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setInstallStatus(value: IosUpdatesInstallStatus): Self = StObject.set(x, "installStatus", value.asInstanceOf[js.Any])
    
    inline def setInstallStatusUndefined: Self = StObject.set(x, "installStatus", js.undefined)
    
    inline def setLastReportedDateTime(value: String): Self = StObject.set(x, "lastReportedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastReportedDateTimeUndefined: Self = StObject.set(x, "lastReportedDateTime", js.undefined)
    
    inline def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setStatus(value: ComplianceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
