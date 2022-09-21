package typings.pageFlip

import typings.pageFlip.pageCollectionMod.PageCollection
import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.renderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePageCollectionMod {
  
  @JSImport("page-flip/dist/Collection/ImagePageCollection", "ImagePageCollection")
  @js.native
  open class ImagePageCollection protected () extends PageCollection {
    def this(app: PageFlip, render: Render, imagesHref: js.Array[String]) = this()
    
    /* private */ val imagesHref: Any = js.native
  }
}
