package typings.pageFlip

import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.settingsMod.FlipSetting
import typings.pageFlip.uIMod.UI
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmluiMod {
  
  @JSImport("page-flip/dist/UI/HTMLUI", "HTMLUI")
  @js.native
  open class HTMLUI protected () extends UI {
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting, items: js.Array[HTMLElement]) = this()
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting, items: NodeListOf[HTMLElement]) = this()
    
    def updateItems(items: js.Array[HTMLElement]): Unit = js.native
    /**
      * Update page list from HTMLElements
      */
    def updateItems(items: NodeListOf[HTMLElement]): Unit = js.native
  }
}
