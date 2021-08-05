package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blue extends StObject {
  
  var blue: Double
  
  var green: Double
  
  var red: Double
}
object Blue {
  
  inline def apply(blue: Double, green: Double, red: Double): Blue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
  
  extension [Self <: Blue](x: Self) {
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
