package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedDeviceMobileAppConfigurationUserStatus
  extends StObject
     with Entity {
  
  // Devices count for that user.
  var devicesCount: js.UndefOr[Double] = js.undefined
  
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
  
  // User name of the DevicePolicyStatus.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedDeviceMobileAppConfigurationUserStatus {
  
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfigurationUserStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationUserStatus]
  }
  
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationUserStatusMutableBuilder[Self <: ManagedDeviceMobileAppConfigurationUserStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicesCount(value: Double): Self = StObject.set(x, "devicesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesCountUndefined: Self = StObject.set(x, "devicesCount", js.undefined)
    
    @scala.inline
    def setLastReportedDateTime(value: String): Self = StObject.set(x, "lastReportedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReportedDateTimeUndefined: Self = StObject.set(x, "lastReportedDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    @scala.inline
    def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
