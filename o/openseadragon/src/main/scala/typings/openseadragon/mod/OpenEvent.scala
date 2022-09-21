package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var source: TileSource
}
object OpenEvent {
  
  inline def apply(eventSource: Viewer, source: TileSource, userData: Any): OpenEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEvent]
  }
  
  extension [Self <: OpenEvent](x: Self) {
    
    inline def setSource(value: TileSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
