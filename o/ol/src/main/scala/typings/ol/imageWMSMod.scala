package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmsservertypeMod.WMSServerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageWMSMod {
  
  @JSImport("ol/source/ImageWMS", JSImport.Default)
  @js.native
  open class default () extends ImageWMS {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait ImageWMS
    extends typings.ol.sourceImageMod.default {
    
    /**
      * Return the GetFeatureInfo URL for the passed coordinate, resolution, and
      * projection. Return undefined if the GetFeatureInfo URL cannot be
      * constructed.
      */
    def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: Any): js.UndefOr[String] = js.native
    
    /**
      * Return the image load function of the source.
      */
    def getImageLoadFunction(): LoadFunction = js.native
    
    /**
      * Return the GetLegendGraphic URL, optionally optimized for the passed
      * resolution and possibly including any passed specific parameters. Returns
      * undefined if the GetLegendGraphic URL cannot be constructed.
      */
    def getLegendUrl(): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Double, params: Any): js.UndefOr[String] = js.native
    def getLegendUrl(resolution: Unit, params: Any): js.UndefOr[String] = js.native
    
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      */
    def getParams(): Any = js.native
    
    /**
      * Return the URL used for this WMS source.
      */
    def getUrl(): js.UndefOr[String] = js.native
    
    /**
      * Set the image load function of the source.
      */
    def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Set the URL to use for requests.
      */
    def setUrl(): Unit = js.native
    def setUrl(url: String): Unit = js.native
    
    /**
      * Update the user-provided params.
      */
    def updateParams(params: Any): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var params: StringDictionary[Any]
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var serverType: js.UndefOr[WMSServerType | String] = js.undefined
    
    var url: String
  }
  object Options {
    
    inline def apply(params: StringDictionary[Any], url: String): Options = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      inline def setImageLoadFunction(value: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setServerType(value: WMSServerType | String): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      
      inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
