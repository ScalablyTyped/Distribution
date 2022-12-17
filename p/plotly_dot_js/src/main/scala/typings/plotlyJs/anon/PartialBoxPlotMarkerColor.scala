package typings.plotlyJs.anon

import typings.plotlyJs.mod.MarkerSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js/lib/traces/box.BoxPlotMarker> */
trait PartialBoxPlotMarkerColor extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var line: js.UndefOr[PartialcolorColorwidthnum] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var symbol: js.UndefOr[MarkerSymbol] = js.undefined
}
object PartialBoxPlotMarkerColor {
  
  inline def apply(): PartialBoxPlotMarkerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBoxPlotMarkerColor]
  }
  
  extension [Self <: PartialBoxPlotMarkerColor](x: Self) {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setLine(value: PartialcolorColorwidthnum): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    inline def setOutliercolorUndefined: Self = StObject.set(x, "outliercolor", js.undefined)
    
    inline def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value*))
  }
}
