package typings.nivoScales.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedSerieAxis[Value /* <: ScaleValue */] extends StObject {
  
  var all: js.Array[Value]
  
  var max: Value
  
  var maxStacked: js.UndefOr[Value] = js.undefined
  
  var min: Value
  
  var minStacked: js.UndefOr[Value] = js.undefined
}
object ComputedSerieAxis {
  
  inline def apply[Value /* <: ScaleValue */](all: js.Array[Value], max: Value, min: Value): ComputedSerieAxis[Value] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedSerieAxis[Value]]
  }
  
  extension [Self <: ComputedSerieAxis[?], Value /* <: ScaleValue */](x: Self & ComputedSerieAxis[Value]) {
    
    inline def setAll(value: js.Array[Value]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: Value*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setMax(value: Value): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxStacked(value: Value): Self = StObject.set(x, "maxStacked", value.asInstanceOf[js.Any])
    
    inline def setMaxStackedUndefined: Self = StObject.set(x, "maxStacked", js.undefined)
    
    inline def setMin(value: Value): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinStacked(value: Value): Self = StObject.set(x, "minStacked", value.asInstanceOf[js.Any])
    
    inline def setMinStackedUndefined: Self = StObject.set(x, "minStacked", js.undefined)
  }
}
