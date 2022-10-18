package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceOsmMod {
  
  @JSImport("ol/source/OSM", JSImport.Default)
  @js.native
  open class default () extends OSM {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/source/OSM", "ATTRIBUTION")
  @js.native
  val ATTRIBUTION: String = js.native
  
  @js.native
  trait OSM
    extends typings.ol.sourceXyzMod.default
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
}
