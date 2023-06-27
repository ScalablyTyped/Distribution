package typings.mjContextMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsVariableItemMod {
  
  trait VariableItem extends StObject {
    
    def register(): Unit
    
    def unregister(): Unit
    
    def update(): Unit
  }
  object VariableItem {
    
    inline def apply(register: () => Unit, unregister: () => Unit, update: () => Unit): VariableItem = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction0(register), unregister = js.Any.fromFunction0(unregister), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[VariableItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariableItem] (val x: Self) extends AnyVal {
      
      inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
