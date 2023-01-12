package typings.normalizeWheel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PixelX extends StObject {
    
    var pixelX: Double
    
    var pixelY: Double
    
    var spinX: Double
    
    var spinY: Double
  }
  object PixelX {
    
    inline def apply(pixelX: Double, pixelY: Double, spinX: Double, spinY: Double): PixelX = {
      val __obj = js.Dynamic.literal(pixelX = pixelX.asInstanceOf[js.Any], pixelY = pixelY.asInstanceOf[js.Any], spinX = spinX.asInstanceOf[js.Any], spinY = spinY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PixelX] (val x: Self) extends AnyVal {
      
      inline def setPixelX(value: Double): Self = StObject.set(x, "pixelX", value.asInstanceOf[js.Any])
      
      inline def setPixelY(value: Double): Self = StObject.set(x, "pixelY", value.asInstanceOf[js.Any])
      
      inline def setSpinX(value: Double): Self = StObject.set(x, "spinX", value.asInstanceOf[js.Any])
      
      inline def setSpinY(value: Double): Self = StObject.set(x, "spinY", value.asInstanceOf[js.Any])
    }
  }
}
