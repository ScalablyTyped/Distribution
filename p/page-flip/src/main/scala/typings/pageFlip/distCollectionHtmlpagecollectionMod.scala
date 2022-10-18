package typings.pageFlip

import typings.pageFlip.distCollectionPageCollectionMod.PageCollection
import typings.pageFlip.distPageFlipMod.PageFlip
import typings.pageFlip.distRenderRenderMod.Render
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionHtmlpagecollectionMod {
  
  @JSImport("page-flip/dist/Collection/HTMLPageCollection", "HTMLPageCollection")
  @js.native
  open class HTMLPageCollection protected () extends PageCollection {
    def this(app: PageFlip, render: Render, element: HTMLElement, items: js.Array[HTMLElement]) = this()
    def this(app: PageFlip, render: Render, element: HTMLElement, items: NodeListOf[HTMLElement]) = this()
    
    /* private */ val element: Any = js.native
    
    /* private */ val pagesElement: Any = js.native
  }
}
