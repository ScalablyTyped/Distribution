package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayVerticalAlign extends StObject {
  
  var display: String
  
  var verticalAlign: String
}
object DisplayVerticalAlign {
  
  inline def apply(display: String, verticalAlign: String): DisplayVerticalAlign = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayVerticalAlign]
  }
  
  extension [Self <: DisplayVerticalAlign](x: Self) {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
  }
}
