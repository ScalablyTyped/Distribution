package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.ImageTile
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileCoord
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.TileUrlFunctionType
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileImageOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var opaque: js.UndefOr[Boolean] = js.native
  
  var projection: ProjectionLike = js.native
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ typings.openlayers.mod.Tile.State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.native
  
  var transition: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object TileImageOptions {
  
  @scala.inline
  def apply(): TileImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileImageOptions]
  }
  
  @scala.inline
  implicit class TileImageOptionsMutableBuilder[Self <: TileImageOptions] (val x: Self) extends AnyVal {
    
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
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
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
    def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTileClass(
      value: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ typings.openlayers.mod.Tile.State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => _
    ): Self = StObject.set(x, "tileClass", js.Any.fromFunction6(value))
    
    @scala.inline
    def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
    
    @scala.inline
    def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    @scala.inline
    def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    @scala.inline
    def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
    
    @scala.inline
    def setTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
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
