package typings.mjContextMenu

import org.scalablytyped.runtime.StringDictionary
import typings.mjContextMenu.jsAbstractNavigatableMod.AbstractNavigatable
import typings.mjContextMenu.jsElementMod.Element
import typings.mjContextMenu.jsHtmlClassesMod.HtmlClass
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMenuElementMod {
  
  /* note: abstract class */ @JSImport("mj-context-menu/js/menu_element", "MenuElement")
  @js.native
  open class MenuElement ()
    extends AbstractNavigatable
       with Element {
    
    /* private */ var _html: Any = js.native
    
    def addAttributes(attributes: StringDictionary[String]): Unit = js.native
    
    /* protected */ var className: HtmlClass = js.native
    
    def focus(): Unit = js.native
    
    /* CompleteClass */
    override def generateHtml(): Unit = js.native
    
    /* CompleteClass */
    var html: HTMLElement = js.native
    @JSName("html")
    def html_MMenuElement: HTMLElement = js.native
    
    /* protected */ var role: String = js.native
    
    def unfocus(): Unit = js.native
  }
}
