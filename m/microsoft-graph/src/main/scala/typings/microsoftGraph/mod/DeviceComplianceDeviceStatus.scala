package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceComplianceDeviceStatus
  extends StObject
     with Entity {
  
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.undefined
  
  // Device name of the DevicePolicyStatus.
  var deviceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The device model that is being reported
  var deviceModel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  
  // The User Name that is being reported
  var userName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceComplianceDeviceStatus {
  
  inline def apply(): DeviceComplianceDeviceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceDeviceStatus]
  }
  
  extension [Self <: DeviceComplianceDeviceStatus](x: Self) {
    
    inline def setComplianceGracePeriodExpirationDateTime(value: String): Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setComplianceGracePeriodExpirationDateTimeUndefined: Self = StObject.set(x, "complianceGracePeriodExpirationDateTime", js.undefined)
    
    inline def setDeviceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeviceDisplayNameNull: Self = StObject.set(x, "deviceDisplayName", null)
    
    inline def setDeviceDisplayNameUndefined: Self = StObject.set(x, "deviceDisplayName", js.undefined)
    
    inline def setDeviceModel(value: NullableOption[String]): Self = StObject.set(x, "deviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelNull: Self = StObject.set(x, "deviceModel", null)
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "deviceModel", js.undefined)
    
    inline def setLastReportedDateTime(value: String): Self = StObject.set(x, "lastReportedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastReportedDateTimeUndefined: Self = StObject.set(x, "lastReportedDateTime", js.undefined)
    
    inline def setStatus(value: ComplianceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserName(value: NullableOption[String]): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
