package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStop extends StObject {
  
  /** The alpha value of this color in the gradient band. Defaults to 1.0, fully opaque. */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /** The color of the gradient stop. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
  
  /** The relative position of the color stop in the gradient band measured in percentage. The value should be in the interval [0.0, 1.0]. */
  var position: js.UndefOr[Double] = js.undefined
}
object ColorStop {
  
  inline def apply(): ColorStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStop]
  }
  
  extension [Self <: ColorStop](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
