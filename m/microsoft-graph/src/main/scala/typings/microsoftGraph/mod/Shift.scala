package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shift
  extends StObject
     with ChangeTrackedEntity {
  
  // The draft version of this shift that is viewable by managers. Required.
  var draftShift: js.UndefOr[NullableOption[ShiftItem]] = js.undefined
  
  // ID of the scheduling group the shift is part of. Required.
  var schedulingGroupId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The shared version of this shift that is viewable by both employees and managers. Required.
  var sharedShift: js.UndefOr[NullableOption[ShiftItem]] = js.undefined
  
  // ID of the user assigned to the shift. Required.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object Shift {
  
  inline def apply(): Shift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shift] (val x: Self) extends AnyVal {
    
    inline def setDraftShift(value: NullableOption[ShiftItem]): Self = StObject.set(x, "draftShift", value.asInstanceOf[js.Any])
    
    inline def setDraftShiftNull: Self = StObject.set(x, "draftShift", null)
    
    inline def setDraftShiftUndefined: Self = StObject.set(x, "draftShift", js.undefined)
    
    inline def setSchedulingGroupId(value: NullableOption[String]): Self = StObject.set(x, "schedulingGroupId", value.asInstanceOf[js.Any])
    
    inline def setSchedulingGroupIdNull: Self = StObject.set(x, "schedulingGroupId", null)
    
    inline def setSchedulingGroupIdUndefined: Self = StObject.set(x, "schedulingGroupId", js.undefined)
    
    inline def setSharedShift(value: NullableOption[ShiftItem]): Self = StObject.set(x, "sharedShift", value.asInstanceOf[js.Any])
    
    inline def setSharedShiftNull: Self = StObject.set(x, "sharedShift", null)
    
    inline def setSharedShiftUndefined: Self = StObject.set(x, "sharedShift", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
