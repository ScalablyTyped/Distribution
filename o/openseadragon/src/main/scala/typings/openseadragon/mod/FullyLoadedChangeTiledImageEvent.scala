package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullyLoadedChangeTiledImageEvent
  extends StObject
     with OSDEvent[TiledImage] {
  
  var fullyLoaded: Boolean
}
object FullyLoadedChangeTiledImageEvent {
  
  inline def apply(eventSource: TiledImage, fullyLoaded: Boolean, userData: Any): FullyLoadedChangeTiledImageEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], fullyLoaded = fullyLoaded.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullyLoadedChangeTiledImageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullyLoadedChangeTiledImageEvent] (val x: Self) extends AnyVal {
    
    inline def setFullyLoaded(value: Boolean): Self = StObject.set(x, "fullyLoaded", value.asInstanceOf[js.Any])
  }
}
