package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shift extends ChangeTrackedEntity {
  
  // The draft version of this shift that is viewable by managers. Required.
  var draftShift: js.UndefOr[NullableOption[ShiftItem]] = js.native
  
  // ID of the scheduling group the shift is part of. Required.
  var schedulingGroupId: js.UndefOr[NullableOption[String]] = js.native
  
  // The shared version of this shift that is viewable by both employees and managers. Required.
  var sharedShift: js.UndefOr[NullableOption[ShiftItem]] = js.native
  
  // ID of the user assigned to the shift. Required.
  var userId: js.UndefOr[NullableOption[String]] = js.native
}
object Shift {
  
  @scala.inline
  def apply(): Shift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shift]
  }
  
  @scala.inline
  implicit class ShiftMutableBuilder[Self <: Shift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraftShift(value: NullableOption[ShiftItem]): Self = StObject.set(x, "draftShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftShiftNull: Self = StObject.set(x, "draftShift", null)
    
    @scala.inline
    def setDraftShiftUndefined: Self = StObject.set(x, "draftShift", js.undefined)
    
    @scala.inline
    def setSchedulingGroupId(value: NullableOption[String]): Self = StObject.set(x, "schedulingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingGroupIdNull: Self = StObject.set(x, "schedulingGroupId", null)
    
    @scala.inline
    def setSchedulingGroupIdUndefined: Self = StObject.set(x, "schedulingGroupId", js.undefined)
    
    @scala.inline
    def setSharedShift(value: NullableOption[ShiftItem]): Self = StObject.set(x, "sharedShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedShiftNull: Self = StObject.set(x, "sharedShift", null)
    
    @scala.inline
    def setSharedShiftUndefined: Self = StObject.set(x, "sharedShift", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
