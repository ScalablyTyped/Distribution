package typings.mjContextMenu

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsKeyNavigatableMod {
  
  @js.native
  sealed trait KEY extends StObject
  @JSImport("mj-context-menu/cjs/key_navigatable", "KEY")
  @js.native
  object KEY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KEY & Double] = js.native
    
    @js.native
    sealed trait DOWN
      extends StObject
         with KEY
    /* 40 */ val DOWN: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.DOWN & Double = js.native
    
    @js.native
    sealed trait ESCAPE
      extends StObject
         with KEY
    /* 27 */ val ESCAPE: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.ESCAPE & Double = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with KEY
    /* 37 */ val LEFT: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.LEFT & Double = js.native
    
    @js.native
    sealed trait RETURN
      extends StObject
         with KEY
    /* 13 */ val RETURN: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.RETURN & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with KEY
    /* 39 */ val RIGHT: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.RIGHT & Double = js.native
    
    @js.native
    sealed trait SPACE
      extends StObject
         with KEY
    /* 32 */ val SPACE: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.SPACE & Double = js.native
    
    @js.native
    sealed trait UP
      extends StObject
         with KEY
    /* 38 */ val UP: typings.mjContextMenu.cjsKeyNavigatableMod.KEY.UP & Double = js.native
  }
  
  trait KeyNavigatable extends StObject {
    
    def down(event: KeyboardEvent): Unit
    
    def escape(event: KeyboardEvent): Unit
    
    def keydown(event: KeyboardEvent): Unit
    
    def left(event: KeyboardEvent): Unit
    
    def right(event: KeyboardEvent): Unit
    
    def space(event: KeyboardEvent): Unit
    
    def up(event: KeyboardEvent): Unit
  }
  object KeyNavigatable {
    
    inline def apply(
      down: KeyboardEvent => Unit,
      escape: KeyboardEvent => Unit,
      keydown: KeyboardEvent => Unit,
      left: KeyboardEvent => Unit,
      right: KeyboardEvent => Unit,
      space: KeyboardEvent => Unit,
      up: KeyboardEvent => Unit
    ): KeyNavigatable = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), escape = js.Any.fromFunction1(escape), keydown = js.Any.fromFunction1(keydown), left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right), space = js.Any.fromFunction1(space), up = js.Any.fromFunction1(up))
      __obj.asInstanceOf[KeyNavigatable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyNavigatable] (val x: Self) extends AnyVal {
      
      inline def setDown(value: KeyboardEvent => Unit): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      inline def setEscape(value: KeyboardEvent => Unit): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setKeydown(value: KeyboardEvent => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      inline def setLeft(value: KeyboardEvent => Unit): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(value: KeyboardEvent => Unit): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setSpace(value: KeyboardEvent => Unit): Self = StObject.set(x, "space", js.Any.fromFunction1(value))
      
      inline def setUp(value: KeyboardEvent => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    }
  }
}
