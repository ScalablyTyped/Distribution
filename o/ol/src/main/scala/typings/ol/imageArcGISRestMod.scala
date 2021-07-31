package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageArcGISRestMod {
  
  @JSImport("ol/source/ImageArcGISRest", JSImport.Default)
  @js.native
  class default () extends ImageArcGISRest {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait ImageArcGISRest
    extends typings.ol.sourceImageMod.default {
    
    /**
      * Return the image load function of the source.
      */
    def getImageLoadFunction(): LoadFunction = js.native
    
    /**
      * Get the user-provided params, i.e. those passed to the constructor through
      * the "params" option, and possibly updated using the updateParams method.
      */
    def getParams(): js.Any = js.native
    
    /**
      * Return the URL used for this ArcGIS source.
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
    def updateParams(params: js.Any): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var hidpi: js.UndefOr[Boolean] = js.undefined
    
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
      
      @scala.inline
      def setImageLoadFunction(value: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
