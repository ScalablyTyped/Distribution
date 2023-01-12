package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbColor extends StObject {
  
  // Blue value
  var b: js.UndefOr[Double] = js.undefined
  
  // Green value
  var g: js.UndefOr[Double] = js.undefined
  
  // Red value
  var r: js.UndefOr[Double] = js.undefined
}
object RgbColor {
  
  inline def apply(): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbColor] (val x: Self) extends AnyVal {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
