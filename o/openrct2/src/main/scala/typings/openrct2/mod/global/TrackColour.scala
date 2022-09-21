package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackColour extends StObject {
  
  var additional: Double
  
  var main: Double
  
  var supports: Double
}
object TrackColour {
  
  inline def apply(additional: Double, main: Double, supports: Double): TrackColour = {
    val __obj = js.Dynamic.literal(additional = additional.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackColour]
  }
  
  extension [Self <: TrackColour](x: Self) {
    
    inline def setAdditional(value: Double): Self = StObject.set(x, "additional", value.asInstanceOf[js.Any])
    
    inline def setMain(value: Double): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: Double): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
  }
}
