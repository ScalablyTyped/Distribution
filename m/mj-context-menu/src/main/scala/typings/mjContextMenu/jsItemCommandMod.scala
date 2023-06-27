package typings.mjContextMenu

import typings.mjContextMenu.anon.Action
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.jsAbstractItemMod.AbstractItem
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsItemCommandMod {
  
  @JSImport("mj-context-menu/js/item_command", "Command")
  @js.native
  open class Command protected () extends AbstractItem {
    def this(menu: Menu, content: String, command: js.Function1[/* node */ HTMLElement, Unit]) = this()
    def this(menu: Menu, content: String, command: js.Function1[/* node */ HTMLElement, Unit], id: String) = this()
    
    /* private */ var command: Any = js.native
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Command {
    
    @JSImport("mj-context-menu/js/item_command", "Command")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Action, menu: Menu): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Command]
  }
}
