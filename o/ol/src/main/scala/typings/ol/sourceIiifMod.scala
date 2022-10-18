package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatIiifinfoMod.Versions
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceIiifMod {
  
  @JSImport("ol/source/IIIF", JSImport.Default)
  @js.native
  open class default () extends IIIF {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait IIIF
    extends typings.ol.sourceTileImageMod.default
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var quality: js.UndefOr[String] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var size: Size
    
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var supports: js.UndefOr[js.Array[String]] = js.undefined
    
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Versions] = js.undefined
    
    var zDirection: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(size: Size): Options = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSupports(value: js.Array[String]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
      
      inline def setSupportsVarargs(value: String*): Self = StObject.set(x, "supports", js.Array(value*))
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: Versions): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
}
