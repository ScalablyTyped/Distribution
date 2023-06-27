package typings.mjContextMenu

import typings.mjContextMenu.cjsAbstractItemMod.AbstractItem
import typings.mjContextMenu.cjsMenuMod.Menu
import typings.mjContextMenu.cjsVariableItemMod.VariableItem
import typings.mjContextMenu.cjsVariableMod.Variable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAbstractVariableItemMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/cjs/abstract_variable_item", "AbstractVariableItem")
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
