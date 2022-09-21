package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFailedTileSourceEvent
  extends StObject
     with OSDEvent[TileSource] {
  
  var message: String
  
  var source: String
}
object OpenFailedTileSourceEvent {
  
  inline def apply(eventSource: TileSource, message: String, source: String, userData: Any): OpenFailedTileSourceEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFailedTileSourceEvent]
  }
  
  extension [Self <: OpenFailedTileSourceEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
