package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This generates Mapbox Vector Tiles that can be viewed with a vector-tile capable slippy-map viewer.
  * The tiles contain road geometries and metadata that can be used to examine the routing graph.
  * The tiles are generated directly from the data in-memory, so are in sync with actual routing results,
  * and let you examine which roads are actually routable, and what weights they have applied.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
trait TileOptions
  extends StObject
     with Options {
  
  /**
    * Array an array consisting of x, y, and z values representing tile coordinates like wiki.openstreetmap.org/wiki/Slippy_map_tilenames
    * and are supported by vector tile viewers like Mapbox GL JS.
    */
  var ZXY: js.UndefOr[Tile] = js.undefined
}
object TileOptions {
  
  inline def apply(): TileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOptions]
  }
  
  extension [Self <: TileOptions](x: Self) {
    
    inline def setZXY(value: Tile): Self = StObject.set(x, "ZXY", value.asInstanceOf[js.Any])
    
    inline def setZXYUndefined: Self = StObject.set(x, "ZXY", js.undefined)
  }
}
