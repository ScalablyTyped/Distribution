package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceTileOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var logo: js.UndefOr[String | LogoOptions] = js.native
  
  var opaque: js.UndefOr[Boolean] = js.native
  
  var projection: ProjectionLike = js.native
  
  var state: js.UndefOr[State] = js.native
  
  var tileGrid: js.UndefOr[TileGrid] = js.native
  
  var tilePixelRatio: js.UndefOr[Double] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object SourceTileOptions {
  
  @scala.inline
  def apply(): SourceTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTileOptions]
  }
  
  @scala.inline
  implicit class SourceTileOptionsMutableBuilder[Self <: SourceTileOptions] (val x: Self) extends AnyVal {
    
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
    def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
