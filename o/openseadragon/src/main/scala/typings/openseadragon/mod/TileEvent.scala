package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var tile: Tile
  
  var tiledImage: TiledImage
}
object TileEvent {
  
  inline def apply(eventSource: Viewer, tile: Tile, tiledImage: TiledImage, userData: Any): TileEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileEvent]
  }
  
  extension [Self <: TileEvent](x: Self) {
    
    inline def setTile(value: Tile): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTiledImage(value: TiledImage): Self = StObject.set(x, "tiledImage", value.asInstanceOf[js.Any])
  }
}
