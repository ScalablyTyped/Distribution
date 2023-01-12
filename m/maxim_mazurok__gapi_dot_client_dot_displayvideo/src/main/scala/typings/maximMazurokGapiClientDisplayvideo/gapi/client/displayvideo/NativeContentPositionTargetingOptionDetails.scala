package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeContentPositionTargetingOptionDetails extends StObject {
  
  /** Output only. The content position. */
  var contentPosition: js.UndefOr[String] = js.undefined
}
object NativeContentPositionTargetingOptionDetails {
  
  inline def apply(): NativeContentPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeContentPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeContentPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    inline def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
  }
}
