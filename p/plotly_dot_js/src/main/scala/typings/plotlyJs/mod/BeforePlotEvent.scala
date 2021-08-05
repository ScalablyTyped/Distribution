package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforePlotEvent extends StObject {
  
  var config: PartialConfig
  
  var data: js.Array[Data]
  
  var layout: PartialLayout
}
object BeforePlotEvent {
  
  inline def apply(config: PartialConfig, data: js.Array[Data], layout: PartialLayout): BeforePlotEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforePlotEvent]
  }
  
  extension [Self <: BeforePlotEvent](x: Self) {
    
    inline def setConfig(value: PartialConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
