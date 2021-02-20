package typings.photonui.photonui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  def destroy(): Unit = js.native
  
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  
  def removeCallback(id: String): Unit = js.native
}
object Base {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterCallback(value: (String, String, js.Function, js.Any) => Unit): Self = StObject.set(x, "registerCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveCallback(value: String => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
  }
}
