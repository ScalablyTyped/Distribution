package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  val height: Double
  
  val id: Double
  
  val isBMP: Boolean
  
  val isPalette: Boolean
  
  val isRLE: Boolean
  
  val nextZoomId: js.UndefOr[Double] = js.undefined
  
  val noZoom: Boolean
  
  val offset: ScreenCoordsXY
  
  val width: Double
}
object ImageInfo {
  
  inline def apply(
    height: Double,
    id: Double,
    isBMP: Boolean,
    isPalette: Boolean,
    isRLE: Boolean,
    noZoom: Boolean,
    offset: ScreenCoordsXY,
    width: Double
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBMP = isBMP.asInstanceOf[js.Any], isPalette = isPalette.asInstanceOf[js.Any], isRLE = isRLE.asInstanceOf[js.Any], noZoom = noZoom.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  extension [Self <: ImageInfo](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsBMP(value: Boolean): Self = StObject.set(x, "isBMP", value.asInstanceOf[js.Any])
    
    inline def setIsPalette(value: Boolean): Self = StObject.set(x, "isPalette", value.asInstanceOf[js.Any])
    
    inline def setIsRLE(value: Boolean): Self = StObject.set(x, "isRLE", value.asInstanceOf[js.Any])
    
    inline def setNextZoomId(value: Double): Self = StObject.set(x, "nextZoomId", value.asInstanceOf[js.Any])
    
    inline def setNextZoomIdUndefined: Self = StObject.set(x, "nextZoomId", js.undefined)
    
    inline def setNoZoom(value: Boolean): Self = StObject.set(x, "noZoom", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: ScreenCoordsXY): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
