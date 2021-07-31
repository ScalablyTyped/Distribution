package typings.plotlyJs.anon

import typings.plotlyJs.mod.MarkerSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  outliercolor :plotly.js.plotly.js.Color,   symbol :plotly.js.plotly.js.MarkerSymbol,   opacity :number,   size :number,   color :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}>}> */
trait PartialoutliercolorColors extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var line: js.UndefOr[PartialcolorColorwidthnum] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var symbol: js.UndefOr[MarkerSymbol] = js.undefined
}
object PartialoutliercolorColors {
  
  @scala.inline
  def apply(): PartialoutliercolorColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialoutliercolorColors]
  }
  
  @scala.inline
  implicit class PartialoutliercolorColorsMutableBuilder[Self <: PartialoutliercolorColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: PartialcolorColorwidthnum): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutliercolorUndefined: Self = StObject.set(x, "outliercolor", js.undefined)
    
    @scala.inline
    def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSymbol(value: MarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbolVarargs(value: (String | Double)*): Self = StObject.set(x, "symbol", js.Array(value :_*))
  }
}
