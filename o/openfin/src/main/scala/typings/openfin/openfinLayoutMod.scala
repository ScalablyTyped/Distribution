package typings.openfin

import typings.openfin.GoldenLayout.Config
import typings.openfin.GoldenLayout.ContentItem
import typings.openfin.GoldenLayout.EventEmitter
import typings.openfin.GoldenLayout.Tab
import typings.openfin.anon.Height
import typings.openfin.anon.Name
import typings.openfin.anon.NameAny
import typings.openfin.anon.ScreenX
import typings.openfin.openfinStrings.`view-detached`
import typings.openfin.openfinStrings.window
import typings.openfin.platformPlatformMod.Platform
import typings.openfin.resizableViewMod.ResizableView
import typings.openfin.resizableViewMod.ViewState
import typings.openfin.utilsMod.ViewComponent
import typings.openfin.v2MainMod.ChannelClient
import typings.openfin.v2MainMod.Fin
import typings.openfin.v2MainMod.View
import typings.openfin.v2MainMod.Window
import typings.openfin.windowMod.ViewDetached
import typings.resizeObserverBrowser.ResizeObserver
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openfinLayoutMod {
  
  @JSImport("openfin/_v2/api/platform/openfin-layout", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with LayoutManager {
    def this(fin: Fin) = this()
  }
  
  @js.native
  trait LayoutManager extends StObject {
    
    def addView(viewConfig: ViewState): js.Promise[View] = js.native
    
    def attachView(rView: ResizableView, bv: ViewComponent): js.Promise[View] = js.native
    
    var client: ChannelClient = js.native
    
    def closeView(viewConfig: js.Any): js.Promise[Unit] = js.native
    
    var container: HTMLElement = js.native
    
    var containerResizeObserver: ResizeObserver = js.native
    
    def createAndAttachView(bv: ViewComponent): js.Promise[View] = js.native
    
    def createChannelConnections(): js.Promise[Unit] = js.native
    
    def createLayout(layout: Config, container: HTMLElement): Unit = js.native
    
    def createResizableView(bv: ViewComponent): ResizableView = js.native
    
    def dispatchLayoutEvent(action: String): js.Promise[Unit] = js.native
    def dispatchLayoutEvent(action: String, payload: js.Object): js.Promise[Unit] = js.native
    
    var dragProxy: js.Any = js.native
    
    var fin: js.Any = js.native
    
    def getOfViewFromComponentState(componentState: NameAny): View = js.native
    
    def getViewComponent(identity: Name): ViewComponent = js.native
    
    def getViewComponents(): js.Array[ViewComponent] = js.native
    
    def handleOutOfWindowDrop(e: ScreenX, parentTab: Tab, dimensions: Height): js.Promise[Unit] = js.native
    
    def hideAllViews(): Unit = js.native
    
    def hideHighlight(): Unit = js.native
    
    def initManager(): js.Promise[Unit] = js.native
    
    def initializeLayoutViews(): js.Promise[Unit] = js.native
    
    var isDragging: Boolean = js.native
    
    var layout: typings.openfin.GoldenLayout.GoldenLayout = js.native
    
    var ofWindow: Window = js.native
    
    def onCloseTabButtonClick(tab: Tab): js.Promise[Unit] = js.native
    
    def onItemCreated(item: ContentItem): js.Promise[Unit] = js.native
    
    def onMaximizeToggleClick(): Unit = js.native
    
    def onPopoutClick(stack: ContentItem): Unit = js.native
    
    def onStackCloseClick(stack: ContentItem): Unit = js.native
    
    def onStackCreated(stack: ContentItem): Unit = js.native
    
    def onTabCreated(tab: Tab): Unit = js.native
    
    def onTabDrag(dragListener: EventEmitter, parentTab: Tab): js.Promise[Unit] = js.native
    
    def onViewDetached(event: ViewDetached[window, `view-detached`]): js.Promise[Unit] = js.native
    
    var platform: Platform = js.native
    
    def registerViewComponent(): Unit = js.native
    
    def removeView(viewConfig: js.Any): js.Promise[View] = js.native
    
    def replaceCloseTabButton(tab: Tab): Unit = js.native
    
    def replaceLayout(layout: Config, container: HTMLElement): js.Promise[Unit] = js.native
    
    var resizing: Boolean = js.native
    
    def setBackgroundImage(viewComponent: ViewComponent): js.Promise[Unit] = js.native
    
    def setBackgroundImages(): js.Promise[Unit] = js.native
    
    def setContainer(container: HTMLElement): Unit = js.native
    
    def setupDragDropRegions(): Unit = js.native
    
    def setupLayoutListeners(): Unit = js.native
    
    def setupResizeObservers(): Unit = js.native
    
    def setupViewEvents(view: View, viewComponent: ViewComponent): Unit = js.native
    
    def setupWindowListeners(): js.Promise[Unit] = js.native
    
    def showAllViews(): js.Promise[js.Array[js.Any]] = js.native
    def showAllViews(resize: Boolean): js.Promise[js.Array[js.Any]] = js.native
    
    var showBackgroundImages: Boolean = js.native
    
    def updateButtonDisplay(): Unit = js.native
    
    var viewsResizeObserver: ResizeObserver = js.native
  }
}
