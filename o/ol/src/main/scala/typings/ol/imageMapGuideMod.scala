package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMapGuideMod {
  
  @JSImport("ol/source/ImageMapGuide", JSImport.Default)
  @js.native
  class default protected () extends ImageMapGuide {
    def this(options: Options) = this()
  }
  
  @js.native
  trait ImageMapGuide
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
    
    def getUrl(
      baseUrl: String,
      params: StringDictionary[String | Double],
      extent: Extent,
      size: Size,
      projection: typings.ol.projectionMod.default
    ): String = js.native
    
    /**
      * Set the image load function of the MapGuide source.
      */
    def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Update the user-provided params.
      */
    def updateParams(params: js.Any): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var displayDpi: js.UndefOr[Double] = js.native
    
    var hidpi: js.UndefOr[Boolean] = js.native
    
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.native
    
    var imageSmoothing: js.UndefOr[Boolean] = js.native
    
    var metersPerUnit: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var ratio: js.UndefOr[Double] = js.native
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var useOverlay: js.UndefOr[Boolean] = js.native
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
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDisplayDpi(value: Double): Self = StObject.set(x, "displayDpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDpiUndefined: Self = StObject.set(x, "displayDpi", js.undefined)
      
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
      def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
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
      
      @scala.inline
      def setUseOverlay(value: Boolean): Self = StObject.set(x, "useOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOverlayUndefined: Self = StObject.set(x, "useOverlay", js.undefined)
    }
  }
}
