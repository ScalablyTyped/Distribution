package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RbacApplication
  extends StObject
     with Entity {
  
  var resourceNamespaces: js.UndefOr[NullableOption[js.Array[UnifiedRbacResourceNamespace]]] = js.undefined
  
  // Instances for active role assignments.
  var roleAssignmentScheduleInstances: js.UndefOr[NullableOption[js.Array[UnifiedRoleAssignmentScheduleInstance]]] = js.undefined
  
  // Requests for active role assignments to principals through PIM.
  var roleAssignmentScheduleRequests: js.UndefOr[NullableOption[js.Array[UnifiedRoleAssignmentScheduleRequest]]] = js.undefined
  
  // Schedules for active role assignment operations.
  var roleAssignmentSchedules: js.UndefOr[NullableOption[js.Array[UnifiedRoleAssignmentSchedule]]] = js.undefined
  
  // Resource to grant access to users or groups.
  var roleAssignments: js.UndefOr[NullableOption[js.Array[UnifiedRoleAssignment]]] = js.undefined
  
  // Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
  var roleDefinitions: js.UndefOr[NullableOption[js.Array[UnifiedRoleDefinition]]] = js.undefined
  
  // Instances for role eligibility requests.
  var roleEligibilityScheduleInstances: js.UndefOr[NullableOption[js.Array[UnifiedRoleEligibilityScheduleInstance]]] = js.undefined
  
  // Requests for role eligibilities for principals through PIM.
  var roleEligibilityScheduleRequests: js.UndefOr[NullableOption[js.Array[UnifiedRoleEligibilityScheduleRequest]]] = js.undefined
  
  // Schedules for role eligibility operations.
  var roleEligibilitySchedules: js.UndefOr[NullableOption[js.Array[UnifiedRoleEligibilitySchedule]]] = js.undefined
}
object RbacApplication {
  
  inline def apply(): RbacApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RbacApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RbacApplication] (val x: Self) extends AnyVal {
    
    inline def setResourceNamespaces(value: NullableOption[js.Array[UnifiedRbacResourceNamespace]]): Self = StObject.set(x, "resourceNamespaces", value.asInstanceOf[js.Any])
    
    inline def setResourceNamespacesNull: Self = StObject.set(x, "resourceNamespaces", null)
    
    inline def setResourceNamespacesUndefined: Self = StObject.set(x, "resourceNamespaces", js.undefined)
    
    inline def setResourceNamespacesVarargs(value: UnifiedRbacResourceNamespace*): Self = StObject.set(x, "resourceNamespaces", js.Array(value*))
    
    inline def setRoleAssignmentScheduleInstances(value: NullableOption[js.Array[UnifiedRoleAssignmentScheduleInstance]]): Self = StObject.set(x, "roleAssignmentScheduleInstances", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentScheduleInstancesNull: Self = StObject.set(x, "roleAssignmentScheduleInstances", null)
    
    inline def setRoleAssignmentScheduleInstancesUndefined: Self = StObject.set(x, "roleAssignmentScheduleInstances", js.undefined)
    
    inline def setRoleAssignmentScheduleInstancesVarargs(value: UnifiedRoleAssignmentScheduleInstance*): Self = StObject.set(x, "roleAssignmentScheduleInstances", js.Array(value*))
    
    inline def setRoleAssignmentScheduleRequests(value: NullableOption[js.Array[UnifiedRoleAssignmentScheduleRequest]]): Self = StObject.set(x, "roleAssignmentScheduleRequests", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentScheduleRequestsNull: Self = StObject.set(x, "roleAssignmentScheduleRequests", null)
    
    inline def setRoleAssignmentScheduleRequestsUndefined: Self = StObject.set(x, "roleAssignmentScheduleRequests", js.undefined)
    
    inline def setRoleAssignmentScheduleRequestsVarargs(value: UnifiedRoleAssignmentScheduleRequest*): Self = StObject.set(x, "roleAssignmentScheduleRequests", js.Array(value*))
    
    inline def setRoleAssignmentSchedules(value: NullableOption[js.Array[UnifiedRoleAssignmentSchedule]]): Self = StObject.set(x, "roleAssignmentSchedules", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentSchedulesNull: Self = StObject.set(x, "roleAssignmentSchedules", null)
    
    inline def setRoleAssignmentSchedulesUndefined: Self = StObject.set(x, "roleAssignmentSchedules", js.undefined)
    
    inline def setRoleAssignmentSchedulesVarargs(value: UnifiedRoleAssignmentSchedule*): Self = StObject.set(x, "roleAssignmentSchedules", js.Array(value*))
    
    inline def setRoleAssignments(value: NullableOption[js.Array[UnifiedRoleAssignment]]): Self = StObject.set(x, "roleAssignments", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentsNull: Self = StObject.set(x, "roleAssignments", null)
    
    inline def setRoleAssignmentsUndefined: Self = StObject.set(x, "roleAssignments", js.undefined)
    
    inline def setRoleAssignmentsVarargs(value: UnifiedRoleAssignment*): Self = StObject.set(x, "roleAssignments", js.Array(value*))
    
    inline def setRoleDefinitions(value: NullableOption[js.Array[UnifiedRoleDefinition]]): Self = StObject.set(x, "roleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setRoleDefinitionsNull: Self = StObject.set(x, "roleDefinitions", null)
    
    inline def setRoleDefinitionsUndefined: Self = StObject.set(x, "roleDefinitions", js.undefined)
    
    inline def setRoleDefinitionsVarargs(value: UnifiedRoleDefinition*): Self = StObject.set(x, "roleDefinitions", js.Array(value*))
    
    inline def setRoleEligibilityScheduleInstances(value: NullableOption[js.Array[UnifiedRoleEligibilityScheduleInstance]]): Self = StObject.set(x, "roleEligibilityScheduleInstances", value.asInstanceOf[js.Any])
    
    inline def setRoleEligibilityScheduleInstancesNull: Self = StObject.set(x, "roleEligibilityScheduleInstances", null)
    
    inline def setRoleEligibilityScheduleInstancesUndefined: Self = StObject.set(x, "roleEligibilityScheduleInstances", js.undefined)
    
    inline def setRoleEligibilityScheduleInstancesVarargs(value: UnifiedRoleEligibilityScheduleInstance*): Self = StObject.set(x, "roleEligibilityScheduleInstances", js.Array(value*))
    
    inline def setRoleEligibilityScheduleRequests(value: NullableOption[js.Array[UnifiedRoleEligibilityScheduleRequest]]): Self = StObject.set(x, "roleEligibilityScheduleRequests", value.asInstanceOf[js.Any])
    
    inline def setRoleEligibilityScheduleRequestsNull: Self = StObject.set(x, "roleEligibilityScheduleRequests", null)
    
    inline def setRoleEligibilityScheduleRequestsUndefined: Self = StObject.set(x, "roleEligibilityScheduleRequests", js.undefined)
    
    inline def setRoleEligibilityScheduleRequestsVarargs(value: UnifiedRoleEligibilityScheduleRequest*): Self = StObject.set(x, "roleEligibilityScheduleRequests", js.Array(value*))
    
    inline def setRoleEligibilitySchedules(value: NullableOption[js.Array[UnifiedRoleEligibilitySchedule]]): Self = StObject.set(x, "roleEligibilitySchedules", value.asInstanceOf[js.Any])
    
    inline def setRoleEligibilitySchedulesNull: Self = StObject.set(x, "roleEligibilitySchedules", null)
    
    inline def setRoleEligibilitySchedulesUndefined: Self = StObject.set(x, "roleEligibilitySchedules", js.undefined)
    
    inline def setRoleEligibilitySchedulesVarargs(value: UnifiedRoleEligibilitySchedule*): Self = StObject.set(x, "roleEligibilitySchedules", js.Array(value*))
  }
}
