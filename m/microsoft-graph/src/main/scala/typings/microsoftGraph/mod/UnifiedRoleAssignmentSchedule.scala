package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleAssignmentSchedule
  extends StObject
     with UnifiedRoleScheduleBase {
  
  /**
    * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible
    * assignment for that activation. Otherwise, it is null. Supports $expand.
    */
  var activatedUsing: js.UndefOr[NullableOption[UnifiedRoleEligibilitySchedule]] = js.undefined
  
  // Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
  var assignmentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the
    * unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
    */
  var memberType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The period of the role assignment. It can represent a single occurrence or multiple recurrences.
  var scheduleInfo: js.UndefOr[NullableOption[RequestSchedule]] = js.undefined
}
object UnifiedRoleAssignmentSchedule {
  
  inline def apply(): UnifiedRoleAssignmentSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleAssignmentSchedule]
  }
  
  extension [Self <: UnifiedRoleAssignmentSchedule](x: Self) {
    
    inline def setActivatedUsing(value: NullableOption[UnifiedRoleEligibilitySchedule]): Self = StObject.set(x, "activatedUsing", value.asInstanceOf[js.Any])
    
    inline def setActivatedUsingNull: Self = StObject.set(x, "activatedUsing", null)
    
    inline def setActivatedUsingUndefined: Self = StObject.set(x, "activatedUsing", js.undefined)
    
    inline def setAssignmentType(value: NullableOption[String]): Self = StObject.set(x, "assignmentType", value.asInstanceOf[js.Any])
    
    inline def setAssignmentTypeNull: Self = StObject.set(x, "assignmentType", null)
    
    inline def setAssignmentTypeUndefined: Self = StObject.set(x, "assignmentType", js.undefined)
    
    inline def setMemberType(value: NullableOption[String]): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setScheduleInfo(value: NullableOption[RequestSchedule]): Self = StObject.set(x, "scheduleInfo", value.asInstanceOf[js.Any])
    
    inline def setScheduleInfoNull: Self = StObject.set(x, "scheduleInfo", null)
    
    inline def setScheduleInfoUndefined: Self = StObject.set(x, "scheduleInfo", js.undefined)
  }
}
