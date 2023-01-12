package typings.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCodeConfig extends StObject {
  
  var firstSlide: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lastSlide: js.UndefOr[js.Array[Double]] = js.undefined
  
  var nextSlide: js.UndefOr[js.Array[Double]] = js.undefined
  
  var pause: js.UndefOr[js.Array[Double]] = js.undefined
  
  var previousSlide: js.UndefOr[js.Array[Double]] = js.undefined
}
object KeyCodeConfig {
  
  inline def apply(): KeyCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCodeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyCodeConfig] (val x: Self) extends AnyVal {
    
    inline def setFirstSlide(value: js.Array[Double]): Self = StObject.set(x, "firstSlide", value.asInstanceOf[js.Any])
    
    inline def setFirstSlideUndefined: Self = StObject.set(x, "firstSlide", js.undefined)
    
    inline def setFirstSlideVarargs(value: Double*): Self = StObject.set(x, "firstSlide", js.Array(value*))
    
    inline def setLastSlide(value: js.Array[Double]): Self = StObject.set(x, "lastSlide", value.asInstanceOf[js.Any])
    
    inline def setLastSlideUndefined: Self = StObject.set(x, "lastSlide", js.undefined)
    
    inline def setLastSlideVarargs(value: Double*): Self = StObject.set(x, "lastSlide", js.Array(value*))
    
    inline def setNextSlide(value: js.Array[Double]): Self = StObject.set(x, "nextSlide", value.asInstanceOf[js.Any])
    
    inline def setNextSlideUndefined: Self = StObject.set(x, "nextSlide", js.undefined)
    
    inline def setNextSlideVarargs(value: Double*): Self = StObject.set(x, "nextSlide", js.Array(value*))
    
    inline def setPause(value: js.Array[Double]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPauseVarargs(value: Double*): Self = StObject.set(x, "pause", js.Array(value*))
    
    inline def setPreviousSlide(value: js.Array[Double]): Self = StObject.set(x, "previousSlide", value.asInstanceOf[js.Any])
    
    inline def setPreviousSlideUndefined: Self = StObject.set(x, "previousSlide", js.undefined)
    
    inline def setPreviousSlideVarargs(value: Double*): Self = StObject.set(x, "previousSlide", js.Array(value*))
  }
}
