package typings.mjContextMenu

import typings.mjContextMenu.cjsKeyNavigatableMod.KeyNavigatable
import typings.mjContextMenu.cjsMouseNavigatableMod.MouseNavigatable
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAbstractNavigatableMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/cjs/abstract_navigatable", "AbstractNavigatable")
  @js.native
  open class AbstractNavigatable ()
    extends StObject
       with KeyNavigatable
       with MouseNavigatable {
    
    def addEvents(element: HTMLElement): Unit = js.native
    
    /* private */ var bubble: Any = js.native
    
    def bubbleKey(): Unit = js.native
    
    /* CompleteClass */
    override def click(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def down(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def escape(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def keydown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def left(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def mousedown(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseout(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseover(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseup(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def right(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def space(event: KeyboardEvent): Unit = js.native
    
    /* protected */ def stop(event: Event): Unit = js.native
    
    /* CompleteClass */
    override def up(event: KeyboardEvent): Unit = js.native
  }
}
