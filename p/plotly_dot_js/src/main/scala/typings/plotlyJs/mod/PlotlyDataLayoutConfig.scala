package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotlyDataLayoutConfig extends StObject {
  
  var config: js.UndefOr[PartialConfig] = js.undefined
  
  var data: js.Array[Data]
  
  var layout: js.UndefOr[PartialLayout] = js.undefined
}
object PlotlyDataLayoutConfig {
  
  inline def apply(data: js.Array[Data]): PlotlyDataLayoutConfig = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotlyDataLayoutConfig]
  }
  
  extension [Self <: PlotlyDataLayoutConfig](x: Self) {
    
    inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
