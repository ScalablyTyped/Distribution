package typings.openlayers.mod.olx.source

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.wms.ServerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageWMSOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var hidpi: js.UndefOr[Boolean] = js.undefined
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var params: StringDictionary[js.Any]
  
  var projection: ProjectionLike
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var serverType: js.UndefOr[ServerType | String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ImageWMSOptions {
  
  @scala.inline
  def apply(params: StringDictionary[js.Any]): ImageWMSOptions = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWMSOptions]
  }
  
  @scala.inline
  implicit class ImageWMSOptionsMutableBuilder[Self <: ImageWMSOptions] (val x: Self) extends AnyVal {
    
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
    def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    @scala.inline
    def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
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
    def setServerType(value: ServerType | String): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
