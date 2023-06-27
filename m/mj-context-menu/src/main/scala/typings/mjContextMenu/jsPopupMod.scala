package typings.mjContextMenu

import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.jsAbstractPostableMod.AbstractPostable
import typings.mjContextMenu.jsContextMenuMod.ContextMenu
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPopupMod {
  
  @JSImport("mj-context-menu/js/popup", "Popup")
  @js.native
  open class Popup protected () extends AbstractPostable {
    def this(title: String, content: js.Function1[/* node */ HTMLElement, String]) = this()
    
    /* private */ var active: Any = js.native
    
    def attachMenu(menu: ContextMenu): Unit = js.native
    
    /* private */ var content: Any = js.native
    
    /* private */ var generateContent: Any = js.native
    
    /* private */ var localSettings: Any = js.native
    
    /* private */ var menu: Any = js.native
    
    /* private */ var mobileFlag: Any = js.native
    
    /* private */ var resize: Any = js.native
    
    /* private */ var title: Any = js.native
    
    def toJson(): Type = js.native
    
    /* private */ var window: Any = js.native
    
    /* private */ var windowList: Any = js.native
  }
  /* static members */
  object Popup {
    
    @JSImport("mj-context-menu/js/popup", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/js/popup", "Popup.popupSettings")
    @js.native
    def popupSettings: Any = js.native
    inline def popupSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popupSettings")(x.asInstanceOf[js.Any])
  }
}
