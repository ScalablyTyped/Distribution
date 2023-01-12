package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadyTileSourceEvent
  extends StObject
     with OSDEvent[TileSource] {
  
  var tileSource: js.Object
}
object ReadyTileSourceEvent {
  
  inline def apply(eventSource: TileSource, tileSource: js.Object, userData: Any): ReadyTileSourceEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], tileSource = tileSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyTileSourceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadyTileSourceEvent] (val x: Self) extends AnyVal {
    
    inline def setTileSource(value: js.Object): Self = StObject.set(x, "tileSource", value.asInstanceOf[js.Any])
  }
}
