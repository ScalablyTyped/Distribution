package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapType
  */
trait MapType extends StObject {
  
  def getTile(x: Double, y: Double, z: Double): HTMLElement | CanvasTile | ImageTile | Tile
  
  var maxZoom: Double
  
  var minZoom: Double
  
  var name: String
  
  var projection: Projection
  
  var tileSize: Size
}
object MapType {
  
  inline def apply(
    getTile: (Double, Double, Double) => HTMLElement | CanvasTile | ImageTile | Tile,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    tileSize: Size
  ): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
  
  extension [Self <: MapType](x: Self) {
    
    inline def setGetTile(value: (Double, Double, Double) => HTMLElement | CanvasTile | ImageTile | Tile): Self = StObject.set(x, "getTile", js.Any.fromFunction3(value))
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
  }
}
