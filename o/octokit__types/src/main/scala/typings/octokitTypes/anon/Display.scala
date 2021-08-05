package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  @JSName("$ref")
  var $ref: String
  
  var display: String
  
  var value: String
}
object Display {
  
  inline def apply($ref: String, display: String, value: String): Display = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
