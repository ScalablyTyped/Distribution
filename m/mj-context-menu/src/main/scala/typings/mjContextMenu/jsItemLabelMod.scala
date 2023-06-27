package typings.mjContextMenu

import typings.mjContextMenu.anon.ContentId
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.jsAbstractItemMod.AbstractItem
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsItemLabelMod {
  
  @JSImport("mj-context-menu/js/item_label", "Label")
  @js.native
  open class Label protected () extends AbstractItem {
    def this(menu: Menu, content: String) = this()
    def this(menu: Menu, content: String, id: String) = this()
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Label {
    
    @JSImport("mj-context-menu/js/item_label", "Label")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: ContentId, menu: Menu): Label = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Label]
  }
}
