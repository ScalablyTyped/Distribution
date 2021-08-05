package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePageElementTransformRequest extends StObject {
  
  /** The apply mode of the transform update. */
  var applyMode: js.UndefOr[String] = js.undefined
  
  /** The object ID of the page element to update. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The input transform matrix used to update the page element. */
  var transform: js.UndefOr[AffineTransform] = js.undefined
}
object UpdatePageElementTransformRequest {
  
  inline def apply(): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
  
  extension [Self <: UpdatePageElementTransformRequest](x: Self) {
    
    inline def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
    
    inline def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
