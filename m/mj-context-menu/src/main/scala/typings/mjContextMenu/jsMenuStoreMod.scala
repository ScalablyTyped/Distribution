package typings.mjContextMenu

import typings.mjContextMenu.jsContextMenuMod.ContextMenu
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMenuStoreMod {
  
  @JSImport("mj-context-menu/js/menu_store", "MenuStore")
  @js.native
  open class MenuStore protected () extends StObject {
    def this(menu: ContextMenu) = this()
    
    /* private */ var _active: Any = js.native
    
    def active: HTMLElement = js.native
    def active_=(element: HTMLElement): Unit = js.native
    
    /* private */ var addEvent: Any = js.native
    
    /* private */ var addEvents: Any = js.native
    
    /* private */ var addTabindex: Any = js.native
    
    /* private */ var attachedClass: Any = js.native
    
    /* private */ var attrMap: Any = js.native
    
    def clear(): Unit = js.native
    
    /* private */ var counter: Any = js.native
    
    def inTaborder(flag: Boolean): Unit = js.native
    
    def insert(elements: js.Array[HTMLElement]): Unit = js.native
    def insert(elements: NodeListOf[HTMLElement]): Unit = js.native
    def insert(element: HTMLElement): Unit = js.native
    
    /* private */ var insertElement: Any = js.native
    
    def insertTaborder(): Unit = js.native
    
    /* private */ var insertTaborder_ : Any = js.native
    
    /* private */ var keydown: Any = js.native
    
    /* private */ var menu: Any = js.native
    
    def next(): HTMLElement = js.native
    
    def previous(): HTMLElement = js.native
    
    def remove(element: js.Array[HTMLElement]): Unit = js.native
    def remove(element: HTMLElement): Unit = js.native
    def remove(element: NodeListOf[HTMLElement]): Unit = js.native
    
    /* private */ var removeElement: Any = js.native
    
    /* private */ var removeEvent: Any = js.native
    
    /* private */ var removeEvents: Any = js.native
    
    /* private */ var removeTabindex: Any = js.native
    
    def removeTaborder(): Unit = js.native
    
    /* private */ var removeTaborder_ : Any = js.native
    
    /* private */ var sort: Any = js.native
    
    /* protected */ var store: js.Array[HTMLElement] = js.native
    
    /* private */ var taborder: Any = js.native
  }
}
