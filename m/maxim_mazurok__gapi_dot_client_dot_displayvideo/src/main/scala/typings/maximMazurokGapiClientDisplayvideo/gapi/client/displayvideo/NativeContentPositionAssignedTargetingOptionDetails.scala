package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeContentPositionAssignedTargetingOptionDetails extends StObject {
  
  /** The content position. Output only in v1. Required in v2. */
  var contentPosition: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_NATIVE_CONTENT_POSITION`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object NativeContentPositionAssignedTargetingOptionDetails {
  
  inline def apply(): NativeContentPositionAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeContentPositionAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeContentPositionAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    inline def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
