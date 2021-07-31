package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolidFill extends StObject {
  
  /**
    * The fraction of this `color` that should be applied to the pixel. That is, the final pixel color is defined by the equation: pixel color = alpha * (color) + (1.0 - alpha) *
    * (background color) This means that a value of 1.0 corresponds to a solid color, whereas a value of 0.0 corresponds to a completely transparent color.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /** The color value of the solid fill. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
}
object SolidFill {
  
  @scala.inline
  def apply(): SolidFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolidFill]
  }
  
  @scala.inline
  implicit class SolidFillMutableBuilder[Self <: SolidFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setColor(value: OpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
