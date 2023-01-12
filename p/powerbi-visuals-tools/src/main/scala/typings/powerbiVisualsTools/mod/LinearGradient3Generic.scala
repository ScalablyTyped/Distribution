package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradient3Generic[TColor, TValue, TStrategy] extends StObject {
  
  var max: RuleColorStopGeneric[TColor, TValue]
  
  var mid: RuleColorStopGeneric[TColor, TValue]
  
  var min: RuleColorStopGeneric[TColor, TValue]
  
  var nullColoringStrategy: js.UndefOr[NullColoringStrategyGeneric[TStrategy, TColor]] = js.undefined
}
object LinearGradient3Generic {
  
  inline def apply[TColor, TValue, TStrategy](
    max: RuleColorStopGeneric[TColor, TValue],
    mid: RuleColorStopGeneric[TColor, TValue],
    min: RuleColorStopGeneric[TColor, TValue]
  ): LinearGradient3Generic[TColor, TValue, TStrategy] = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient3Generic[TColor, TValue, TStrategy]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearGradient3Generic[?, ?, ?], TColor, TValue, TStrategy] (val x: Self & (LinearGradient3Generic[TColor, TValue, TStrategy])) extends AnyVal {
    
    inline def setMax(value: RuleColorStopGeneric[TColor, TValue]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMid(value: RuleColorStopGeneric[TColor, TValue]): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMin(value: RuleColorStopGeneric[TColor, TValue]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setNullColoringStrategy(value: NullColoringStrategyGeneric[TStrategy, TColor]): Self = StObject.set(x, "nullColoringStrategy", value.asInstanceOf[js.Any])
    
    inline def setNullColoringStrategyUndefined: Self = StObject.set(x, "nullColoringStrategy", js.undefined)
  }
}
