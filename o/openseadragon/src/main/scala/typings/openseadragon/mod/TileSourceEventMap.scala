package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileSourceEventMap extends StObject {
  
  var `open-failed`: OpenFailedTileSourceEvent
  
  var ready: ReadyTileSourceEvent
}
object TileSourceEventMap {
  
  inline def apply(`open-failed`: OpenFailedTileSourceEvent, ready: ReadyTileSourceEvent): TileSourceEventMap = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
    __obj.updateDynamic("open-failed")(`open-failed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileSourceEventMap]
  }
  
  extension [Self <: TileSourceEventMap](x: Self) {
    
    inline def `setOpen-failed`(value: OpenFailedTileSourceEvent): Self = StObject.set(x, "open-failed", value.asInstanceOf[js.Any])
    
    inline def setReady(value: ReadyTileSourceEvent): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
  }
}
