package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.anon.Color
import typings.powerbiVisualsTools.anon.EndColor
import typings.powerbiVisualsTools.anon.PatternKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill
  extends StObject
     with _StructuralObjectValue {
  
  var gradient: js.UndefOr[EndColor] = js.undefined
  
  var pattern: js.UndefOr[PatternKind] = js.undefined
  
  var solid: js.UndefOr[Color] = js.undefined
}
object Fill {
  
  inline def apply(): Fill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setGradient(value: EndColor): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setPattern(value: PatternKind): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSolid(value: Color): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
  }
}
