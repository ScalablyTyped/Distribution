package typings.openlayers.mod.olx.source

import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileDebugOptions extends StObject {
  
  var projection: ProjectionLike = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object TileDebugOptions {
  
  @scala.inline
  def apply(): TileDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileDebugOptions]
  }
  
  @scala.inline
  implicit class TileDebugOptionsMutableBuilder[Self <: TileDebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
