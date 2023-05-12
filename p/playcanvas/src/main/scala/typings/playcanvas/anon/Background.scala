package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: Any
  
  var graph0: Any
  
  var graph1: Any
  
  var graph2: Any
  
  var watermark: Any
}
object Background {
  
  inline def apply(background: Any, graph0: Any, graph1: Any, graph2: Any, watermark: Any): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], graph0 = graph0.asInstanceOf[js.Any], graph1 = graph1.asInstanceOf[js.Any], graph2 = graph2.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setGraph0(value: Any): Self = StObject.set(x, "graph0", value.asInstanceOf[js.Any])
    
    inline def setGraph1(value: Any): Self = StObject.set(x, "graph1", value.asInstanceOf[js.Any])
    
    inline def setGraph2(value: Any): Self = StObject.set(x, "graph2", value.asInstanceOf[js.Any])
    
    inline def setWatermark(value: Any): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
