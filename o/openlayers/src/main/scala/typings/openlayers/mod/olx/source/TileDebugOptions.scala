package typings.openlayers.mod.olx.source

import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileDebugOptions extends js.Object {
  
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
  implicit class TileDebugOptionsOps[Self <: TileDebugOptions] (val x: Self) extends AnyVal {
    
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
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
