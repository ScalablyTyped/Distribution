package typings.openlayers.mod.olx.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMapGuideOptions extends StObject {
  
  var displayDpi: js.UndefOr[Double] = js.undefined
  
  var hidpi: js.UndefOr[Boolean] = js.undefined
  
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  
  var params: js.UndefOr[GlobalObject] = js.undefined
  
  var projection: ProjectionLike
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var useOverlay: js.UndefOr[Boolean] = js.undefined
}
object ImageMapGuideOptions {
  
  inline def apply(): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
  
  extension [Self <: ImageMapGuideOptions](x: Self) {
    
    inline def setDisplayDpi(value: Double): Self = StObject.set(x, "displayDpi", value.asInstanceOf[js.Any])
    
    inline def setDisplayDpiUndefined: Self = StObject.set(x, "displayDpi", js.undefined)
    
    inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    inline def setImageLoadFunction(value: (/* image */ Image, /* url */ String) => Unit): Self = StObject.set(x, "imageLoadFunction", js.Any.fromFunction2(value))
    
    inline def setImageLoadFunctionUndefined: Self = StObject.set(x, "imageLoadFunction", js.undefined)
    
    inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
    
    inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
    
    inline def setParams(value: GlobalObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseOverlay(value: Boolean): Self = StObject.set(x, "useOverlay", value.asInstanceOf[js.Any])
    
    inline def setUseOverlayUndefined: Self = StObject.set(x, "useOverlay", js.undefined)
  }
}
