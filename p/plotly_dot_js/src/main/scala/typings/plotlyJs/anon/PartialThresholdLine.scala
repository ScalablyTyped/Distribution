package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Threshold> */
trait PartialThresholdLine extends StObject {
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PartialThresholdLine {
  
  inline def apply(): PartialThresholdLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThresholdLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialThresholdLine] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Partial[GaugeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
