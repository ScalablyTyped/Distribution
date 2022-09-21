package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  def destroy(): Unit
  
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit
  
  def removeCallback(id: String): Unit
}
object Base {
  
  inline def apply(
    destroy: () => Unit,
    registerCallback: (String, String, js.Function, Any) => Unit,
    removeCallback: String => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setRegisterCallback(value: (String, String, js.Function, Any) => Unit): Self = StObject.set(x, "registerCallback", js.Any.fromFunction4(value))
    
    inline def setRemoveCallback(value: String => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
  }
}
