package typings.microsoftGraph.mod

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
  implicit class ComplianceManagementPartnerOps[Self <: ComplianceManagementPartner] (val x: Self) extends AnyVal {
    
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
    def setAndroidEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = this.set("androidEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setAndroidEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = this.set("androidEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidEnrollmentAssignments: Self = this.set("androidEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setAndroidEnrollmentAssignmentsNull: Self = this.set("androidEnrollmentAssignments", null)
    
    @scala.inline
    def setAndroidOnboarded(value: Boolean): Self = this.set("androidOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidOnboarded: Self = this.set("androidOnboarded", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setIosEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = this.set("iosEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setIosEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = this.set("iosEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosEnrollmentAssignments: Self = this.set("iosEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setIosEnrollmentAssignmentsNull: Self = this.set("iosEnrollmentAssignments", null)
    
    @scala.inline
    def setIosOnboarded(value: Boolean): Self = this.set("iosOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosOnboarded: Self = this.set("iosOnboarded", js.undefined)
    
    @scala.inline
    def setLastHeartbeatDateTime(value: String): Self = this.set("lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastHeartbeatDateTime: Self = this.set("lastHeartbeatDateTime", js.undefined)
    
    @scala.inline
    def setMacOsEnrollmentAssignmentsVarargs(value: ComplianceManagementPartnerAssignment*): Self = this.set("macOsEnrollmentAssignments", js.Array(value :_*))
    
    @scala.inline
    def setMacOsEnrollmentAssignments(value: NullableOption[js.Array[ComplianceManagementPartnerAssignment]]): Self = this.set("macOsEnrollmentAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacOsEnrollmentAssignments: Self = this.set("macOsEnrollmentAssignments", js.undefined)
    
    @scala.inline
    def setMacOsEnrollmentAssignmentsNull: Self = this.set("macOsEnrollmentAssignments", null)
    
    @scala.inline
    def setMacOsOnboarded(value: Boolean): Self = this.set("macOsOnboarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacOsOnboarded: Self = this.set("macOsOnboarded", js.undefined)
    
    @scala.inline
    def setPartnerState(value: DeviceManagementPartnerTenantState): Self = this.set("partnerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerState: Self = this.set("partnerState", js.undefined)
  }
}
