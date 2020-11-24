package typings.openlayers.mod.olx.tilegrid

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileGridOptions extends js.Object {
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var origin: js.UndefOr[Coordinate_] = js.native
  
  var origins: js.UndefOr[js.Array[Coordinate_]] = js.native
  
  var resolutions: js.Array[Double] = js.native
  
  var tileSize: js.UndefOr[Double | Size] = js.native
  
  var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.native
}
object TileGridOptions {
  
  @scala.inline
  def apply(resolutions: js.Array[Double]): TileGridOptions = {
    val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileGridOptions]
  }
  
  @scala.inline
  implicit class TileGridOptionsOps[Self <: TileGridOptions] (val x: Self) extends AnyVal {
    
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
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Extent_): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setOrigin(value: Coordinate_): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setOriginsVarargs(value: Coordinate_ *): Self = this.set("origins", js.Array(value :_*))
    
    @scala.inline
    def setOrigins(value: js.Array[Coordinate_]): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double | Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTileSizesVarargs(value: (Double | Size)*): Self = this.set("tileSizes", js.Array(value :_*))
    
    @scala.inline
    def setTileSizes(value: js.Array[Double | Size]): Self = this.set("tileSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSizes: Self = this.set("tileSizes", js.undefined)
  }
}
