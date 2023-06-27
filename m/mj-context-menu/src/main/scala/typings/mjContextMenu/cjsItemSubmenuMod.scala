package typings.mjContextMenu

import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsAbstractItemMod.AbstractItem
import typings.mjContextMenu.cjsMenuMod.Menu
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsItemSubmenuMod {
  
  @JSImport("mj-context-menu/cjs/item_submenu", "Submenu")
  @js.native
  open class Submenu protected () extends AbstractItem {
    def this(menu: Menu, content: String) = this()
    def this(menu: Menu, content: String, id: String) = this()
    
    /* private */ var _submenu: Any = js.native
    
    /* private */ var span: Any = js.native
    
    def submenu: Menu = js.native
    def submenu_=(menu: Menu): Unit = js.native
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Submenu {
    
    @JSImport("mj-context-menu/cjs/item_submenu", "Submenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(factory: ParserFactory, param1: typings.mjContextMenu.anon.Menu, menu: Menu): Submenu = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Submenu]
  }
}
