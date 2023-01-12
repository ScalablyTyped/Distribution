package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbColor extends StObject {
  
  /** The blue component of the color, from 0.0 to 1.0. */
  var blue: js.UndefOr[Double] = js.undefined
  
  /** The green component of the color, from 0.0 to 1.0. */
  var green: js.UndefOr[Double] = js.undefined
  
  /** The red component of the color, from 0.0 to 1.0. */
  var red: js.UndefOr[Double] = js.undefined
}
object RgbColor {
  
  inline def apply(): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
