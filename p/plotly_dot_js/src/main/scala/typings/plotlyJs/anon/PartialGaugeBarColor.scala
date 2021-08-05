package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.GaugeBar> */
trait PartialGaugeBarColor extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
}
object PartialGaugeBarColor {
  
  inline def apply(): PartialGaugeBarColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeBarColor]
  }
  
  extension [Self <: PartialGaugeBarColor](x: Self) {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setLine(value: Partial[GaugeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
