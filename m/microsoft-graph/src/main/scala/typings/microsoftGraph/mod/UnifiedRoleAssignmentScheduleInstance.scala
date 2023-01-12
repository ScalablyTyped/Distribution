package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleAssignmentScheduleInstance
  extends StObject
     with UnifiedRoleScheduleInstanceBase {
  
  /**
    * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible
    * assignment for that activation. Otherwise, it is null. Supports $expand.
    */
  var activatedUsing: js.UndefOr[NullableOption[UnifiedRoleEligibilityScheduleInstance]] = js.undefined
  
  // Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
  var assignmentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The end date of the schedule instance.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the
    * unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
    */
  var memberType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the role assignment in Azure AD. Supports $filter (eq, ne).
  var roleAssignmentOriginId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. Supports $filter (eq,
    * ne).
    */
  var roleAssignmentScheduleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When this instance starts.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleAssignmentScheduleInstance {
  
  inline def apply(): UnifiedRoleAssignmentScheduleInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleAssignmentScheduleInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedRoleAssignmentScheduleInstance] (val x: Self) extends AnyVal {
    
    inline def setActivatedUsing(value: NullableOption[UnifiedRoleEligibilityScheduleInstance]): Self = StObject.set(x, "activatedUsing", value.asInstanceOf[js.Any])
    
    inline def setActivatedUsingNull: Self = StObject.set(x, "activatedUsing", null)
    
    inline def setActivatedUsingUndefined: Self = StObject.set(x, "activatedUsing", js.undefined)
    
    inline def setAssignmentType(value: NullableOption[String]): Self = StObject.set(x, "assignmentType", value.asInstanceOf[js.Any])
    
    inline def setAssignmentTypeNull: Self = StObject.set(x, "assignmentType", null)
    
    inline def setAssignmentTypeUndefined: Self = StObject.set(x, "assignmentType", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setMemberType(value: NullableOption[String]): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setRoleAssignmentOriginId(value: NullableOption[String]): Self = StObject.set(x, "roleAssignmentOriginId", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentOriginIdNull: Self = StObject.set(x, "roleAssignmentOriginId", null)
    
    inline def setRoleAssignmentOriginIdUndefined: Self = StObject.set(x, "roleAssignmentOriginId", js.undefined)
    
    inline def setRoleAssignmentScheduleId(value: NullableOption[String]): Self = StObject.set(x, "roleAssignmentScheduleId", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentScheduleIdNull: Self = StObject.set(x, "roleAssignmentScheduleId", null)
    
    inline def setRoleAssignmentScheduleIdUndefined: Self = StObject.set(x, "roleAssignmentScheduleId", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
