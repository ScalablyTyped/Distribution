package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileDrawingEvent
  extends StObject
     with TileEvent {
  
  var context: Tile
  
  var rendered: Tile
}
object TileDrawingEvent {
  
  inline def apply(
    context: Tile,
    eventSource: Viewer,
    rendered: Tile,
    tile: Tile,
    tiledImage: TiledImage,
    userData: Any
  ): TileDrawingEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileDrawingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileDrawingEvent] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Tile): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: Tile): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
