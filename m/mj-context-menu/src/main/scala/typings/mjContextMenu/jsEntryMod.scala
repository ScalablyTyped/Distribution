package typings.mjContextMenu

import typings.mjContextMenu.jsMenuMod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsEntryMod {
  
  trait Entry extends StObject {
    
    def hide(): Unit
    
    def isHidden(): Boolean
    
    var menu: Menu
    
    def show(): Unit
    
    var `type`: String
  }
  object Entry {
    
    inline def apply(hide: () => Unit, isHidden: () => Boolean, menu: Menu, show: () => Unit, `type`: String): Entry = {
      val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), menu = menu.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
      
      inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
