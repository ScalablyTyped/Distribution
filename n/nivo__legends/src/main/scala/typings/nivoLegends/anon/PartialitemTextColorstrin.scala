package typings.nivoLegends.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  itemTextColor :string,   itemBackground :string,   itemOpacity :number,   symbolSize :number,   symbolBorderWidth :number,   symbolBorderColor :string}> */
trait PartialitemTextColorstrin extends StObject {
  
  var itemBackground: js.UndefOr[String] = js.undefined
  
  var itemOpacity: js.UndefOr[Double] = js.undefined
  
  var itemTextColor: js.UndefOr[String] = js.undefined
  
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  
  var symbolSize: js.UndefOr[Double] = js.undefined
}
object PartialitemTextColorstrin {
  
  inline def apply(): PartialitemTextColorstrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialitemTextColorstrin]
  }
  
  extension [Self <: PartialitemTextColorstrin](x: Self) {
    
    inline def setItemBackground(value: String): Self = StObject.set(x, "itemBackground", value.asInstanceOf[js.Any])
    
    inline def setItemBackgroundUndefined: Self = StObject.set(x, "itemBackground", js.undefined)
    
    inline def setItemOpacity(value: Double): Self = StObject.set(x, "itemOpacity", value.asInstanceOf[js.Any])
    
    inline def setItemOpacityUndefined: Self = StObject.set(x, "itemOpacity", js.undefined)
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
    
    inline def setSymbolBorderColor(value: String): Self = StObject.set(x, "symbolBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderColorUndefined: Self = StObject.set(x, "symbolBorderColor", js.undefined)
    
    inline def setSymbolBorderWidth(value: Double): Self = StObject.set(x, "symbolBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolBorderWidthUndefined: Self = StObject.set(x, "symbolBorderWidth", js.undefined)
    
    inline def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
  }
}
