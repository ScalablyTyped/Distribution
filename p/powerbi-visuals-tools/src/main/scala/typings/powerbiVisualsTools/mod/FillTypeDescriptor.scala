package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.anon.ColorPatternKind
import typings.powerbiVisualsTools.anon.StartColor
import typings.powerbiVisualsTools.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillTypeDescriptor extends StObject {
  
  var gradient: js.UndefOr[StartColor] = js.undefined
  
  var pattern: js.UndefOr[ColorPatternKind] = js.undefined
  
  var solid: js.UndefOr[`0`] = js.undefined
}
object FillTypeDescriptor {
  
  inline def apply(): FillTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillTypeDescriptor]
  }
  
  extension [Self <: FillTypeDescriptor](x: Self) {
    
    inline def setGradient(value: StartColor): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setPattern(value: ColorPatternKind): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSolid(value: `0`): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
  }
}
