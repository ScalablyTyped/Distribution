package typings.mjContextMenu

import typings.mjContextMenu.jsElementMod.Element
import typings.mjContextMenu.jsEntryMod.Entry
import typings.mjContextMenu.jsMenuMod.Menu
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsItemMod {
  
  trait Item
    extends StObject
       with Entry
       with Element {
    
    var content: String
    
    def disable(): Unit
    
    def enable(): Unit
    
    def focus(): Unit
    
    var id: String
    
    def press(): Unit
    
    def unfocus(): Unit
  }
  object Item {
    
    inline def apply(
      content: String,
      disable: () => Unit,
      enable: () => Unit,
      focus: () => Unit,
      generateHtml: () => Unit,
      hide: () => Unit,
      html: HTMLElement,
      id: String,
      isHidden: () => Boolean,
      menu: Menu,
      press: () => Unit,
      show: () => Unit,
      `type`: String,
      unfocus: () => Unit
    ): Item = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), focus = js.Any.fromFunction0(focus), generateHtml = js.Any.fromFunction0(generateHtml), hide = js.Any.fromFunction0(hide), html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isHidden = js.Any.fromFunction0(isHidden), menu = menu.asInstanceOf[js.Any], press = js.Any.fromFunction0(press), show = js.Any.fromFunction0(show), unfocus = js.Any.fromFunction0(unfocus))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPress(value: () => Unit): Self = StObject.set(x, "press", js.Any.fromFunction0(value))
      
      inline def setUnfocus(value: () => Unit): Self = StObject.set(x, "unfocus", js.Any.fromFunction0(value))
    }
  }
}
