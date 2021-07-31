package typings.playable

import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardControlTypesMod {
  
  trait IKeyboardControl extends StObject {
    
    def addKeyControl(key: Double, callback: EventListener): Unit
    
    def destroy(): Unit
  }
  object IKeyboardControl {
    
    @scala.inline
    def apply(addKeyControl: (Double, EventListener) => Unit, destroy: () => Unit): IKeyboardControl = {
      val __obj = js.Dynamic.literal(addKeyControl = js.Any.fromFunction2(addKeyControl), destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[IKeyboardControl]
    }
    
    @scala.inline
    implicit class IKeyboardControlMutableBuilder[Self <: IKeyboardControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddKeyControl(value: (Double, EventListener) => Unit): Self = StObject.set(x, "addKeyControl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
