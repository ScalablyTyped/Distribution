package typings.openfin

import typings.jquery.JQuery.DragEventBase
import typings.openfin.GoldenLayout.ComponentConfig
import typings.openfin.GoldenLayout.Config
import typings.openfin.GoldenLayout.Container
import typings.openfin.GoldenLayout.ContentItem
import typings.openfin.GoldenLayout.ItemConfig
import typings.openfin.GoldenLayout.Tab
import typings.openfin.anon.Height
import typings.openfin.anon.NameString
import typings.openfin.anon.PartialBounds
import typings.openfin.anon.ScreenX
import typings.openfin.anon.Uuid
import typings.openfin.identityMod.Identity
import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.resizableViewMod.ViewState
import typings.openfin.shapesMod.Bounds
import typings.openfin.shapesPlatformMod.Snapshot
import typings.openfin.v2MainMod.View
import typings.openfin.windowOptionsMod.WindowOptions
import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Error
import typings.std.HTMLElement
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("openfin/_v2/api/platform/utils", "addComponentToContentItem")
  @js.native
  def addComponentToContentItem(component: ViewComponent, target: ItemConfig): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "buildFailedEventPayload")
  @js.native
  def buildFailedEventPayload(response: String, identity: Identity): typings.openfin.anon.Identity = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "createComponent")
  @js.native
  def createComponent(componentState: NameString): ComponentConfig = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "debounce")
  @js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, delay: Double, resizing: Boolean): js.Function1[/* args */ Parameters[T], Unit] = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "delay")
  @js.native
  def delay(delay: Double): js.Promise[_] = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "emitLocalEvent")
  @js.native
  def emitLocalEvent(event: String, identity: Identity, container: HTMLElement): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "generateLayoutContent")
  @js.native
  def generateLayoutContent(componentState: js.Any): Config = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "generatePresetLayoutContent")
  @js.native
  def generatePresetLayoutContent(components: js.Array[ViewComponent], `type`: LayoutPresetTypes): Config = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "getComponentBounds")
  @js.native
  def getComponentBounds(bv: ViewComponent): DOMRect = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "getOutOfBoundsWindows")
  @js.native
  def getOutOfBoundsWindows(snapshot: Snapshot, monitorInfo: MonitorInfo): js.Promise[js.Array[WindowOptions]] = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "getOutOfWindowDropBounds")
  @js.native
  def getOutOfWindowDropBounds(e: ScreenX, container: HTMLElement, dimensions: Height): PartialBounds = js.native
  
  object getPresetLayoutFunction {
    
    @JSImport("openfin/_v2/api/platform/utils", "getPresetLayoutFunction.columns")
    @js.native
    def columns(components: js.Array[ViewComponent]): Config = js.native
    
    @JSImport("openfin/_v2/api/platform/utils", "getPresetLayoutFunction.grid")
    @js.native
    def grid(components: js.Array[ViewComponent]): Config = js.native
    
    @JSImport("openfin/_v2/api/platform/utils", "getPresetLayoutFunction.rows")
    @js.native
    def rows(components: js.Array[ViewComponent]): Config = js.native
    
    @JSImport("openfin/_v2/api/platform/utils", "getPresetLayoutFunction.tabs")
    @js.native
    def tabs(components: js.Array[ViewComponent]): Config = js.native
  }
  
  @JSImport("openfin/_v2/api/platform/utils", "getSourceIdentity")
  @js.native
  def getSourceIdentity(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement]): Uuid = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "handleRenderError")
  @js.native
  def handleRenderError(component: ViewComponent, e: Error): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "isSameApp")
  @js.native
  def isSameApp(
    e: DragEventBase[HTMLElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement],
    currentWindow: Identity
  ): Boolean = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "isSameWindow")
  @js.native
  def isSameWindow(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement], currentWindow: Identity): Boolean = js.native
  
  object mock {
    
    @JSImport("openfin/_v2/api/platform/utils", "mock.on")
    @js.native
    def on(): Unit = js.native
  }
  
  @JSImport("openfin/_v2/api/platform/utils", "promisifyViewLoadEvents")
  @js.native
  def promisifyViewLoadEvents(view: View, windowIdentity: Identity): js.Promise[LayoutEventPayload] = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "setContainerMessage")
  @js.native
  def setContainerMessage(container: Container, message: String): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "setFallbackBodyAndTitle")
  @js.native
  def setFallbackBodyAndTitle(viewComponent: ViewComponent): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "setTabTitle")
  @js.native
  def setTabTitle(tab: Tab, title: String): Unit = js.native
  
  @JSImport("openfin/_v2/api/platform/utils", "setViewBoundsByRect")
  @js.native
  def setViewBoundsByRect(rect: Bounds, ofView: View): js.Promise[View] = js.native
  @JSImport("openfin/_v2/api/platform/utils", "setViewBoundsByRect")
  @js.native
  def setViewBoundsByRect(rect: ClientRect, ofView: View): js.Promise[View] = js.native
  @JSImport("openfin/_v2/api/platform/utils", "setViewBoundsByRect")
  @js.native
  def setViewBoundsByRect(rect: DOMRect, ofView: View): js.Promise[View] = js.native
  
  @js.native
  trait LayoutEventPayload extends StObject {
    
    var identity: Identity = js.native
    
    var reason: js.UndefOr[String] = js.native
    
    var success: Boolean = js.native
  }
  object LayoutEventPayload {
    
    @scala.inline
    def apply(identity: Identity, success: Boolean): LayoutEventPayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutEventPayload]
    }
    
    @scala.inline
    implicit class LayoutEventPayloadMutableBuilder[Self <: LayoutEventPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.openfinStrings.columns
    - typings.openfin.openfinStrings.grid
    - typings.openfin.openfinStrings.rows
    - typings.openfin.openfinStrings.tabs
  */
  trait LayoutPresetTypes extends StObject
  object LayoutPresetTypes {
    
    @scala.inline
    def columns: typings.openfin.openfinStrings.columns = "columns".asInstanceOf[typings.openfin.openfinStrings.columns]
    
    @scala.inline
    def grid: typings.openfin.openfinStrings.grid = "grid".asInstanceOf[typings.openfin.openfinStrings.grid]
    
    @scala.inline
    def rows: typings.openfin.openfinStrings.rows = "rows".asInstanceOf[typings.openfin.openfinStrings.rows]
    
    @scala.inline
    def tabs: typings.openfin.openfinStrings.tabs = "tabs".asInstanceOf[typings.openfin.openfinStrings.tabs]
  }
  
  @js.native
  trait ViewComponent extends ContentItem {
    
    var componentState: ViewState = js.native
  }
}
