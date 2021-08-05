package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceManagementPartner
  extends StObject
     with Entity {
  
  // User groups which enroll Android devices through partner.
  var androidEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.undefined
  
  // Partner onboarded for Android devices.
  var androidOnboarded: js.UndefOr[Boolean] = js.undefined
  
  // Partner display name
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User groups which enroll ios devices through partner.
  var iosEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.undefined
  
  // Partner onboarded for ios devices.
  var iosOnboarded: js.UndefOr[Boolean] = js.undefined
  
  // Timestamp of last heartbeat after admin onboarded to the compliance management partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.undefined
  
  // User groups which enroll Mac devices through partner.
  var macOsEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.undefined
  
  // Partner onboarded for Mac devices.
  var macOsOnboarded: js.UndefOr[Boolean] = js.undefined
  
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.undefined
}
object ComplianceManagementPartner {
  
  inline def apply(): ComplianceManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceManagementPartner]
  }
  
  extension [Self <: ComplianceManagementPartner](x: Self) {
    
    inline def setAndroidEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "androidEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    inline def setAndroidEnrollmentAssignmentsNull: Self = StObject.set(x, "androidEnrollmentAssignments", null)
    
    inline def setAndroidEnrollmentAssignmentsUndefined: Self = StObject.set(x, "androidEnrollmentAssignments", js.undefined)
    
    inline def setAndroidEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "androidEnrollmentAssignments", js.Array(value :_*))
    
    inline def setAndroidOnboarded(value: Boolean): Self = StObject.set(x, "androidOnboarded", value.asInstanceOf[js.Any])
    
    inline def setAndroidOnboardedUndefined: Self = StObject.set(x, "androidOnboarded", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIosEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "iosEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    inline def setIosEnrollmentAssignmentsNull: Self = StObject.set(x, "iosEnrollmentAssignments", null)
    
    inline def setIosEnrollmentAssignmentsUndefined: Self = StObject.set(x, "iosEnrollmentAssignments", js.undefined)
    
    inline def setIosEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "iosEnrollmentAssignments", js.Array(value :_*))
    
    inline def setIosOnboarded(value: Boolean): Self = StObject.set(x, "iosOnboarded", value.asInstanceOf[js.Any])
    
    inline def setIosOnboardedUndefined: Self = StObject.set(x, "iosOnboarded", js.undefined)
    
    inline def setLastHeartbeatDateTime(value: String): Self = StObject.set(x, "lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatDateTimeUndefined: Self = StObject.set(x, "lastHeartbeatDateTime", js.undefined)
    
    inline def setMacOsEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "macOsEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    inline def setMacOsEnrollmentAssignmentsNull: Self = StObject.set(x, "macOsEnrollmentAssignments", null)
    
    inline def setMacOsEnrollmentAssignmentsUndefined: Self = StObject.set(x, "macOsEnrollmentAssignments", js.undefined)
    
    inline def setMacOsEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "macOsEnrollmentAssignments", js.Array(value :_*))
    
    inline def setMacOsOnboarded(value: Boolean): Self = StObject.set(x, "macOsOnboarded", value.asInstanceOf[js.Any])
    
    inline def setMacOsOnboardedUndefined: Self = StObject.set(x, "macOsOnboarded", js.undefined)
    
    inline def setPartnerState(value: DeviceManagementPartnerTenantState): Self = StObject.set(x, "partnerState", value.asInstanceOf[js.Any])
    
    inline def setPartnerStateUndefined: Self = StObject.set(x, "partnerState", js.undefined)
  }
}
