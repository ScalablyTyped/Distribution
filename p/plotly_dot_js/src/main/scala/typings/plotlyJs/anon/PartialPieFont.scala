package typings.plotlyJs.anon

import typings.plotlyJs.pieMod.PieColor
import typings.plotlyJs.pieMod.PieColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/pie.PieFont> */
trait PartialPieFont extends StObject {
  
  var color: js.UndefOr[PieColor | PieColors] = js.undefined
  
  var family: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var size: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object PartialPieFont {
  
  inline def apply(): PartialPieFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPieFont]
  }
  
  extension [Self <: PartialPieFont](x: Self) {
    
    inline def setColor(value: PieColor | PieColors): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[PieColor | Null])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFamily(value: String | js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value*))
    
    inline def setSize(value: Double | js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
