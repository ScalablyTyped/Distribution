package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceManagementPartner extends Entity {
  
  // User groups which enroll Android devices through partner.
  var androidEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.native
  
  // Partner onboarded for Android devices.
  var androidOnboarded: js.UndefOr[Boolean] = js.native
  
  // Partner display name
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // User groups which enroll ios devices through partner.
  var iosEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.native
  
  // Partner onboarded for ios devices.
  var iosOnboarded: js.UndefOr[Boolean] = js.native
  
  // Timestamp of last heartbeat after admin onboarded to the compliance management partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.native
  
  // User groups which enroll Mac devices through partner.
  var macOsEnrollmentAssignments: js.UndefOr[NullableOption[js.Array[ComplianceManagementPartnerAssignment]]] = js.native
  
  // Partner onboarded for Mac devices.
  var macOsOnboarded: js.UndefOr[Boolean] = js.native
  
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.native
}
object ComplianceManagementPartner {
  
  @scala.inline
  def apply(): ComplianceManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceManagementPartner]
  }
  
  @scala.inline
  implicit class ComplianceManagementPartnerMutableBuilder[Self <: ComplianceManagementPartner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "androidEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidEnrollmentAssignmentsNull: Self = StObject.set(x, "androidEnrollmentAssignments", null)
    
    @scala.inline
    def setAndroidEnrollmentAssignmentsUndefined: Self = StObject.set(x, "androidEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setAndroidEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "androidEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAndroidOnboarded(value: Boolean): Self = StObject.set(x, "androidOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidOnboardedUndefined: Self = StObject.set(x, "androidOnboarded", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIosEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "iosEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosEnrollmentAssignmentsNull: Self = StObject.set(x, "iosEnrollmentAssignments", null)
    
    @scala.inline
    def setIosEnrollmentAssignmentsUndefined: Self = StObject.set(x, "iosEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setIosEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "iosEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setIosOnboarded(value: Boolean): Self = StObject.set(x, "iosOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosOnboardedUndefined: Self = StObject.set(x, "iosOnboarded", js.undefined)
    
    @scala.inline
    def setLastHeartbeatDateTime(value: String): Self = StObject.set(x, "lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHeartbeatDateTimeUndefined: Self = StObject.set(x, "lastHeartbeatDateTime", js.undefined)
    
    @scala.inline
    def setMacOsEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = StObject.set(x, "macOsEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOsEnrollmentAssignmentsNull: Self = StObject.set(x, "macOsEnrollmentAssignments", null)
    
    @scala.inline
    def setMacOsEnrollmentAssignmentsUndefined: Self = StObject.set(x, "macOsEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setMacOsEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = StObject.set(x, "macOsEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setMacOsOnboarded(value: Boolean): Self = StObject.set(x, "macOsOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacOsOnboardedUndefined: Self = StObject.set(x, "macOsOnboarded", js.undefined)
    
    @scala.inline
    def setPartnerState(value: DeviceManagementPartnerTenantState): Self = StObject.set(x, "partnerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerStateUndefined: Self = StObject.set(x, "partnerState", js.undefined)
  }
}
