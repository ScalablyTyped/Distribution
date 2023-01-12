package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureScoreControlStateUpdate extends StObject {
  
  // Assigns the control to the user who will take the action.
  var assignedTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides optional comment about the control.
  var comment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty).
  var state: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the user who updated tenant state.
  var updatedBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time at which the control state was updated.
  var updatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object SecureScoreControlStateUpdate {
  
  inline def apply(): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecureScoreControlStateUpdate] (val x: Self) extends AnyVal {
    
    inline def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdatedBy(value: NullableOption[String]): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdatedByNull: Self = StObject.set(x, "updatedBy", null)
    
    inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    inline def setUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "updatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDateTimeNull: Self = StObject.set(x, "updatedDateTime", null)
    
    inline def setUpdatedDateTimeUndefined: Self = StObject.set(x, "updatedDateTime", js.undefined)
  }
}
