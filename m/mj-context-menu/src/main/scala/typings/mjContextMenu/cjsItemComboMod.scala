package typings.mjContextMenu

import typings.mjContextMenu.anon.Content
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsAbstractVariableItemMod.AbstractVariableItem
import typings.mjContextMenu.cjsMenuMod.Menu
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsItemComboMod {
  
  @JSImport("mj-context-menu/cjs/item_combo", "Combo")
  @js.native
  open class Combo protected () extends AbstractVariableItem[String] {
    def this(menu: Menu, content: String, variable: String) = this()
    def this(menu: Menu, content: String, variable: String, id: String) = this()
    
    /* private */ var input: Any = js.native
    
    /* private */ var inputEvent: Any = js.native
    
    def inputKey(_event: KeyboardEvent): Unit = js.native
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Combo {
    
    @JSImport("mj-context-menu/cjs/item_combo", "Combo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Content, menu: Menu): Combo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Combo]
  }
}
