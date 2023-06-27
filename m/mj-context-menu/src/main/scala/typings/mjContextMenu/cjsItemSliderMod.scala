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

object cjsItemSliderMod {
  
  @JSImport("mj-context-menu/cjs/item_slider", "Slider")
  @js.native
  open class Slider protected () extends AbstractVariableItem[String] {
    def this(menu: Menu, content: String, variable: String) = this()
    def this(menu: Menu, content: String, variable: String, id: String) = this()
    
    /* private */ var input: Any = js.native
    
    /* private */ var inputEvent: Any = js.native
    
    def inputKey(_event: KeyboardEvent): Unit = js.native
    
    /* private */ var labelId: Any = js.native
    
    /* private */ var labelSpan: Any = js.native
    
    def toJson(): Type = js.native
    
    /* private */ var valueId: Any = js.native
    
    /* private */ var valueSpan: Any = js.native
  }
  /* static members */
  object Slider {
    
    @JSImport("mj-context-menu/cjs/item_slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Content, menu: Menu): Slider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Slider]
  }
}
