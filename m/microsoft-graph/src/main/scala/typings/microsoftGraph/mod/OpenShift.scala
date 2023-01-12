package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenShift
  extends StObject
     with ChangeTrackedEntity {
  
  // An unpublished open shift.
  var draftOpenShift: js.UndefOr[NullableOption[OpenShiftItem]] = js.undefined
  
  // ID for the scheduling group that the open shift belongs to.
  var schedulingGroupId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A published open shift.
  var sharedOpenShift: js.UndefOr[NullableOption[OpenShiftItem]] = js.undefined
}
object OpenShift {
  
  inline def apply(): OpenShift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenShift] (val x: Self) extends AnyVal {
    
    inline def setDraftOpenShift(value: NullableOption[OpenShiftItem]): Self = StObject.set(x, "draftOpenShift", value.asInstanceOf[js.Any])
    
    inline def setDraftOpenShiftNull: Self = StObject.set(x, "draftOpenShift", null)
    
    inline def setDraftOpenShiftUndefined: Self = StObject.set(x, "draftOpenShift", js.undefined)
    
    inline def setSchedulingGroupId(value: NullableOption[String]): Self = StObject.set(x, "schedulingGroupId", value.asInstanceOf[js.Any])
    
    inline def setSchedulingGroupIdNull: Self = StObject.set(x, "schedulingGroupId", null)
    
    inline def setSchedulingGroupIdUndefined: Self = StObject.set(x, "schedulingGroupId", js.undefined)
    
    inline def setSharedOpenShift(value: NullableOption[OpenShiftItem]): Self = StObject.set(x, "sharedOpenShift", value.asInstanceOf[js.Any])
    
    inline def setSharedOpenShiftNull: Self = StObject.set(x, "sharedOpenShift", null)
    
    inline def setSharedOpenShiftUndefined: Self = StObject.set(x, "sharedOpenShift", js.undefined)
  }
}
