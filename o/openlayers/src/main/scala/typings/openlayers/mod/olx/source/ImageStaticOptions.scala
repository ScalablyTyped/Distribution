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
  
  @scala.inline
  def apply(imageExtent: Extent_, url: String): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
  
  @scala.inline
  implicit class ImageStaticOptionsMutableBuilder[Self <: ImageStaticOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    @scala.inline
    def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setImageExtent(value: Extent_): Self = StObject.set(x, "imageExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
