package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentRequestRequirements extends StObject {
  
  // Indicates whether the requestor is allowed to set a custom schedule.
  var allowCustomAssignmentSchedule: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether a request to add must be approved by an approver.
  var isApprovalRequiredForAdd: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether a request to update must be approved by an approver.
  var isApprovalRequiredForUpdate: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The description of the policy that the user is trying to request access using.
  var policyDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the policy that the user is trying to request access using.
  var policyDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identifier of the policy that these requirements are associated with. This identifier can be used when creating a
    * new assignment request.
    */
  var policyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Schedule restrictions enforced, if any.
  var schedule: js.UndefOr[NullableOption[EntitlementManagementSchedule]] = js.undefined
}
object AccessPackageAssignmentRequestRequirements {
  
  inline def apply(): AccessPackageAssignmentRequestRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentRequestRequirements]
  }
  
  extension [Self <: AccessPackageAssignmentRequestRequirements](x: Self) {
    
    inline def setAllowCustomAssignmentSchedule(value: NullableOption[Boolean]): Self = StObject.set(x, "allowCustomAssignmentSchedule", value.asInstanceOf[js.Any])
    
    inline def setAllowCustomAssignmentScheduleNull: Self = StObject.set(x, "allowCustomAssignmentSchedule", null)
    
    inline def setAllowCustomAssignmentScheduleUndefined: Self = StObject.set(x, "allowCustomAssignmentSchedule", js.undefined)
    
    inline def setIsApprovalRequiredForAdd(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequiredForAdd", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForAddNull: Self = StObject.set(x, "isApprovalRequiredForAdd", null)
    
    inline def setIsApprovalRequiredForAddUndefined: Self = StObject.set(x, "isApprovalRequiredForAdd", js.undefined)
    
    inline def setIsApprovalRequiredForUpdate(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequiredForUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForUpdateNull: Self = StObject.set(x, "isApprovalRequiredForUpdate", null)
    
    inline def setIsApprovalRequiredForUpdateUndefined: Self = StObject.set(x, "isApprovalRequiredForUpdate", js.undefined)
    
    inline def setPolicyDescription(value: NullableOption[String]): Self = StObject.set(x, "policyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionNull: Self = StObject.set(x, "policyDescription", null)
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "policyDescription", js.undefined)
    
    inline def setPolicyDisplayName(value: NullableOption[String]): Self = StObject.set(x, "policyDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPolicyDisplayNameNull: Self = StObject.set(x, "policyDisplayName", null)
    
    inline def setPolicyDisplayNameUndefined: Self = StObject.set(x, "policyDisplayName", js.undefined)
    
    inline def setPolicyId(value: NullableOption[String]): Self = StObject.set(x, "policyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdNull: Self = StObject.set(x, "policyId", null)
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "policyId", js.undefined)
    
    inline def setSchedule(value: NullableOption[EntitlementManagementSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
