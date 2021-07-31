package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssignedTargetingOptionsRequest extends StObject {
  
  /** Required. The assigned targeting option IDs to delete. */
  var assignedTargetingOptionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Identifies the type of this assigned targeting option. */
  var targetingType: js.UndefOr[String] = js.undefined
}
object DeleteAssignedTargetingOptionsRequest {
  
  @scala.inline
  def apply(): DeleteAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAssignedTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit class DeleteAssignedTargetingOptionsRequestMutableBuilder[Self <: DeleteAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTargetingOptionIds(value: js.Array[String]): Self = StObject.set(x, "assignedTargetingOptionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTargetingOptionIdsUndefined: Self = StObject.set(x, "assignedTargetingOptionIds", js.undefined)
    
    @scala.inline
    def setAssignedTargetingOptionIdsVarargs(value: String*): Self = StObject.set(x, "assignedTargetingOptionIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
