package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  def clear(): Unit
  
  var drawCalls: js.Array[Any]
  
  var isNewMaterial: js.Array[Any]
  
  var lightMaskChanged: js.Array[Any]
}
object Clear {
  
  inline def apply(
    clear: () => Unit,
    drawCalls: js.Array[Any],
    isNewMaterial: js.Array[Any],
    lightMaskChanged: js.Array[Any]
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), drawCalls = drawCalls.asInstanceOf[js.Any], isNewMaterial = isNewMaterial.asInstanceOf[js.Any], lightMaskChanged = lightMaskChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDrawCalls(value: js.Array[Any]): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    inline def setDrawCallsVarargs(value: Any*): Self = StObject.set(x, "drawCalls", js.Array(value*))
    
    inline def setIsNewMaterial(value: js.Array[Any]): Self = StObject.set(x, "isNewMaterial", value.asInstanceOf[js.Any])
    
    inline def setIsNewMaterialVarargs(value: Any*): Self = StObject.set(x, "isNewMaterial", js.Array(value*))
    
    inline def setLightMaskChanged(value: js.Array[Any]): Self = StObject.set(x, "lightMaskChanged", value.asInstanceOf[js.Any])
    
    inline def setLightMaskChangedVarargs(value: Any*): Self = StObject.set(x, "lightMaskChanged", js.Array(value*))
  }
}
