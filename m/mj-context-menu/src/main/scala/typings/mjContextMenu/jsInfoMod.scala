package typings.mjContextMenu

import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsHtmlClassesMod.HtmlClass
import typings.mjContextMenu.jsAbstractPostableMod.AbstractPostable
import typings.mjContextMenu.jsContextMenuMod.ContextMenu
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsInfoMod {
  
  @JSImport("mj-context-menu/js/info", "Info")
  @js.native
  open class Info protected () extends AbstractPostable {
    def this(title: String, content: js.Function0[String], signature: String) = this()
    
    def attachMenu(menu: ContextMenu): Unit = js.native
    
    /* protected */ @JSName("className")
    var className_Info: HtmlClass = js.native
    
    /* private */ var close: Any = js.native
    
    /* private */ var content: Any = js.native
    
    /* protected */ var contentDiv: HTMLElement = js.native
    
    /* private */ var generateClose: Any = js.native
    
    /* protected */ def generateContent(): HTMLElement = js.native
    
    /* private */ var generateSignature: Any = js.native
    
    /* private */ var generateTitle: Any = js.native
    
    var menu: ContextMenu = js.native
    
    /* private */ var signature: Any = js.native
    
    /* private */ var title: Any = js.native
    
    def toJson(): Type = js.native
  }
}
