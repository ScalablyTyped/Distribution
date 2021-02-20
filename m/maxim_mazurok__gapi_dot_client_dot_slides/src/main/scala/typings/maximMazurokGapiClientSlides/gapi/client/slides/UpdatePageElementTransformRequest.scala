package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePageElementTransformRequest extends StObject {
  
  /** The apply mode of the transform update. */
  var applyMode: js.UndefOr[String] = js.native
  
  /** The object ID of the page element to update. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The input transform matrix used to update the page element. */
  var transform: js.UndefOr[AffineTransform] = js.native
}
object UpdatePageElementTransformRequest {
  
  @scala.inline
  def apply(): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
  
  @scala.inline
  implicit class UpdatePageElementTransformRequestMutableBuilder[Self <: UpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
