package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillRuleGeneric[TColor, TValue, TStrategy] extends StObject {
  
  var linearGradient2: js.UndefOr[LinearGradient2Generic[TColor, TValue, TStrategy]] = js.undefined
  
  var linearGradient3: js.UndefOr[LinearGradient3Generic[TColor, TValue, TStrategy]] = js.undefined
}
object FillRuleGeneric {
  
  inline def apply[TColor, TValue, TStrategy](): FillRuleGeneric[TColor, TValue, TStrategy] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillRuleGeneric[TColor, TValue, TStrategy]]
  }
  
  extension [Self <: FillRuleGeneric[?, ?, ?], TColor, TValue, TStrategy](x: Self & (FillRuleGeneric[TColor, TValue, TStrategy])) {
    
    inline def setLinearGradient2(value: LinearGradient2Generic[TColor, TValue, TStrategy]): Self = StObject.set(x, "linearGradient2", value.asInstanceOf[js.Any])
    
    inline def setLinearGradient2Undefined: Self = StObject.set(x, "linearGradient2", js.undefined)
    
    inline def setLinearGradient3(value: LinearGradient3Generic[TColor, TValue, TStrategy]): Self = StObject.set(x, "linearGradient3", value.asInstanceOf[js.Any])
    
    inline def setLinearGradient3Undefined: Self = StObject.set(x, "linearGradient3", js.undefined)
  }
}
