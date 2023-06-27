package typings.mjContextMenu

import typings.mjContextMenu.anon.Items
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.jsAbstractMenuMod.AbstractMenu
import typings.mjContextMenu.jsItemSubmenuMod.Submenu
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSubMenuMod {
  
  @JSImport("mj-context-menu/js/sub_menu", "SubMenu")
  @js.native
  open class SubMenu protected () extends AbstractMenu {
    def this(_anchor: Submenu) = this()
    
    /* private */ var _anchor: Any = js.native
    
    def anchor: Submenu = js.native
    
    /* private */ var setBaseMenu: Any = js.native
    
    def toJson(): Type = js.native
  }
  /* static members */
  object SubMenu {
    
    @JSImport("mj-context-menu/js/sub_menu", "SubMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(factory: ParserFactory, param1: Items, anchor: Submenu): SubMenu = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[SubMenu]
  }
}
