package typings.openlayers.mod.olx.source

import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileDebugOptions extends StObject {
  
  var projection: ProjectionLike
  
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object TileDebugOptions {
  
  inline def apply(): TileDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileDebugOptions]
  }
  
  extension [Self <: TileDebugOptions](x: Self) {
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
