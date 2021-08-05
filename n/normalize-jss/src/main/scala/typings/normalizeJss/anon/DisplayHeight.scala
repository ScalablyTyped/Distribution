package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayHeight extends StObject {
  
  var display: String
  
  var height: Double
}
object DisplayHeight {
  
  inline def apply(display: String, height: Double): DisplayHeight = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayHeight]
  }
  
  extension [Self <: DisplayHeight](x: Self) {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
