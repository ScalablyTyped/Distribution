package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleX extends StObject {
  
  var canvas: Any
  
  var offsetX: Double
  
  var offsetY: Double
  
  var scaleX: Double
  
  var scaleY: Double
}
object ScaleX {
  
  inline def apply(canvas: Any, offsetX: Double, offsetY: Double, scaleX: Double, scaleY: Double): ScaleX = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleX]
  }
  
  extension [Self <: ScaleX](x: Self) {
    
    inline def setCanvas(value: Any): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
