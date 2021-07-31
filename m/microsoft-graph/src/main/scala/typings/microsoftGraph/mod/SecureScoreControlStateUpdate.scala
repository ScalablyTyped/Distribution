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
  
  @scala.inline
  def apply(): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
  
  @scala.inline
  implicit class SecureScoreControlStateUpdateMutableBuilder[Self <: SecureScoreControlStateUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    @scala.inline
    def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    @scala.inline
    def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentNull: Self = StObject.set(x, "comment", null)
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdatedBy(value: NullableOption[String]): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedByNull: Self = StObject.set(x, "updatedBy", null)
    
    @scala.inline
    def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    @scala.inline
    def setUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "updatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDateTimeNull: Self = StObject.set(x, "updatedDateTime", null)
    
    @scala.inline
    def setUpdatedDateTimeUndefined: Self = StObject.set(x, "updatedDateTime", js.undefined)
  }
}
