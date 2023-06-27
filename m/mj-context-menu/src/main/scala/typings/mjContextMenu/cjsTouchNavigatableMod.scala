package typings.mjContextMenu

import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsTouchNavigatableMod {
  
  object TOUCH {
    
    @JSImport("mj-context-menu/cjs/touch_navigatable", "TOUCH")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/cjs/touch_navigatable", "TOUCH.CANCEL")
    @js.native
    def CANCEL: String = js.native
    inline def CANCEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/cjs/touch_navigatable", "TOUCH.END")
    @js.native
    def END: String = js.native
    inline def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/cjs/touch_navigatable", "TOUCH.MOVE")
    @js.native
    def MOVE: String = js.native
    inline def MOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/cjs/touch_navigatable", "TOUCH.START")
    @js.native
    def START: String = js.native
    inline def START_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  }
  
  trait TouchNavigatable extends StObject {
    
    def touchcancel(event: TouchEvent): Unit
    
    def touchend(event: TouchEvent): Unit
    
    def touchmove(event: TouchEvent): Unit
    
    def touchstart(event: TouchEvent): Unit
  }
  object TouchNavigatable {
    
    inline def apply(
      touchcancel: TouchEvent => Unit,
      touchend: TouchEvent => Unit,
      touchmove: TouchEvent => Unit,
      touchstart: TouchEvent => Unit
    ): TouchNavigatable = {
      val __obj = js.Dynamic.literal(touchcancel = js.Any.fromFunction1(touchcancel), touchend = js.Any.fromFunction1(touchend), touchmove = js.Any.fromFunction1(touchmove), touchstart = js.Any.fromFunction1(touchstart))
      __obj.asInstanceOf[TouchNavigatable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TouchNavigatable] (val x: Self) extends AnyVal {
      
      inline def setTouchcancel(value: TouchEvent => Unit): Self = StObject.set(x, "touchcancel", js.Any.fromFunction1(value))
      
      inline def setTouchend(value: TouchEvent => Unit): Self = StObject.set(x, "touchend", js.Any.fromFunction1(value))
      
      inline def setTouchmove(value: TouchEvent => Unit): Self = StObject.set(x, "touchmove", js.Any.fromFunction1(value))
      
      inline def setTouchstart(value: TouchEvent => Unit): Self = StObject.set(x, "touchstart", js.Any.fromFunction1(value))
    }
  }
}
