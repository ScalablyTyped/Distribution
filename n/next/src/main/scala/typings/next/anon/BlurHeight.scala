package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurHeight extends StObject {
  
  var blurDataURL: String
  
  var blurHeight: js.UndefOr[Double] = js.undefined
  
  var blurWidth: js.UndefOr[Double] = js.undefined
  
  var heightInt: js.UndefOr[Double] = js.undefined
  
  var widthInt: js.UndefOr[Double] = js.undefined
}
object BlurHeight {
  
  inline def apply(blurDataURL: String): BlurHeight = {
    val __obj = js.Dynamic.literal(blurDataURL = blurDataURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurHeight]
  }
  
  extension [Self <: BlurHeight](x: Self) {
    
    inline def setBlurDataURL(value: String): Self = StObject.set(x, "blurDataURL", value.asInstanceOf[js.Any])
    
    inline def setBlurHeight(value: Double): Self = StObject.set(x, "blurHeight", value.asInstanceOf[js.Any])
    
    inline def setBlurHeightUndefined: Self = StObject.set(x, "blurHeight", js.undefined)
    
    inline def setBlurWidth(value: Double): Self = StObject.set(x, "blurWidth", value.asInstanceOf[js.Any])
    
    inline def setBlurWidthUndefined: Self = StObject.set(x, "blurWidth", js.undefined)
    
    inline def setHeightInt(value: Double): Self = StObject.set(x, "heightInt", value.asInstanceOf[js.Any])
    
    inline def setHeightIntUndefined: Self = StObject.set(x, "heightInt", js.undefined)
    
    inline def setWidthInt(value: Double): Self = StObject.set(x, "widthInt", value.asInstanceOf[js.Any])
    
    inline def setWidthIntUndefined: Self = StObject.set(x, "widthInt", js.undefined)
  }
}
