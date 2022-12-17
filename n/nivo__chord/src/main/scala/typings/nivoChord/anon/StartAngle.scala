package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAngle extends StObject {
  
  var endAngle: Double
  
  var startAngle: Double
}
object StartAngle {
  
  inline def apply(endAngle: Double, startAngle: Double): StartAngle = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAngle]
  }
  
  extension [Self <: StartAngle](x: Self) {
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
