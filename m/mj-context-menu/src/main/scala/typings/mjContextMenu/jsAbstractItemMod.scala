package typings.mjContextMenu

import typings.mjContextMenu.jsAbstractEntryMod.AbstractEntry
import typings.mjContextMenu.jsItemMod.Item
import typings.mjContextMenu.jsMenuMod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAbstractItemMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mjContextMenu.jsElementMod.Element because Already inherited
  - typings.mjContextMenu.jsEntryMod.Entry because Already inherited
  - typings.mjContextMenu.jsItemMod.Item because var conflicts: html, menu, `type`. Inlined content, id, press, disable, enable */ @JSImport("mj-context-menu/js/abstract_item", "AbstractItem")
  @js.native
  open class AbstractItem protected () extends AbstractEntry {
    def this(menu: Menu, `type`: String, _content: String) = this()
    def this(menu: Menu, `type`: String, _content: String, id: String) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* protected */ def activate(): Unit = js.native
    
    /* private */ var callbacks: Any = js.native
    
    def content: String = js.native
    def content_=(content: String): Unit = js.native
    @JSName("content")
    var content_FAbstractItem: String = js.native
    
    /* protected */ def deactivate(): Unit = js.native
    
    def disable(): Unit = js.native
    
    /* protected */ var disabled: Boolean = js.native
    
    def enable(): Unit = js.native
    
    /* protected */ def executeAction(): Unit = js.native
    
    /* private */ var executeCallbacks_ : Any = js.native
    
    def id: String = js.native
    @JSName("id")
    var id_FAbstractItem: String = js.native
    
    def press(): Unit = js.native
    
    def registerCallback(func: js.Function1[/* value */ Item, Unit]): Unit = js.native
    
    def unregisterCallback(func: js.Function1[/* value */ Item, Unit]): Unit = js.native
  }
}
