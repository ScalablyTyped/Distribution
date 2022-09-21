package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityChangeTiledImageEvent
  extends StObject
     with OSDEvent[TiledImage] {
  
  var opacity: Boolean
}
object OpacityChangeTiledImageEvent {
  
  inline def apply(eventSource: TiledImage, opacity: Boolean, userData: Any): OpacityChangeTiledImageEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityChangeTiledImageEvent]
  }
  
  extension [Self <: OpacityChangeTiledImageEvent](x: Self) {
    
    inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
