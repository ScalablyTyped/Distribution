package typings.openfin

import org.scalablytyped.runtime.Instantiable1
import typings.openfin.GoldenLayout.Config
import typings.openfin.GoldenLayout.Container
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
import typings.resizeObserverBrowser.ResizeObserverCallback
import typings.resizeObserverBrowser.global.ResizeObserver
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/openfin-layout", JSImport.Namespace)
@js.native
object openfinLayoutMod extends js.Object {
  @js.native
  class LayoutManager protected () extends js.Object {
    def this(fin: Fin) = this()
    var client: ChannelClient = js.native
    var container: HTMLElement = js.native
    var containerResizeObserver: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver] = js.native
    var dragProxy: js.Any = js.native
    var fin: js.Any = js.native
    var isDragging: Boolean = js.native
    var layout: typings.openfin.GoldenLayout.GoldenLayout = js.native
    var ofWindow: Window = js.native
    var platform: Platform = js.native
    var resizing: Boolean = js.native
    def addView(viewConfig: ViewState): js.Promise[View] = js.native
    def attachView(rView: ResizableView, bv: ViewComponent): js.Promise[View] = js.native
    def closeView(viewConfig: js.Any): js.Promise[Unit] = js.native
    def createAndAttachView(bv: ViewComponent): js.Promise[View] = js.native
    def createChannelConnections(): js.Promise[Unit] = js.native
    def createLayout(layout: Config, container: HTMLElement): Unit = js.native
    def createResizableView(bv: ViewComponent): ResizableView = js.native
    def dispatchLayoutEvent(action: String): js.Promise[Unit] = js.native
    def dispatchLayoutEvent(action: String, payload: js.Object): js.Promise[Unit] = js.native
    def getOfViewFromComponentState(componentState: NameAny): View = js.native
    def getViewComponent(identity: Name): ViewComponent = js.native
    def getViewComponents(): js.Array[ViewComponent] = js.native
    def handleOutOfWindowDrop(e: ScreenX, parentTab: Tab, dimensions: Height): js.Promise[Unit] = js.native
    def handleRenderError(component: ViewComponent, e: Error): Unit = js.native
    def hideAllViews(): Unit = js.native
    def hideHighlight(): Unit = js.native
    def initManager(): js.Promise[Unit] = js.native
    def initializeLayoutViews(): js.Promise[Unit] = js.native
    def onCloseTabButtonClick(tab: Tab): js.Promise[Unit] = js.native
    def onItemCreated(item: ContentItem): js.Promise[Unit] = js.native
    def onStackCreated(stack: ContentItem): Unit = js.native
    def onTabCreated(tab: Tab): Unit = js.native
    def onTabDrag(dragListener: EventEmitter, parentTab: Tab): js.Promise[Unit] = js.native
    def onViewDetached(e: ViewDetached[window, `view-detached`]): js.Promise[Unit] = js.native
    def registerViewComponent(): Unit = js.native
    def removeView(viewConfig: js.Any): js.Promise[View] = js.native
    def replaceCloseTabButton(tab: Tab): Unit = js.native
    def replaceLayout(layout: Config, container: HTMLElement): js.Promise[Unit] = js.native
    def setContainer(container: HTMLElement): Unit = js.native
    def setFallbackBodyAndTitle(viewComponent: ViewComponent): Unit = js.native
    def setTabBody(container: Container, message: String): Unit = js.native
    def setTabTitle(tab: Tab, title: String): js.Promise[Unit] = js.native
    def setupContainerResizeObserver(): Unit = js.native
    def setupDragDropRegions(): Unit = js.native
    def setupLayoutListeners(): Unit = js.native
    def setupViewEvents(view: View, viewComponent: ViewComponent): Unit = js.native
    def setupWindowListeners(): Unit = js.native
    def showAllViews(): js.Promise[js.Array[_]] = js.native
    def showAllViews(resize: Boolean): js.Promise[js.Array[_]] = js.native
    def updateButtonDisplay(): Unit = js.native
  }
  
}

