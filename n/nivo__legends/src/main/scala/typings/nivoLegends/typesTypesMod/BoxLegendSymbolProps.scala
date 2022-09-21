package typings.nivoLegends.typesTypesMod

import typings.nivoLegends.typesMod.SymbolProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  symbolShape :@nivo/legends.@nivo/legends/dist/types/types.SymbolShape | react.react.FC<@nivo/legends.@nivo/legends/dist/types/svg/symbols/types.SymbolProps>,   symbolSize :number,   symbolSpacing :number,   symbolBorderWidth :number,   symbolBorderColor :string}> */
trait BoxLegendSymbolProps extends StObject {
  
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  
  var symbolShape: js.UndefOr[SymbolShape | FC[SymbolProps]] = js.undefined
  
  var symbolSize: js.UndefOr[Double] = js.undefined
  
  var symbolSpacing: js.UndefOr[Double] = js.undefined
}
object BoxLegendSymbolProps {
  
  inline def apply(): BoxLegendSymbolProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxLegendSymbolProps]
  }
  
  extension [Self <: BoxLegendSymbolProps](x: Self) {
    
    inline def setSymbolBorderColor(value: String): Self = StObject.set(x, "symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderColorUndefined: Self = StObject.set(x, "symbolBorderColor", js.undefined)
    
    inline def setSymbolBorderWidth(value: Double): Self = StObject.set(x, "symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderWidthUndefined: Self = StObject.set(x, "symbolBorderWidth", js.undefined)
    
    inline def setSymbolShape(value: SymbolShape | FC[SymbolProps]): Self = StObject.set(x, "symbolShape", value.asInstanceOf[js.Any])
    
    inline def setSymbolShapeUndefined: Self = StObject.set(x, "symbolShape", js.undefined)
    
    inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    inline def setSymbolSpacing(value: Double): Self = StObject.set(x, "symbolSpacing", value.asInstanceOf[js.Any])
    
    inline def setSymbolSpacingUndefined: Self = StObject.set(x, "symbolSpacing", js.undefined)
  }
}
