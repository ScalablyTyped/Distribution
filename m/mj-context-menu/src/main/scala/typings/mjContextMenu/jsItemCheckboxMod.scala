package typings.mjContextMenu

import typings.mjContextMenu.anon.Content
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.jsAbstractVariableItemMod.AbstractVariableItem
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsItemCheckboxMod {
  
  @JSImport("mj-context-menu/js/item_checkbox", "Checkbox")
  @js.native
  open class Checkbox protected () extends AbstractVariableItem[Boolean] {
    def this(menu: Menu, content: String, variable: String) = this()
    def this(menu: Menu, content: String, variable: String, id: String) = this()
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Checkbox {
    
    @JSImport("mj-context-menu/js/item_checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Content, menu: Menu): Checkbox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Checkbox]
  }
}
