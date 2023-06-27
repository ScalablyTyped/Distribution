package typings.mjContextMenu

import typings.mjContextMenu.anon.Content
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsAbstractVariableItemMod.AbstractVariableItem
import typings.mjContextMenu.cjsMenuMod.Menu
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsItemRadioMod {
  
  @JSImport("mj-context-menu/cjs/item_radio", "Radio")
  @js.native
  open class Radio protected () extends AbstractVariableItem[String] {
    def this(menu: Menu, content: String, variable: String) = this()
    def this(menu: Menu, content: String, variable: String, id: String) = this()
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Radio {
    
    @JSImport("mj-context-menu/cjs/item_radio", "Radio")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Content, menu: Menu): Radio = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Radio]
  }
}
