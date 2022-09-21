package typings.nivoBullet.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedRangeDatum extends StObject {
  
  var color: String
  
  var index: Double
  
  var v0: Double
  
  var v1: Double
}
object ComputedRangeDatum {
  
  inline def apply(color: String, index: Double, v0: Double, v1: Double): ComputedRangeDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedRangeDatum]
  }
  
  extension [Self <: ComputedRangeDatum](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setV0(value: Double): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
    
    inline def setV1(value: Double): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
  }
}
