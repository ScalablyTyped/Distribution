package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawCalls extends StObject {
  
  var drawCalls: js.Array[Any]
  
  var isNewMaterial: js.Array[Any]
  
  var lightMaskChanged: js.Array[Any]
}
object DrawCalls {
  
  inline def apply(drawCalls: js.Array[Any], isNewMaterial: js.Array[Any], lightMaskChanged: js.Array[Any]): DrawCalls = {
    val __obj = js.Dynamic.literal(drawCalls = drawCalls.asInstanceOf[js.Any], isNewMaterial = isNewMaterial.asInstanceOf[js.Any], lightMaskChanged = lightMaskChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawCalls]
  }
  
  extension [Self <: DrawCalls](x: Self) {
    
    inline def setDrawCalls(value: js.Array[Any]): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    inline def setDrawCallsVarargs(value: Any*): Self = StObject.set(x, "drawCalls", js.Array(value*))
    
    inline def setIsNewMaterial(value: js.Array[Any]): Self = StObject.set(x, "isNewMaterial", value.asInstanceOf[js.Any])
    
    inline def setIsNewMaterialVarargs(value: Any*): Self = StObject.set(x, "isNewMaterial", js.Array(value*))
    
    inline def setLightMaskChanged(value: js.Array[Any]): Self = StObject.set(x, "lightMaskChanged", value.asInstanceOf[js.Any])
    
    inline def setLightMaskChangedVarargs(value: Any*): Self = StObject.set(x, "lightMaskChanged", js.Array(value*))
  }
}
