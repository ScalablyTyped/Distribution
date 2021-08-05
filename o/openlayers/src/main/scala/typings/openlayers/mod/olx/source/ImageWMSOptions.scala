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
  
  inline def apply(params: StringDictionary[js.Any]): ImageWMSOptions = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWMSOptions]
  }
  
  extension [Self <: ImageWMSOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    inline def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    inline def setServerType(value: ServerType | String): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
