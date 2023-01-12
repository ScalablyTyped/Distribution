package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadResize extends StObject {
  
  var crop: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var preserve_headers: js.UndefOr[Boolean] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object pluploadResize {
  
  inline def apply(): pluploadResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadResize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pluploadResize] (val x: Self) extends AnyVal {
    
    inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPreserve_headers(value: Boolean): Self = StObject.set(x, "preserve_headers", value.asInstanceOf[js.Any])
    
    inline def setPreserve_headersUndefined: Self = StObject.set(x, "preserve_headers", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
