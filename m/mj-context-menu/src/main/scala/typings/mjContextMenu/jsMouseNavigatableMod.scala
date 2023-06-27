package typings.mjContextMenu

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMouseNavigatableMod {
  
  object MOUSE {
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.CLICK")
    @js.native
    def CLICK: String = js.native
    inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.DBLCLICK")
    @js.native
    def DBLCLICK: String = js.native
    inline def DBLCLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DBLCLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.DOWN")
    @js.native
    def DOWN: String = js.native
    inline def DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.MOVE")
    @js.native
    def MOVE: String = js.native
    inline def MOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.OUT")
    @js.native
    def OUT: String = js.native
    inline def OUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUT")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.OVER")
    @js.native
    def OVER: String = js.native
    inline def OVER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVER")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.SELECTEND")
    @js.native
    def SELECTEND: String = js.native
    inline def SELECTEND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTEND")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.SELECTSTART")
    @js.native
    def SELECTSTART: String = js.native
    inline def SELECTSTART_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTSTART")(x.asInstanceOf[js.Any])
    
    @JSImport("mj-context-menu/js/mouse_navigatable", "MOUSE.UP")
    @js.native
    def UP: String = js.native
    inline def UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
  }
  
  trait MouseNavigatable extends StObject {
    
    def click(event: MouseEvent): Unit
    
    def mousedown(event: MouseEvent): Unit
    
    def mouseout(event: MouseEvent): Unit
    
    def mouseover(event: MouseEvent): Unit
    
    def mouseup(event: MouseEvent): Unit
  }
  object MouseNavigatable {
    
    inline def apply(
      click: MouseEvent => Unit,
      mousedown: MouseEvent => Unit,
      mouseout: MouseEvent => Unit,
      mouseover: MouseEvent => Unit,
      mouseup: MouseEvent => Unit
    ): MouseNavigatable = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), mousedown = js.Any.fromFunction1(mousedown), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup))
      __obj.asInstanceOf[MouseNavigatable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseNavigatable] (val x: Self) extends AnyVal {
      
      inline def setClick(value: MouseEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setMousedown(value: MouseEvent => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
      
      inline def setMouseout(value: MouseEvent => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
      
      inline def setMouseover(value: MouseEvent => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      inline def setMouseup(value: MouseEvent => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction1(value))
    }
  }
}
