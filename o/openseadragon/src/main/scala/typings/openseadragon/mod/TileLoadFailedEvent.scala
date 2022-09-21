package typings.openseadragon.mod

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLoadFailedEvent
  extends StObject
     with TileEvent {
  
  var message: String
  
  var tileRequest: XMLHttpRequest
  
  var time: Double
}
object TileLoadFailedEvent {
  
  inline def apply(
    eventSource: Viewer,
    message: String,
    tile: Tile,
    tileRequest: XMLHttpRequest,
    tiledImage: TiledImage,
    time: Double,
    userData: Any
  ): TileLoadFailedEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tileRequest = tileRequest.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLoadFailedEvent]
  }
  
  extension [Self <: TileLoadFailedEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTileRequest(value: XMLHttpRequest): Self = StObject.set(x, "tileRequest", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
