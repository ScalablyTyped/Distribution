package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAnimation extends StObject {
  
  var frameBase: Double
  
  var frameCount: js.UndefOr[Double] = js.undefined
  
  var frameDuration: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[ScreenCoordsXY] = js.undefined
}
object ImageAnimation {
  
  inline def apply(frameBase: Double): ImageAnimation = {
    val __obj = js.Dynamic.literal(frameBase = frameBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAnimation] (val x: Self) extends AnyVal {
    
    inline def setFrameBase(value: Double): Self = StObject.set(x, "frameBase", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrameCountUndefined: Self = StObject.set(x, "frameCount", js.undefined)
    
    inline def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    inline def setFrameDurationUndefined: Self = StObject.set(x, "frameDuration", js.undefined)
    
    inline def setOffset(value: ScreenCoordsXY): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
