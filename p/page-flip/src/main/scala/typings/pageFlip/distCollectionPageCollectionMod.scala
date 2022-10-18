package typings.pageFlip

import typings.pageFlip.distFlipFlipMod.FlipDirection
import typings.pageFlip.distPageFlipMod.PageFlip
import typings.pageFlip.distPagePageMod.Page
import typings.pageFlip.distRenderRenderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionPageCollectionMod {
  
  /* note: abstract class */ @JSImport("page-flip/dist/Collection/PageCollection", "PageCollection")
  @js.native
  open class PageCollection protected () extends StObject {
    /* protected */ def this(app: PageFlip, render: Render) = this()
    
    /* protected */ val app: PageFlip = js.native
    
    /**
      * Split the book on the two-page spread in landscape mode and one-page spread in portrait mode
      */
    /* protected */ def createSpread(): Unit = js.native
    
    /** Index of the current page in list */
    /* protected */ var currentPageIndex: Double = js.native
    
    /** Number of the current spread in book */
    /* protected */ var currentSpreadIndex: Double = js.native
    
    /**
      * Clear pages list
      */
    def destroy(): Unit = js.native
    
    /**
      * Get Next page at the time of flipping
      */
    def getBottomPage(direction: FlipDirection): Page = js.native
    
    /**
      * Get the number of the current spread in book
      */
    def getCurrentPageIndex(): Double = js.native
    
    /**
      * Index of the current page in list
      */
    def getCurrentSpreadIndex(): Double = js.native
    
    /**
      * Get flipping page depending on the direction
      */
    def getFlippingPage(direction: FlipDirection): Page = js.native
    
    /**
      * Get page by index
      */
    def getPage(pageIndex: Double): Page = js.native
    
    /**
      * Get the total number of pages
      */
    def getPageCount(): Double = js.native
    
    /**
      * Get the pages list
      */
    def getPages(): js.Array[Page] = js.native
    
    /**
      * Get spread by mode (portrait or landscape)
      */
    /* protected */ def getSpread(): js.Array[NumberArray] = js.native
    
    /**
      * Get spread index by page number
      */
    def getSpreadIndexByPage(pageNum: Double): Double = js.native
    
    /* protected */ val isShowCover: Boolean = js.native
    
    /**  Two-page spread in landscape mode */
    /* protected */ var landscapeSpread: js.Array[NumberArray] = js.native
    
    /**
      * Load pages
      */
    def load(): Unit = js.native
    
    /**
      * Get the next page from the specified
      */
    def nextBy(current: Page): Page = js.native
    
    /** Pages List */
    /* protected */ var pages: js.Array[Page] = js.native
    
    /**  One-page spread in portrait mode */
    /* protected */ var portraitSpread: js.Array[NumberArray] = js.native
    
    /**
      * Get previous page from specified
      */
    def prevBy(current: Page): Page = js.native
    
    /* protected */ val render: Render = js.native
    
    /**
      * Set new spread index as current
      */
    def setCurrentSpreadIndex(newIndex: Double): Unit = js.native
    
    /**
      * Show specified page
      */
    def show(): Unit = js.native
    def show(pageNum: Double): Unit = js.native
    
    /**
      * Show next spread
      */
    def showNext(): Unit = js.native
    
    /**
      * Show prev spread
      */
    def showPrev(): Unit = js.native
    
    /**
      * Show current spread
      */
    /* private */ var showSpread: Any = js.native
  }
  
  type NumberArray = js.Array[Double]
}
