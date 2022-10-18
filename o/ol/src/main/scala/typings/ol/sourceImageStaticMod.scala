package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageStaticMod {
  
  @JSImport("ol/source/ImageStatic", JSImport.Default)
  @js.native
  open class default protected () extends Static {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var imageExtent: js.UndefOr[Extent] = js.undefined
    
    var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var imageSize: js.UndefOr[Size] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var url: String
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
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
      
      inline def setImageExtent(value: Extent): Self = StObject.set(x, "imageExtent", value.asInstanceOf[js.Any])
      
      inline def setImageExtentUndefined: Self = StObject.set(x, "imageExtent", js.undefined)
      
      inline def setImageLoadFunction(value: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
      
      inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
      
      inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
