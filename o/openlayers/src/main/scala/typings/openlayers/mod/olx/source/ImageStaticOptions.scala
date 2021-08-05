package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageStaticOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var imageExtent: Extent_
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  
  var imageSize: js.UndefOr[Size] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var projection: ProjectionLike
  
  var url: String
}
object ImageStaticOptions {
  
  inline def apply(imageExtent: Extent_, url: String): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
  
  extension [Self <: ImageStaticOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setImageExtent(value: Extent_): Self = StObject.set(x, "imageExtent", value.asInstanceOf[js.Any])
    
    inline def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
