package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatus extends StObject {
  
  var fill: js.UndefOr[NodeStatusFill] = js.undefined
  
  var shape: js.UndefOr[NodeStatusShape] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object NodeStatus {
  
  inline def apply(): NodeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeStatus]
  }
  
  extension [Self <: NodeStatus](x: Self) {
    
    inline def setFill(value: NodeStatusFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setShape(value: NodeStatusShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
