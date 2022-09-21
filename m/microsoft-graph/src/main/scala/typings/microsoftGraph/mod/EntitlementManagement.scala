package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementManagement
  extends StObject
     with Entity {
  
  // Approval stages for decisions associated with access package assignment requests.
  var accessPackageAssignmentApprovals: js.UndefOr[NullableOption[js.Array[Approval]]] = js.undefined
  
  /**
    * Access packages define the collection of resource roles and the policies for which subjects can request or be assigned
    * access to those resources.
    */
  var accessPackages: js.UndefOr[NullableOption[js.Array[AccessPackage]]] = js.undefined
  
  /**
    * Access package assignment policies govern which subjects can request or be assigned an access package via an access
    * package assignment.
    */
  var assignmentPolicies: js.UndefOr[NullableOption[js.Array[AccessPackageAssignmentPolicy]]] = js.undefined
  
  // Access package assignment requests created by or on behalf of a subject.
  var assignmentRequests: js.UndefOr[NullableOption[js.Array[AccessPackageAssignmentRequest]]] = js.undefined
  
  // The assignment of an access package to a subject for a period of time.
  var assignments: js.UndefOr[NullableOption[js.Array[AccessPackageAssignment]]] = js.undefined
  
  // A container for access packages.
  var catalogs: js.UndefOr[NullableOption[js.Array[AccessPackageCatalog]]] = js.undefined
  
  // References to a directory or domain of another organization whose users can request access.
  var connectedOrganizations: js.UndefOr[NullableOption[js.Array[ConnectedOrganization]]] = js.undefined
  
  // The settings that control the behavior of Azure AD entitlement management.
  var settings: js.UndefOr[NullableOption[EntitlementManagementSettings]] = js.undefined
}
object EntitlementManagement {
  
  inline def apply(): EntitlementManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementManagement]
  }
  
  extension [Self <: EntitlementManagement](x: Self) {
    
    inline def setAccessPackageAssignmentApprovals(value: NullableOption[js.Array[Approval]]): Self = StObject.set(x, "accessPackageAssignmentApprovals", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageAssignmentApprovalsNull: Self = StObject.set(x, "accessPackageAssignmentApprovals", null)
    
    inline def setAccessPackageAssignmentApprovalsUndefined: Self = StObject.set(x, "accessPackageAssignmentApprovals", js.undefined)
    
    inline def setAccessPackageAssignmentApprovalsVarargs(value: Approval*): Self = StObject.set(x, "accessPackageAssignmentApprovals", js.Array(value*))
    
    inline def setAccessPackages(value: NullableOption[js.Array[AccessPackage]]): Self = StObject.set(x, "accessPackages", value.asInstanceOf[js.Any])
    
    inline def setAccessPackagesNull: Self = StObject.set(x, "accessPackages", null)
    
    inline def setAccessPackagesUndefined: Self = StObject.set(x, "accessPackages", js.undefined)
    
    inline def setAccessPackagesVarargs(value: AccessPackage*): Self = StObject.set(x, "accessPackages", js.Array(value*))
    
    inline def setAssignmentPolicies(value: NullableOption[js.Array[AccessPackageAssignmentPolicy]]): Self = StObject.set(x, "assignmentPolicies", value.asInstanceOf[js.Any])
    
    inline def setAssignmentPoliciesNull: Self = StObject.set(x, "assignmentPolicies", null)
    
    inline def setAssignmentPoliciesUndefined: Self = StObject.set(x, "assignmentPolicies", js.undefined)
    
    inline def setAssignmentPoliciesVarargs(value: AccessPackageAssignmentPolicy*): Self = StObject.set(x, "assignmentPolicies", js.Array(value*))
    
    inline def setAssignmentRequests(value: NullableOption[js.Array[AccessPackageAssignmentRequest]]): Self = StObject.set(x, "assignmentRequests", value.asInstanceOf[js.Any])
    
    inline def setAssignmentRequestsNull: Self = StObject.set(x, "assignmentRequests", null)
    
    inline def setAssignmentRequestsUndefined: Self = StObject.set(x, "assignmentRequests", js.undefined)
    
    inline def setAssignmentRequestsVarargs(value: AccessPackageAssignmentRequest*): Self = StObject.set(x, "assignmentRequests", js.Array(value*))
    
    inline def setAssignments(value: NullableOption[js.Array[AccessPackageAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: AccessPackageAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setCatalogs(value: NullableOption[js.Array[AccessPackageCatalog]]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsNull: Self = StObject.set(x, "catalogs", null)
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCatalogsVarargs(value: AccessPackageCatalog*): Self = StObject.set(x, "catalogs", js.Array(value*))
    
    inline def setConnectedOrganizations(value: NullableOption[js.Array[ConnectedOrganization]]): Self = StObject.set(x, "connectedOrganizations", value.asInstanceOf[js.Any])
    
    inline def setConnectedOrganizationsNull: Self = StObject.set(x, "connectedOrganizations", null)
    
    inline def setConnectedOrganizationsUndefined: Self = StObject.set(x, "connectedOrganizations", js.undefined)
    
    inline def setConnectedOrganizationsVarargs(value: ConnectedOrganization*): Self = StObject.set(x, "connectedOrganizations", js.Array(value*))
    
    inline def setSettings(value: NullableOption[EntitlementManagementSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
