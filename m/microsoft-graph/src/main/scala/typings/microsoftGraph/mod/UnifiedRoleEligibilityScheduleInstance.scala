package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleEligibilityScheduleInstance
  extends StObject
     with UnifiedRoleScheduleInstanceBase {
  
  // The end date of the schedule instance.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the
    * unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
    */
  var memberType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identifier of the unifiedRoleEligibilitySchedule object from which this instance was created. Supports $filter (eq,
    * ne).
    */
  var roleEligibilityScheduleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When this instance starts.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object UnifiedRoleEligibilityScheduleInstance {
  
  inline def apply(): UnifiedRoleEligibilityScheduleInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleEligibilityScheduleInstance]
  }
  
  extension [Self <: UnifiedRoleEligibilityScheduleInstance](x: Self) {
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setMemberType(value: NullableOption[String]): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setRoleEligibilityScheduleId(value: NullableOption[String]): Self = StObject.set(x, "roleEligibilityScheduleId", value.asInstanceOf[js.Any])
    
    inline def setRoleEligibilityScheduleIdNull: Self = StObject.set(x, "roleEligibilityScheduleId", null)
    
    inline def setRoleEligibilityScheduleIdUndefined: Self = StObject.set(x, "roleEligibilityScheduleId", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
