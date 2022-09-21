package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedRoleEligibilitySchedule
  extends StObject
     with UnifiedRoleScheduleBase {
  
  /**
    * How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the
    * unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
    */
  var memberType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The period of the role eligibility.
  var scheduleInfo: js.UndefOr[NullableOption[RequestSchedule]] = js.undefined
}
object UnifiedRoleEligibilitySchedule {
  
  inline def apply(): UnifiedRoleEligibilitySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedRoleEligibilitySchedule]
  }
  
  extension [Self <: UnifiedRoleEligibilitySchedule](x: Self) {
    
    inline def setMemberType(value: NullableOption[String]): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setScheduleInfo(value: NullableOption[RequestSchedule]): Self = StObject.set(x, "scheduleInfo", value.asInstanceOf[js.Any])
    
    inline def setScheduleInfoNull: Self = StObject.set(x, "scheduleInfo", null)
    
    inline def setScheduleInfoUndefined: Self = StObject.set(x, "scheduleInfo", js.undefined)
  }
}
