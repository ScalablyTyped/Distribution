package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceUrlTileOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var cacheSize: js.UndefOr[Double] = js.undefined
  
  var extent: js.UndefOr[Extent_] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var opaque: js.UndefOr[Boolean] = js.undefined
  
  var projection: ProjectionLike
  
  var state: js.UndefOr[State] = js.undefined
  
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  
  def tileLoadFunction(tile: Tile, url: String): Unit
  @JSName("tileLoadFunction")
  var tileLoadFunction_Original: TileLoadFunctionType
  
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object SourceUrlTileOptions {
  
  @scala.inline
  def apply(tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit): SourceUrlTileOptions = {
    val __obj = js.Dynamic.literal(tileLoadFunction = js.Any.fromFunction2(tileLoadFunction))
    __obj.asInstanceOf[SourceUrlTileOptions]
  }
  
  @scala.inline
  implicit class SourceUrlTileOptionsMutableBuilder[Self <: SourceUrlTileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
    
    @scala.inline
    def setTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
