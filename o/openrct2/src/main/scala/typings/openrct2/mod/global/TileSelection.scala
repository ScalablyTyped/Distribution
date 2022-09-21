package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileSelection extends StObject {
  
  var range: MapRange
  
  var tiles: js.Array[CoordsXY]
}
object TileSelection {
  
  inline def apply(range: MapRange, tiles: js.Array[CoordsXY]): TileSelection = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileSelection]
  }
  
  extension [Self <: TileSelection](x: Self) {
    
    inline def setRange(value: MapRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTiles(value: js.Array[CoordsXY]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesVarargs(value: CoordsXY*): Self = StObject.set(x, "tiles", js.Array(value*))
  }
}
