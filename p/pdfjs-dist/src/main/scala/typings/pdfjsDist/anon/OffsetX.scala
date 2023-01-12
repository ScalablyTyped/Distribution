package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var canvas: Any
  
  var offsetX: Double
  
  var offsetY: Double
}
object OffsetX {
  
  inline def apply(canvas: Any, offsetX: Double, offsetY: Double): OffsetX = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: Any): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
  }
}
