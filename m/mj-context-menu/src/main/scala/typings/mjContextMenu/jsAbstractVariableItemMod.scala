package typings.mjContextMenu

import typings.mjContextMenu.jsAbstractItemMod.AbstractItem
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsVariableItemMod.VariableItem
import typings.mjContextMenu.jsVariableMod.Variable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAbstractVariableItemMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/js/abstract_variable_item", "AbstractVariableItem")
  @js.native
  open class AbstractVariableItem[T] protected ()
    extends AbstractItem
       with VariableItem {
    def this(menu: Menu, `type`: String, _content: String) = this()
    def this(menu: Menu, `type`: String, _content: String, id: String) = this()
    
    /* protected */ def generateSpan(): Unit = js.native
    
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /* protected */ var span: HTMLElement = js.native
    
    /* CompleteClass */
    override def unregister(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* protected */ def updateAria(): Unit = js.native
    
    /* protected */ def updateSpan(): Unit = js.native
    
    /* protected */ var variable: Variable[T] = js.native
  }
}
