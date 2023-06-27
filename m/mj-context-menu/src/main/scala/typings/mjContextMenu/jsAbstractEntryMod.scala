package typings.mjContextMenu

import typings.mjContextMenu.jsEntryMod.Entry
import typings.mjContextMenu.jsMenuElementMod.MenuElement
import typings.mjContextMenu.jsMenuMod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAbstractEntryMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/js/abstract_entry", "AbstractEntry")
  @js.native
  open class AbstractEntry protected ()
    extends MenuElement
       with Entry {
    def this(_menu: Menu, _type: String) = this()
    
    /* private */ var _menu: Any = js.native
    
    /* private */ var _type: Any = js.native
    
    /* private */ var hidden: Any = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def isHidden(): Boolean = js.native
    
    /* CompleteClass */
    var menu: Menu = js.native
    @JSName("menu")
    def menu_MAbstractEntry: Menu = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    @JSName("type")
    def type_MAbstractEntry: String = js.native
  }
}
