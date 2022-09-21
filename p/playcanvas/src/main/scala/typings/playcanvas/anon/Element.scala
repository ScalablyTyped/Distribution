package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: js.Array[Any]
  
  var model: js.Array[Any]
  
  var render: js.Array[Any]
  
  var sprite: js.Array[Any]
}
object Element {
  
  inline def apply(element: js.Array[Any], model: js.Array[Any], render: js.Array[Any], sprite: js.Array[Any]): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: js.Array[Any]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: Any*): Self = StObject.set(x, "element", js.Array(value*))
    
    inline def setModel(value: js.Array[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelVarargs(value: Any*): Self = StObject.set(x, "model", js.Array(value*))
    
    inline def setRender(value: js.Array[Any]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderVarargs(value: Any*): Self = StObject.set(x, "render", js.Array(value*))
    
    inline def setSprite(value: js.Array[Any]): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteVarargs(value: Any*): Self = StObject.set(x, "sprite", js.Array(value*))
  }
}
