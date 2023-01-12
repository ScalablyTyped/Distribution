package typings.plotlyJs.anon

import typings.plotlyJs.libTracesPieMod.PieColor
import typings.plotlyJs.libTracesPieMod.PieColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/pie.PieMarker> */
trait PartialPieMarker extends StObject {
  
  var colors: js.UndefOr[PieColors] = js.undefined
  
  var line: js.UndefOr[PartialPieLine] = js.undefined
}
object PartialPieMarker {
  
  inline def apply(): PartialPieMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPieMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPieMarker] (val x: Self) extends AnyVal {
    
    inline def setColors(value: PieColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setLine(value: PartialPieLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
