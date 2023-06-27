package typings.mjContextMenu

import typings.mjContextMenu.cjsHtmlClassesMod.HtmlClass
import typings.mjContextMenu.jsAbstractPostableMod.AbstractPostable
import typings.mjContextMenu.jsItemMod.Item
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsVariablePoolMod.VariablePool
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAbstractMenuMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/js/abstract_menu", "AbstractMenu")
  @js.native
  open class AbstractMenu ()
    extends AbstractPostable
       with Menu {
    
    /* private */ var _baseMenu: Any = js.native
    
    /* private */ var _focused: Any = js.native
    
    /* protected */ var _items: js.Array[Item] = js.native
    
    @JSName("baseMenu")
    def baseMenu_MAbstractMenu: Menu = js.native
    
    /* protected */ @JSName("className")
    var className_AbstractMenu: HtmlClass = js.native
    
    /* CompleteClass */
    override def click(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def down(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def escape(event: KeyboardEvent): Unit = js.native
    
    @JSName("focused")
    def focused_MAbstractMenu: Item = js.native
    
    @JSName("items")
    def items_MAbstractMenu: js.Array[Item] = js.native
    
    /* CompleteClass */
    override def keydown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def left(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def mousedown(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseout(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseover(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def mouseup(event: MouseEvent): Unit = js.native
    
    @JSName("pool")
    def pool_MAbstractMenu: VariablePool[String | Boolean] = js.native
    
    /* CompleteClass */
    override def right(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def space(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def up(event: KeyboardEvent): Unit = js.native
    
    /* protected */ var variablePool: VariablePool[String | Boolean] = js.native
  }
}
