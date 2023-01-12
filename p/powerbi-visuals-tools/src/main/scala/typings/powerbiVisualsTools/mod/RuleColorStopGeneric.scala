package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleColorStopGeneric[TColor, TValue] extends StObject {
  
  var color: TColor
  
  var value: js.UndefOr[TValue] = js.undefined
}
object RuleColorStopGeneric {
  
  inline def apply[TColor, TValue](color: TColor): RuleColorStopGeneric[TColor, TValue] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleColorStopGeneric[TColor, TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleColorStopGeneric[?, ?], TColor, TValue] (val x: Self & (RuleColorStopGeneric[TColor, TValue])) extends AnyVal {
    
    inline def setColor(value: TColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
