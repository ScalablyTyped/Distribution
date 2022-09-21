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
import typings.std.HTMLElement
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("openfin/_v2/api/platform/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addComponentToContentItem(component: ViewComponent, target: ItemConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addComponentToContentItem")(component.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildFailedEventPayload(response: String, identity: Identity): typings.openfin.anon.Identity = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFailedEventPayload")(response.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[typings.openfin.anon.Identity]
  
  inline def createComponent(componentState: NameString): ComponentConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(componentState.asInstanceOf[js.Any]).asInstanceOf[ComponentConfig]
  
  inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T, delay: Double, resizing: Boolean): js.Function1[/* args */ Parameters[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], resizing.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], Unit]]
  
  inline def delay(delay: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def emitLocalEvent(event: String, identity: Identity, container: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitLocalEvent")(event.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateLayoutContent(componentState: Any): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLayoutContent")(componentState.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  inline def generatePresetLayoutContent(components: js.Array[ViewComponent], `type`: LayoutPresetTypes): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePresetLayoutContent")(components.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Config]
  
  inline def getComponentBounds(bv: ViewComponent): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentBounds")(bv.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  
  inline def getOutOfBoundsWindows(snapshot: Snapshot, monitorInfo: MonitorInfo): js.Promise[js.Array[WindowOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutOfBoundsWindows")(snapshot.asInstanceOf[js.Any], monitorInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[WindowOptions]]]
  
  inline def getOutOfWindowDropBounds(e: ScreenX, container: HTMLElement, dimensions: Height): PartialBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutOfWindowDropBounds")(e.asInstanceOf[js.Any], container.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[PartialBounds]
  
  object getPresetLayoutFunction {
    
    @JSImport("openfin/_v2/api/platform/utils", "getPresetLayoutFunction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def columns(components: js.Array[ViewComponent]): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("columns")(components.asInstanceOf[js.Any]).asInstanceOf[Config]
    
    inline def grid(components: js.Array[ViewComponent]): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("grid")(components.asInstanceOf[js.Any]).asInstanceOf[Config]
    
    inline def rows(components: js.Array[ViewComponent]): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("rows")(components.asInstanceOf[js.Any]).asInstanceOf[Config]
    
    inline def tabs(components: js.Array[ViewComponent]): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("tabs")(components.asInstanceOf[js.Any]).asInstanceOf[Config]
  }
  
  inline def getSourceIdentity(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement]): Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceIdentity")(e.asInstanceOf[js.Any]).asInstanceOf[Uuid]
  
  inline def handleRenderError(component: ViewComponent, e: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRenderError")(component.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isSameApp(e: DragEventBase[HTMLElement, Unit, HTMLElement, HTMLElement], currentWindow: Identity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameApp")(e.asInstanceOf[js.Any], currentWindow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameWindow(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement], currentWindow: Identity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameWindow")(e.asInstanceOf[js.Any], currentWindow.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object mock {
    
    @JSImport("openfin/_v2/api/platform/utils", "mock")
    @js.native
    val ^ : js.Any = js.native
    
    inline def on(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")().asInstanceOf[Unit]
  }
  
  inline def promisifyViewLoadEvents(view: View, windowIdentity: Identity): js.Promise[LayoutEventPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyViewLoadEvents")(view.asInstanceOf[js.Any], windowIdentity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LayoutEventPayload]]
  
  inline def setContainerMessage(container: Container, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContainerMessage")(container.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setFallbackBodyAndTitle(viewComponent: ViewComponent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFallbackBodyAndTitle")(viewComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTabTitle(tab: Tab, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTabTitle")(tab.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setViewBoundsByRect(rect: ClientRect | DOMRect, ofView: View): js.Promise[View] = (^.asInstanceOf[js.Dynamic].applyDynamic("setViewBoundsByRect")(rect.asInstanceOf[js.Any], ofView.asInstanceOf[js.Any])).asInstanceOf[js.Promise[View]]
  inline def setViewBoundsByRect(rect: Bounds, ofView: View): js.Promise[View] = (^.asInstanceOf[js.Dynamic].applyDynamic("setViewBoundsByRect")(rect.asInstanceOf[js.Any], ofView.asInstanceOf[js.Any])).asInstanceOf[js.Promise[View]]
  
  trait LayoutEventPayload extends StObject {
    
    var identity: Identity
    
    var reason: js.UndefOr[String] = js.undefined
    
    var success: Boolean
  }
  object LayoutEventPayload {
    
    inline def apply(identity: Identity, success: Boolean): LayoutEventPayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutEventPayload]
    }
    
    extension [Self <: LayoutEventPayload](x: Self) {
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
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
    
    inline def columns: typings.openfin.openfinStrings.columns = "columns".asInstanceOf[typings.openfin.openfinStrings.columns]
    
    inline def grid: typings.openfin.openfinStrings.grid = "grid".asInstanceOf[typings.openfin.openfinStrings.grid]
    
    inline def rows: typings.openfin.openfinStrings.rows = "rows".asInstanceOf[typings.openfin.openfinStrings.rows]
    
    inline def tabs: typings.openfin.openfinStrings.tabs = "tabs".asInstanceOf[typings.openfin.openfinStrings.tabs]
  }
  
  @js.native
  trait ViewComponent
    extends StObject
       with ContentItem {
    
    var componentState: ViewState = js.native
  }
}
