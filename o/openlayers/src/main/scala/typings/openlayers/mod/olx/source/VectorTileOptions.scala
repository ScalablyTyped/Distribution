package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileCoord
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.TileUrlFunctionType
import typings.openlayers.mod.VectorTile
import typings.openlayers.mod.format.Feature
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileOptions extends js.Object {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[Feature] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var overlaps: js.UndefOr[Boolean] = js.native
  
  var projection: ProjectionLike = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ VectorTile, 
      /* coords */ TileCoord, 
      /* state */ typings.openlayers.mod.Tile.State, 
      /* s */ String, 
      /* feature */ Feature, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object VectorTileOptions {
  
  @scala.inline
  def apply(): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorTileOptions]
  }
  
  @scala.inline
  implicit class VectorTileOptionsOps[Self <: VectorTileOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setFormat(value: Feature): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setOverlaps(value: Boolean): Self = this.set("overlaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlaps: Self = this.set("overlaps", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTileClass(
      value: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typings.openlayers.mod.Tile.State, /* s */ String, /* feature */ Feature, /* type */ TileLoadFunctionType) => _
    ): Self = this.set("tileClass", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteTileClass: Self = this.set("tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = this.set("tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileGrid: Self = this.set("tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = this.set("tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTileLoadFunction: Self = this.set("tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = this.set("tileUrlFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTileUrlFunction: Self = this.set("tileUrlFunction", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
