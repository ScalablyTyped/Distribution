package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var left: float
  
  var offsetX: float
  
  var offsetY: float
  
  var top: float
}
object OffsetX {
  
  inline def apply(left: float, offsetX: float, offsetY: float, top: float): OffsetX = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: float): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: float): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: float): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setTop(value: float): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
