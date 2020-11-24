package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This generates Mapbox Vector Tiles that can be viewed with a vector-tile capable slippy-map viewer.
  * The tiles contain road geometries and metadata that can be used to examine the routing graph.
  * The tiles are generated directly from the data in-memory, so are in sync with actual routing results,
  * and let you examine which roads are actually routable, and what weights they have applied.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
@js.native
trait TileOptions extends Options {
  
  /**
    * Array an array consisting of x, y, and z values representing tile coordinates like wiki.openstreetmap.org/wiki/Slippy_map_tilenames
    * and are supported by vector tile viewers like Mapbox GL JS.
    */
  var ZXY: js.UndefOr[Tile] = js.native
}
object TileOptions {
  
  @scala.inline
  def apply(): TileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOptions]
  }
  
  @scala.inline
  implicit class TileOptionsOps[Self <: TileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setZXY(value: Tile): Self = this.set("ZXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZXY: Self = this.set("ZXY", js.undefined)
  }
}
