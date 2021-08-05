package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmsservertypeMod.WMSServerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileWMSMod {
  
  @JSImport("ol/source/TileWMS", JSImport.Default)
  @js.native
  class default () extends TileWMS {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var gutter: js.UndefOr[Double] = js.undefined
    
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var params: StringDictionary[js.Any]
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var serverType: js.UndefOr[WMSServerType | String] = js.undefined
    
    var tileClass: js.UndefOr[typings.ol.imageTileMod.default] = js.undefined
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(params: StringDictionary[js.Any]): Options = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setServerType(value: WMSServerType | String): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
      
      inline def setTileClass(value: typings.ol.imageTileMod.default): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  @js.native
  trait TileWMS
    extends typings.ol.tileImageMod.default {
    
    /**
      * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
      * projection. Return undefined if the GetFeatureInfo URL cannot be
      * constructed.
      */
    def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): js.UndefOr[String] = js.native
    
    /**
      * Return the GetLegendGraphic URL, optionally optimized for the passed
      * resolution and possibly including any passed specific parameters. Returns
      * undefined if the GetLegendGraphic URL cannot be constructed.
      */
    def getLegendUrl(): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double, params: js.Any): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Unit, params: js.Any): js.UndefOr[String] = js.native
    
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      */
    def getParams(): js.Any = js.native
    
    /**
      * Update the user-provided params.
      */
    def updateParams(params: js.Any): Unit = js.native
  }
}
