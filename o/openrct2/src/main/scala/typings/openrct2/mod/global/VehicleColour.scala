package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VehicleColour extends StObject {
  
  var body: Double
  
  var ternary: Double
  
  var trim: Double
}
object VehicleColour {
  
  inline def apply(body: Double, ternary: Double, trim: Double): VehicleColour = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], ternary = ternary.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[VehicleColour]
  }
  
  extension [Self <: VehicleColour](x: Self) {
    
    inline def setBody(value: Double): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTernary(value: Double): Self = StObject.set(x, "ternary", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: Double): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
  }
}
