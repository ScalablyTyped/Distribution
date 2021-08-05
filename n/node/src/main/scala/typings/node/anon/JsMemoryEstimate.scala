package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsMemoryEstimate extends StObject {
  
  var jsMemoryEstimate: Double
  
  var jsMemoryRange: js.Tuple2[Double, Double]
}
object JsMemoryEstimate {
  
  inline def apply(jsMemoryEstimate: Double, jsMemoryRange: js.Tuple2[Double, Double]): JsMemoryEstimate = {
    val __obj = js.Dynamic.literal(jsMemoryEstimate = jsMemoryEstimate.asInstanceOf[js.Any], jsMemoryRange = jsMemoryRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsMemoryEstimate]
  }
  
  extension [Self <: JsMemoryEstimate](x: Self) {
    
    inline def setJsMemoryEstimate(value: Double): Self = StObject.set(x, "jsMemoryEstimate", value.asInstanceOf[js.Any])
    
    inline def setJsMemoryRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "jsMemoryRange", value.asInstanceOf[js.Any])
  }
}
