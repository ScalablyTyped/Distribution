package typings.pageFlip

import typings.pageFlip.anon.PartialFlipSetting
import typings.pageFlip.distBasicTypesMod.PageRect
import typings.pageFlip.distBasicTypesMod.Point
import typings.pageFlip.distCollectionPageCollectionMod.PageCollection
import typings.pageFlip.distEventEventObjectMod.EventObject
import typings.pageFlip.distFlipFlipMod.Flip
import typings.pageFlip.distFlipFlipMod.FlipCorner
import typings.pageFlip.distFlipFlipMod.FlippingState
import typings.pageFlip.distPagePageMod.Page
import typings.pageFlip.distRenderRenderMod.Orientation
import typings.pageFlip.distRenderRenderMod.Render
import typings.pageFlip.distSettingsMod.FlipSetting
import typings.pageFlip.distUIUIMod.UI
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPageFlipMod {
  
  @JSImport("page-flip/dist/PageFlip", "PageFlip")
  @js.native
  open class PageFlip protected () extends EventObject {
    /**
      * Create a new PageFlip instance
      */
    def this(inBlock: HTMLElement, setting: PartialFlipSetting) = this()
    
    /* private */ val block: Any = js.native
    
    /**
      * Destructor. Remove a root HTML element and all event handlers
      */
    def destroy(): Unit = js.native
    
    /**
      * Turn to the specified page number (with animation)
      */
    def flip(page: Double): Unit = js.native
    def flip(page: Double, corner: FlipCorner): Unit = js.native
    
    /* private */ var flipController: Any = js.native
    
    /**
      * Turn to the next page (with animation)
      */
    def flipNext(): Unit = js.native
    def flipNext(corner: FlipCorner): Unit = js.native
    
    /**
      * Turn to the prev page (with animation)
      */
    def flipPrev(): Unit = js.native
    def flipPrev(corner: FlipCorner): Unit = js.native
    
    /**
      * Get current book sizes and position
      */
    def getBoundsRect(): PageRect = js.native
    
    /**
      * Get the index of the current page in the page list (starts at 0)
      */
    def getCurrentPageIndex(): Double = js.native
    
    /**
      * Get current object responsible for flipping
      */
    def getFlipController(): Flip = js.native
    
    /**
      * Get current page orientation
      */
    def getOrientation(): Orientation = js.native
    
    /**
      * Get page from collection by number
      */
    def getPage(pageIndex: Double): Page = js.native
    
    /**
      * Get page collection
      */
    def getPageCollection(): PageCollection = js.native
    
    /**
      * Get the total number of pages in a book
      */
    def getPageCount(): Double = js.native
    
    /**
      * Get the current rendering object
      */
    def getRender(): Render = js.native
    
    /**
      * Get configuration object
      */
    def getSettings(): FlipSetting = js.native
    
    /**
      * Get current flipping state
      */
    def getState(): FlippingState = js.native
    
    /**
      * Get UI object
      */
    def getUI(): UI = js.native
    
    /* private */ var isUserMove: Any = js.native
    
    /* private */ var isUserTouch: Any = js.native
    
    def loadFromHTML(items: js.Array[HTMLElement]): Unit = js.native
    /**
      * Load pages from HTML elements on the HTML mode
      */
    def loadFromHTML(items: NodeListOf[HTMLElement]): Unit = js.native
    
    /**
      * Load pages from images on the Canvas mode
      */
    def loadFromImages(imagesHref: js.Array[String]): Unit = js.native
    
    /* private */ var mousePosition: Any = js.native
    
    /* private */ var pages: Any = js.native
    
    /* private */ var render: Any = js.native
    
    /* private */ val setting: Any = js.native
    
    /**
      * Start page turning. Called when a user clicks or touches
      */
    def startUserTouch(pos: Point): Unit = js.native
    
    /**
      * Turn to the next page (without animation)
      */
    def turnToNextPage(): Unit = js.native
    
    /**
      * Turn to the specified page number (without animation)
      */
    def turnToPage(page: Double): Unit = js.native
    
    /**
      * Turn to the previous page (without animation)
      */
    def turnToPrevPage(): Unit = js.native
    
    /* private */ var ui: Any = js.native
    
    /**
      * Update the render area. Re-show current page.
      */
    def update(): Unit = js.native
    
    def updateFromHtml(items: js.Array[HTMLElement]): Unit = js.native
    /**
      * Update current pages from HTML
      */
    def updateFromHtml(items: NodeListOf[HTMLElement]): Unit = js.native
    
    /**
      * Update current pages from images
      */
    def updateFromImages(imagesHref: js.Array[String]): Unit = js.native
    
    /**
      * Call a page orientation change event trigger. Update UI and rendering area
      */
    def updateOrientation(newOrientation: Orientation): Unit = js.native
    
    /**
      * Call a page number change event trigger
      */
    def updatePageIndex(newPage: Double): Unit = js.native
    
    /**
      * Call a state change event trigger
      */
    def updateState(newState: FlippingState): Unit = js.native
    
    /**
      * Called when a finger / mouse moves
      */
    def userMove(pos: Point, isTouch: Boolean): Unit = js.native
    
    /**
      * Сalled when the user has stopped touching
      */
    def userStop(pos: Point): Unit = js.native
    def userStop(pos: Point, isSwipe: Boolean): Unit = js.native
  }
}
