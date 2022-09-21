package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeOperationChangeTiledImageEvent
  extends StObject
     with OSDEvent[TiledImage] {
  
  var compositeOperationChange: String
}
object CompositeOperationChangeTiledImageEvent {
  
  inline def apply(compositeOperationChange: String, eventSource: TiledImage, userData: Any): CompositeOperationChangeTiledImageEvent = {
    val __obj = js.Dynamic.literal(compositeOperationChange = compositeOperationChange.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeOperationChangeTiledImageEvent]
  }
  
  extension [Self <: CompositeOperationChangeTiledImageEvent](x: Self) {
    
    inline def setCompositeOperationChange(value: String): Self = StObject.set(x, "compositeOperationChange", value.asInstanceOf[js.Any])
  }
}
