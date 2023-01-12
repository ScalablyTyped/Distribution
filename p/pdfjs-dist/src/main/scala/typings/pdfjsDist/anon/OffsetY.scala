package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetY extends StObject {
  
  var canvas: Any
  
  var offsetX: Any
  
  var offsetY: Any
  
  var scaleX: Any
  
  var scaleY: Any
}
object OffsetY {
  
  inline def apply(canvas: Any, offsetX: Any, offsetY: Any, scaleX: Any, scaleY: Any): OffsetY = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetY] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: Any): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Any): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Any): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
