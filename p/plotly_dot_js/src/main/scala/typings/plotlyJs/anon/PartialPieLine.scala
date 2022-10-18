package typings.plotlyJs.anon

import typings.plotlyJs.libTracesPieMod.PieColor
import typings.plotlyJs.libTracesPieMod.PieColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/pie.PieLine> */
trait PartialPieLine extends StObject {
  
  var color: js.UndefOr[PieColor | PieColors] = js.undefined
  
  var width: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object PartialPieLine {
  
  inline def apply(): PartialPieLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPieLine]
  }
  
  extension [Self <: PartialPieLine](x: Self) {
    
    inline def setColor(value: PieColor | PieColors): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value*))
  }
}
