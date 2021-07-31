package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageStaticMod {
  
  @JSImport("ol/source/ImageStatic", JSImport.Default)
  @js.native
  class default protected () extends Static {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var imageExtent: js.UndefOr[Extent] = js.undefined
    
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var imageSize: js.UndefOr[Size] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var url: String
  }
  object Options {
    
    @scala.inline
    def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
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
      def setImageExtent(value: Extent): Self = StObject.set(x, "imageExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageExtentUndefined: Self = StObject.set(x, "imageExtent", js.undefined)
      
      @scala.inline
      def setImageLoadFunction(value: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      @scala.inline
      def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Static
    extends typings.ol.sourceImageMod.default {
    
    /**
      * Returns the image extent
      */
    def getImageExtent(): Extent = js.native
    
    /**
      * Return the URL used for this image source.
      */
    def getUrl(): String = js.native
  }
}
