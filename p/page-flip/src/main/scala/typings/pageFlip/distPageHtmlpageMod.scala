package typings.pageFlip

import typings.pageFlip.distPagePageMod.Page
import typings.pageFlip.distPagePageMod.PageDensity
import typings.pageFlip.distRenderRenderMod.Render
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPageHtmlpageMod {
  
  @JSImport("page-flip/dist/Page/HTMLPage", "HTMLPage")
  @js.native
  open class HTMLPage protected () extends Page {
    def this(render: Render, element: HTMLElement, density: PageDensity) = this()
    
    /* private */ var copiedElement: Any = js.native
    
    /* private */ var drawHard: Any = js.native
    
    /* private */ var drawSoft: Any = js.native
    
    /* private */ val element: Any = js.native
    
    def getElement(): HTMLElement = js.native
    
    /* private */ var isLoad: Any = js.native
    
    /* private */ var temporaryCopy: Any = js.native
  }
}
