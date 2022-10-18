package typings.openseadragon.mod

import typings.openseadragon.openseadragonStrings.`add-item-failed`
import typings.openseadragon.openseadragonStrings.`add-overlay`
import typings.openseadragon.openseadragonStrings.`animation-finish`
import typings.openseadragon.openseadragonStrings.`animation-start`
import typings.openseadragon.openseadragonStrings.`canvas-click`
import typings.openseadragon.openseadragonStrings.`canvas-contextmenu`
import typings.openseadragon.openseadragonStrings.`canvas-double-click`
import typings.openseadragon.openseadragonStrings.`canvas-drag-end`
import typings.openseadragon.openseadragonStrings.`canvas-drag`
import typings.openseadragon.openseadragonStrings.`canvas-enter`
import typings.openseadragon.openseadragonStrings.`canvas-exit`
import typings.openseadragon.openseadragonStrings.`canvas-key`
import typings.openseadragon.openseadragonStrings.`canvas-nonprimary-press`
import typings.openseadragon.openseadragonStrings.`canvas-nonprimary-release`
import typings.openseadragon.openseadragonStrings.`canvas-pinch`
import typings.openseadragon.openseadragonStrings.`canvas-press`
import typings.openseadragon.openseadragonStrings.`canvas-release`
import typings.openseadragon.openseadragonStrings.`canvas-scroll`
import typings.openseadragon.openseadragonStrings.`clear-overlay`
import typings.openseadragon.openseadragonStrings.`container-enter`
import typings.openseadragon.openseadragonStrings.`container-exit`
import typings.openseadragon.openseadragonStrings.`controls-enabled`
import typings.openseadragon.openseadragonStrings.`full-page`
import typings.openseadragon.openseadragonStrings.`full-screen`
import typings.openseadragon.openseadragonStrings.`mouse-enabled`
import typings.openseadragon.openseadragonStrings.`navigator-click`
import typings.openseadragon.openseadragonStrings.`navigator-drag`
import typings.openseadragon.openseadragonStrings.`navigator-scroll`
import typings.openseadragon.openseadragonStrings.`open-failed`
import typings.openseadragon.openseadragonStrings.`pre-full-page`
import typings.openseadragon.openseadragonStrings.`pre-full-screen`
import typings.openseadragon.openseadragonStrings.`remove-overlay`
import typings.openseadragon.openseadragonStrings.`reset-size`
import typings.openseadragon.openseadragonStrings.`tile-drawing`
import typings.openseadragon.openseadragonStrings.`tile-drawn`
import typings.openseadragon.openseadragonStrings.`tile-load-failed`
import typings.openseadragon.openseadragonStrings.`tile-loaded`
import typings.openseadragon.openseadragonStrings.`tile-unloaded`
import typings.openseadragon.openseadragonStrings.`update-level`
import typings.openseadragon.openseadragonStrings.`update-overlay`
import typings.openseadragon.openseadragonStrings.`update-tile`
import typings.openseadragon.openseadragonStrings.`update-viewport`
import typings.openseadragon.openseadragonStrings.`viewport-change`
import typings.openseadragon.openseadragonStrings.animation
import typings.openseadragon.openseadragonStrings.close
import typings.openseadragon.openseadragonStrings.constrain
import typings.openseadragon.openseadragonStrings.flip
import typings.openseadragon.openseadragonStrings.home
import typings.openseadragon.openseadragonStrings.open
import typings.openseadragon.openseadragonStrings.page
import typings.openseadragon.openseadragonStrings.pan
import typings.openseadragon.openseadragonStrings.resize
import typings.openseadragon.openseadragonStrings.rotate
import typings.openseadragon.openseadragonStrings.visible
import typings.openseadragon.openseadragonStrings.zoom
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Viewer")
@js.native
open class Viewer protected () extends ControlDock {
  def this(options: Options) = this()
  
  def _cancelPendingImages(): Unit = js.native
  
  @JSName("addHandler")
  def addHandler_additemfailed(eventName: `add-item-failed`, callback: EventHandler[AddItemFailedEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_additemfailed(eventName: `add-item-failed`, callback: EventHandler[AddItemFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_addoverlay(eventName: `add-overlay`, callback: EventHandler[AddOverlayEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_addoverlay(eventName: `add-overlay`, callback: EventHandler[AddOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_animationfinish(eventName: `animation-finish`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_animationfinish(eventName: `animation-finish`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_animationstart(eventName: `animation-start`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_animationstart(eventName: `animation-start`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasclick(eventName: `canvas-click`, callback: EventHandler[CanvasClickEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasclick(eventName: `canvas-click`, callback: EventHandler[CanvasClickEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvascontextmenu(eventName: `canvas-contextmenu`, callback: EventHandler[CanvasContextMenuEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvascontextmenu(
    eventName: `canvas-contextmenu`,
    callback: EventHandler[CanvasContextMenuEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdoubleclick(eventName: `canvas-double-click`, callback: EventHandler[CanvasDoubleClickEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdoubleclick(
    eventName: `canvas-double-click`,
    callback: EventHandler[CanvasDoubleClickEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdrag(eventName: `canvas-drag`, callback: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdrag(eventName: `canvas-drag`, callback: EventHandler[CanvasDragEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdragend(eventName: `canvas-drag-end`, callback: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasdragend(eventName: `canvas-drag-end`, callback: EventHandler[CanvasDragEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasenter(eventName: `canvas-enter`, callback: EventHandler[CanvasEnterEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasenter(eventName: `canvas-enter`, callback: EventHandler[CanvasEnterEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasexit(eventName: `canvas-exit`, callback: EventHandler[CanvasExitEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasexit(eventName: `canvas-exit`, callback: EventHandler[CanvasExitEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaskey(eventName: `canvas-key`, callback: EventHandler[CanvasKeyEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaskey(eventName: `canvas-key`, callback: EventHandler[CanvasKeyEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasnonprimarypress(eventName: `canvas-nonprimary-press`, callback: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasnonprimarypress(
    eventName: `canvas-nonprimary-press`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasnonprimaryrelease(eventName: `canvas-nonprimary-release`, callback: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasnonprimaryrelease(
    eventName: `canvas-nonprimary-release`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaspinch(eventName: `canvas-pinch`, callback: EventHandler[CanvasPinchEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaspinch(eventName: `canvas-pinch`, callback: EventHandler[CanvasPinchEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaspress(eventName: `canvas-press`, callback: EventHandler[CanvasPressEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvaspress(eventName: `canvas-press`, callback: EventHandler[CanvasPressEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasrelease(eventName: `canvas-release`, callback: EventHandler[CanvasReleaseEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasrelease(eventName: `canvas-release`, callback: EventHandler[CanvasReleaseEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasscroll(eventName: `canvas-scroll`, callback: EventHandler[CanvasScrollEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_canvasscroll(eventName: `canvas-scroll`, callback: EventHandler[CanvasScrollEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_clearoverlay(eventName: `clear-overlay`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_clearoverlay(eventName: `clear-overlay`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_close(eventName: close, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_close(eventName: close, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_containerenter(eventName: `container-enter`, callback: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_containerenter(eventName: `container-enter`, callback: EventHandler[ContainerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_containerexit(eventName: `container-exit`, callback: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_containerexit(eventName: `container-exit`, callback: EventHandler[ContainerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_controlsenabled(eventName: `controls-enabled`, callback: EventHandler[ControlsEnabledEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_controlsenabled(eventName: `controls-enabled`, callback: EventHandler[ControlsEnabledEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_flip(eventName: flip, callback: EventHandler[FlipEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_flip(eventName: flip, callback: EventHandler[FlipEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullscreen(eventName: `full-screen`, callback: EventHandler[FullScreenEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullscreen(eventName: `full-screen`, callback: EventHandler[FullScreenEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_home(eventName: home, callback: EventHandler[HomeEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_home(eventName: home, callback: EventHandler[HomeEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_mouseenabled(eventName: `mouse-enabled`, callback: EventHandler[MouseEnabledEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_mouseenabled(eventName: `mouse-enabled`, callback: EventHandler[MouseEnabledEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatorclick(eventName: `navigator-click`, callback: EventHandler[NavigatorClickEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatorclick(eventName: `navigator-click`, callback: EventHandler[NavigatorClickEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatordrag(eventName: `navigator-drag`, callback: EventHandler[NavigatorDragEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatordrag(eventName: `navigator-drag`, callback: EventHandler[NavigatorDragEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatorscroll(eventName: `navigator-scroll`, callback: EventHandler[NavigatorScrollEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_navigatorscroll(eventName: `navigator-scroll`, callback: EventHandler[NavigatorScrollEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_open(eventName: open, callback: EventHandler[OpenEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_open(eventName: open, callback: EventHandler[OpenEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_openfailed(eventName: `open-failed`, callback: EventHandler[OpenFailedEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_openfailed(eventName: `open-failed`, callback: EventHandler[OpenFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_page(eventName: page, callback: EventHandler[PageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_page(eventName: page, callback: EventHandler[PageEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_pan(eventName: pan, callback: EventHandler[PanEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_pan(eventName: pan, callback: EventHandler[PanEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_prefullpage(eventName: `pre-full-page`, callback: EventHandler[PreFullPageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_prefullpage(eventName: `pre-full-page`, callback: EventHandler[PreFullPageEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_prefullscreen(eventName: `pre-full-screen`, callback: EventHandler[PreFullScreenEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_prefullscreen(eventName: `pre-full-screen`, callback: EventHandler[PreFullScreenEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_removeoverlay(eventName: `remove-overlay`, callback: EventHandler[RemoveOverlayEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_removeoverlay(eventName: `remove-overlay`, callback: EventHandler[RemoveOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_resetsize(eventName: `reset-size`, callback: EventHandler[ResetSizeEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_resetsize(eventName: `reset-size`, callback: EventHandler[ResetSizeEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_tiledrawing(eventName: `tile-drawing`, callback: EventHandler[TileDrawingEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_tiledrawing(eventName: `tile-drawing`, callback: EventHandler[TileDrawingEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileloaded(eventName: `tile-loaded`, callback: EventHandler[TileLoadedEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileloaded(eventName: `tile-loaded`, callback: EventHandler[TileLoadedEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileloadfailed(eventName: `tile-load-failed`, callback: EventHandler[TileLoadFailedEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileloadfailed(eventName: `tile-load-failed`, callback: EventHandler[TileLoadFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_updatelevel(eventName: `update-level`, callback: EventHandler[UpdateLevelEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_updatelevel(eventName: `update-level`, callback: EventHandler[UpdateLevelEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_updateoverlay(eventName: `update-overlay`, callback: EventHandler[UpdateOverlayEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_updateoverlay(eventName: `update-overlay`, callback: EventHandler[UpdateOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_updateviewport(eventName: `update-viewport`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_updateviewport(eventName: `update-viewport`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_viewportchange(eventName: `viewport-change`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_viewportchange(eventName: `viewport-change`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent], userData: js.Object): Unit = js.native
  
  @JSName("addOnceHandler")
  def addOnceHandler_additemfailed(eventName: `add-item-failed`, callback: EventHandler[AddItemFailedEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additemfailed(eventName: `add-item-failed`, callback: EventHandler[AddItemFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additemfailed(
    eventName: `add-item-failed`,
    callback: EventHandler[AddItemFailedEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_additemfailed(
    eventName: `add-item-failed`,
    callback: EventHandler[AddItemFailedEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_addoverlay(eventName: `add-overlay`, callback: EventHandler[AddOverlayEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_addoverlay(eventName: `add-overlay`, callback: EventHandler[AddOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_addoverlay(
    eventName: `add-overlay`,
    callback: EventHandler[AddOverlayEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_addoverlay(eventName: `add-overlay`, callback: EventHandler[AddOverlayEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animation(eventName: animation, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationfinish(eventName: `animation-finish`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationfinish(eventName: `animation-finish`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationfinish(
    eventName: `animation-finish`,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationfinish(eventName: `animation-finish`, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationstart(eventName: `animation-start`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationstart(eventName: `animation-start`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationstart(
    eventName: `animation-start`,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_animationstart(eventName: `animation-start`, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasclick(eventName: `canvas-click`, callback: EventHandler[CanvasClickEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasclick(eventName: `canvas-click`, callback: EventHandler[CanvasClickEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasclick(
    eventName: `canvas-click`,
    callback: EventHandler[CanvasClickEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasclick(eventName: `canvas-click`, callback: EventHandler[CanvasClickEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvascontextmenu(eventName: `canvas-contextmenu`, callback: EventHandler[CanvasContextMenuEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvascontextmenu(
    eventName: `canvas-contextmenu`,
    callback: EventHandler[CanvasContextMenuEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvascontextmenu(
    eventName: `canvas-contextmenu`,
    callback: EventHandler[CanvasContextMenuEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvascontextmenu(
    eventName: `canvas-contextmenu`,
    callback: EventHandler[CanvasContextMenuEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdoubleclick(eventName: `canvas-double-click`, callback: EventHandler[CanvasDoubleClickEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdoubleclick(
    eventName: `canvas-double-click`,
    callback: EventHandler[CanvasDoubleClickEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdoubleclick(
    eventName: `canvas-double-click`,
    callback: EventHandler[CanvasDoubleClickEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdoubleclick(
    eventName: `canvas-double-click`,
    callback: EventHandler[CanvasDoubleClickEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdrag(eventName: `canvas-drag`, callback: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdrag(eventName: `canvas-drag`, callback: EventHandler[CanvasDragEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdrag(
    eventName: `canvas-drag`,
    callback: EventHandler[CanvasDragEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdrag(eventName: `canvas-drag`, callback: EventHandler[CanvasDragEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdragend(eventName: `canvas-drag-end`, callback: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdragend(eventName: `canvas-drag-end`, callback: EventHandler[CanvasDragEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdragend(
    eventName: `canvas-drag-end`,
    callback: EventHandler[CanvasDragEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasdragend(
    eventName: `canvas-drag-end`,
    callback: EventHandler[CanvasDragEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasenter(eventName: `canvas-enter`, callback: EventHandler[CanvasEnterEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasenter(eventName: `canvas-enter`, callback: EventHandler[CanvasEnterEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasenter(
    eventName: `canvas-enter`,
    callback: EventHandler[CanvasEnterEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasenter(eventName: `canvas-enter`, callback: EventHandler[CanvasEnterEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasexit(eventName: `canvas-exit`, callback: EventHandler[CanvasExitEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasexit(eventName: `canvas-exit`, callback: EventHandler[CanvasExitEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasexit(
    eventName: `canvas-exit`,
    callback: EventHandler[CanvasExitEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasexit(eventName: `canvas-exit`, callback: EventHandler[CanvasExitEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaskey(eventName: `canvas-key`, callback: EventHandler[CanvasKeyEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaskey(eventName: `canvas-key`, callback: EventHandler[CanvasKeyEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaskey(
    eventName: `canvas-key`,
    callback: EventHandler[CanvasKeyEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaskey(eventName: `canvas-key`, callback: EventHandler[CanvasKeyEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimarypress(eventName: `canvas-nonprimary-press`, callback: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimarypress(
    eventName: `canvas-nonprimary-press`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimarypress(
    eventName: `canvas-nonprimary-press`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimarypress(
    eventName: `canvas-nonprimary-press`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimaryrelease(eventName: `canvas-nonprimary-release`, callback: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimaryrelease(
    eventName: `canvas-nonprimary-release`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimaryrelease(
    eventName: `canvas-nonprimary-release`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasnonprimaryrelease(
    eventName: `canvas-nonprimary-release`,
    callback: EventHandler[CanvasNonPrimaryButtonEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspinch(eventName: `canvas-pinch`, callback: EventHandler[CanvasPinchEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspinch(eventName: `canvas-pinch`, callback: EventHandler[CanvasPinchEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspinch(
    eventName: `canvas-pinch`,
    callback: EventHandler[CanvasPinchEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspinch(eventName: `canvas-pinch`, callback: EventHandler[CanvasPinchEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspress(eventName: `canvas-press`, callback: EventHandler[CanvasPressEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspress(eventName: `canvas-press`, callback: EventHandler[CanvasPressEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspress(
    eventName: `canvas-press`,
    callback: EventHandler[CanvasPressEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvaspress(eventName: `canvas-press`, callback: EventHandler[CanvasPressEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasrelease(eventName: `canvas-release`, callback: EventHandler[CanvasReleaseEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasrelease(eventName: `canvas-release`, callback: EventHandler[CanvasReleaseEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasrelease(
    eventName: `canvas-release`,
    callback: EventHandler[CanvasReleaseEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasrelease(
    eventName: `canvas-release`,
    callback: EventHandler[CanvasReleaseEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasscroll(eventName: `canvas-scroll`, callback: EventHandler[CanvasScrollEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasscroll(eventName: `canvas-scroll`, callback: EventHandler[CanvasScrollEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasscroll(
    eventName: `canvas-scroll`,
    callback: EventHandler[CanvasScrollEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_canvasscroll(
    eventName: `canvas-scroll`,
    callback: EventHandler[CanvasScrollEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clearoverlay(eventName: `clear-overlay`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clearoverlay(eventName: `clear-overlay`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clearoverlay(
    eventName: `clear-overlay`,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clearoverlay(eventName: `clear-overlay`, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_close(eventName: close, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_close(eventName: close, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_close(eventName: close, callback: EventHandler[ViewerEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_close(eventName: close, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_constrain(eventName: constrain, callback: EventHandler[ConstrainEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerenter(eventName: `container-enter`, callback: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerenter(eventName: `container-enter`, callback: EventHandler[ContainerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerenter(
    eventName: `container-enter`,
    callback: EventHandler[ContainerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerenter(
    eventName: `container-enter`,
    callback: EventHandler[ContainerEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerexit(eventName: `container-exit`, callback: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerexit(eventName: `container-exit`, callback: EventHandler[ContainerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerexit(
    eventName: `container-exit`,
    callback: EventHandler[ContainerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_containerexit(eventName: `container-exit`, callback: EventHandler[ContainerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_controlsenabled(eventName: `controls-enabled`, callback: EventHandler[ControlsEnabledEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_controlsenabled(eventName: `controls-enabled`, callback: EventHandler[ControlsEnabledEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_controlsenabled(
    eventName: `controls-enabled`,
    callback: EventHandler[ControlsEnabledEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_controlsenabled(
    eventName: `controls-enabled`,
    callback: EventHandler[ControlsEnabledEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_flip(eventName: flip, callback: EventHandler[FlipEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_flip(eventName: flip, callback: EventHandler[FlipEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_flip(eventName: flip, callback: EventHandler[FlipEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_flip(eventName: flip, callback: EventHandler[FlipEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullpage(eventName: `full-page`, callback: EventHandler[FullPageEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullscreen(eventName: `full-screen`, callback: EventHandler[FullScreenEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullscreen(eventName: `full-screen`, callback: EventHandler[FullScreenEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullscreen(
    eventName: `full-screen`,
    callback: EventHandler[FullScreenEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullscreen(eventName: `full-screen`, callback: EventHandler[FullScreenEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_home(eventName: home, callback: EventHandler[HomeEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_home(eventName: home, callback: EventHandler[HomeEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_home(eventName: home, callback: EventHandler[HomeEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_home(eventName: home, callback: EventHandler[HomeEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_mouseenabled(eventName: `mouse-enabled`, callback: EventHandler[MouseEnabledEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_mouseenabled(eventName: `mouse-enabled`, callback: EventHandler[MouseEnabledEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_mouseenabled(
    eventName: `mouse-enabled`,
    callback: EventHandler[MouseEnabledEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_mouseenabled(
    eventName: `mouse-enabled`,
    callback: EventHandler[MouseEnabledEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorclick(eventName: `navigator-click`, callback: EventHandler[NavigatorClickEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorclick(eventName: `navigator-click`, callback: EventHandler[NavigatorClickEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorclick(
    eventName: `navigator-click`,
    callback: EventHandler[NavigatorClickEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorclick(
    eventName: `navigator-click`,
    callback: EventHandler[NavigatorClickEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatordrag(eventName: `navigator-drag`, callback: EventHandler[NavigatorDragEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatordrag(eventName: `navigator-drag`, callback: EventHandler[NavigatorDragEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatordrag(
    eventName: `navigator-drag`,
    callback: EventHandler[NavigatorDragEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatordrag(
    eventName: `navigator-drag`,
    callback: EventHandler[NavigatorDragEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorscroll(eventName: `navigator-scroll`, callback: EventHandler[NavigatorScrollEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorscroll(eventName: `navigator-scroll`, callback: EventHandler[NavigatorScrollEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorscroll(
    eventName: `navigator-scroll`,
    callback: EventHandler[NavigatorScrollEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_navigatorscroll(
    eventName: `navigator-scroll`,
    callback: EventHandler[NavigatorScrollEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_open(eventName: open, callback: EventHandler[OpenEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_open(eventName: open, callback: EventHandler[OpenEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_open(eventName: open, callback: EventHandler[OpenEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_open(eventName: open, callback: EventHandler[OpenEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_openfailed(eventName: `open-failed`, callback: EventHandler[OpenFailedEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_openfailed(eventName: `open-failed`, callback: EventHandler[OpenFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_openfailed(
    eventName: `open-failed`,
    callback: EventHandler[OpenFailedEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_openfailed(eventName: `open-failed`, callback: EventHandler[OpenFailedEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_page(eventName: page, callback: EventHandler[PageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_page(eventName: page, callback: EventHandler[PageEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_page(eventName: page, callback: EventHandler[PageEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_page(eventName: page, callback: EventHandler[PageEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_pan(eventName: pan, callback: EventHandler[PanEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_pan(eventName: pan, callback: EventHandler[PanEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_pan(eventName: pan, callback: EventHandler[PanEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_pan(eventName: pan, callback: EventHandler[PanEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullpage(eventName: `pre-full-page`, callback: EventHandler[PreFullPageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullpage(eventName: `pre-full-page`, callback: EventHandler[PreFullPageEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullpage(
    eventName: `pre-full-page`,
    callback: EventHandler[PreFullPageEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullpage(
    eventName: `pre-full-page`,
    callback: EventHandler[PreFullPageEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullscreen(eventName: `pre-full-screen`, callback: EventHandler[PreFullScreenEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullscreen(eventName: `pre-full-screen`, callback: EventHandler[PreFullScreenEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullscreen(
    eventName: `pre-full-screen`,
    callback: EventHandler[PreFullScreenEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_prefullscreen(
    eventName: `pre-full-screen`,
    callback: EventHandler[PreFullScreenEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeoverlay(eventName: `remove-overlay`, callback: EventHandler[RemoveOverlayEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeoverlay(eventName: `remove-overlay`, callback: EventHandler[RemoveOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeoverlay(
    eventName: `remove-overlay`,
    callback: EventHandler[RemoveOverlayEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_removeoverlay(
    eventName: `remove-overlay`,
    callback: EventHandler[RemoveOverlayEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resetsize(eventName: `reset-size`, callback: EventHandler[ResetSizeEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resetsize(eventName: `reset-size`, callback: EventHandler[ResetSizeEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resetsize(
    eventName: `reset-size`,
    callback: EventHandler[ResetSizeEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resetsize(eventName: `reset-size`, callback: EventHandler[ResetSizeEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_resize(eventName: resize, callback: EventHandler[ResizeEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_rotate(eventName: rotate, callback: EventHandler[RotateEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawing(eventName: `tile-drawing`, callback: EventHandler[TileDrawingEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawing(eventName: `tile-drawing`, callback: EventHandler[TileDrawingEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawing(
    eventName: `tile-drawing`,
    callback: EventHandler[TileDrawingEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawing(eventName: `tile-drawing`, callback: EventHandler[TileDrawingEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tiledrawn(eventName: `tile-drawn`, callback: EventHandler[TileEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloaded(eventName: `tile-loaded`, callback: EventHandler[TileLoadedEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloaded(eventName: `tile-loaded`, callback: EventHandler[TileLoadedEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloaded(
    eventName: `tile-loaded`,
    callback: EventHandler[TileLoadedEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloaded(eventName: `tile-loaded`, callback: EventHandler[TileLoadedEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloadfailed(eventName: `tile-load-failed`, callback: EventHandler[TileLoadFailedEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloadfailed(eventName: `tile-load-failed`, callback: EventHandler[TileLoadFailedEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloadfailed(
    eventName: `tile-load-failed`,
    callback: EventHandler[TileLoadFailedEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileloadfailed(
    eventName: `tile-load-failed`,
    callback: EventHandler[TileLoadFailedEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_tileunloaded(eventName: `tile-unloaded`, callback: EventHandler[TileEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatelevel(eventName: `update-level`, callback: EventHandler[UpdateLevelEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatelevel(eventName: `update-level`, callback: EventHandler[UpdateLevelEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatelevel(
    eventName: `update-level`,
    callback: EventHandler[UpdateLevelEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatelevel(eventName: `update-level`, callback: EventHandler[UpdateLevelEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateoverlay(eventName: `update-overlay`, callback: EventHandler[UpdateOverlayEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateoverlay(eventName: `update-overlay`, callback: EventHandler[UpdateOverlayEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateoverlay(
    eventName: `update-overlay`,
    callback: EventHandler[UpdateOverlayEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateoverlay(
    eventName: `update-overlay`,
    callback: EventHandler[UpdateOverlayEvent],
    userData: Unit,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updatetile(eventName: `update-tile`, callback: EventHandler[TileEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateviewport(eventName: `update-viewport`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateviewport(eventName: `update-viewport`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateviewport(
    eventName: `update-viewport`,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_updateviewport(eventName: `update-viewport`, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_viewportchange(eventName: `viewport-change`, callback: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_viewportchange(eventName: `viewport-change`, callback: EventHandler[ViewerEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_viewportchange(
    eventName: `viewport-change`,
    callback: EventHandler[ViewerEvent],
    userData: js.Object,
    times: Double
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_viewportchange(eventName: `viewport-change`, callback: EventHandler[ViewerEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_visible(eventName: visible, callback: EventHandler[VisibleEvent], userData: Unit, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent], userData: js.Object, times: Double): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_zoom(eventName: zoom, callback: EventHandler[ZoomEvent], userData: Unit, times: Double): Unit = js.native
  
  def addOverlay(element: String): Viewer = js.native
  def addOverlay(
    element: String,
    location: Unit,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Unit, placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: Unit,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Point): Viewer = js.native
  def addOverlay(
    element: String,
    location: Point,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Rect): Viewer = js.native
  def addOverlay(
    element: String,
    location: Rect,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: String, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: String,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Unit,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions, location: Unit, placement: Placement): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Unit,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions, location: Point): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Point,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions, location: Rect): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Rect,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: OverlayOptions, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: OverlayOptions,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Unit,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Unit, placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Unit,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Point): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Point,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Point, placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Point,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Rect): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Rect,
    placement: Unit,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  def addOverlay(element: HTMLElement, location: Rect, placement: Placement): Viewer = js.native
  def addOverlay(
    element: HTMLElement,
    location: Rect,
    placement: Placement,
    onDraw: js.Function3[/* element */ HTMLElement, /* location */ Location, /* placement */ Placement, Unit]
  ): Viewer = js.native
  
  def addReferenceStrip(): Unit = js.native
  
  def addSimpleImage(options: SimpleImageOptions): Unit = js.native
  
  def addTiledImage(options: TiledImageOptions): Unit = js.native
  
  def bindSequenceControls(): Viewer = js.native
  
  def bindStandardControls(): Viewer = js.native
  
  var canvas: HTMLElement = js.native
  
  def clearOverlays(): Viewer = js.native
  
  def close(): Viewer = js.native
  
  var container: HTMLElement = js.native
  
  def currentPage(): Double = js.native
  
  def destroy(): Unit = js.native
  
  var drawer: Drawer = js.native
  
  var element: HTMLElement = js.native
  
  def forceRedraw(): Viewer = js.native
  
  def gestureSettingsByDeviceType(`type`: String): GestureSettings = js.native
  
  def getHandler(eventName: String): js.Function1[/* event */ Event, Unit] = js.native
  
  def getOverlayById(element: String): Overlay = js.native
  def getOverlayById(element: Element): Overlay = js.native
  
  def goToPage(page: Double): Viewer = js.native
  
  var initialPage: Double = js.native
  
  def isFullPage(): Boolean = js.native
  
  def isMouseNavEnabled(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  var navigator: Navigator = js.native
  
  def open(tileSources: String): Viewer = js.native
  def open(tileSources: String, initialPage: Double): Viewer = js.native
  def open(tileSources: js.Array[TileSource]): Viewer = js.native
  def open(tileSources: js.Array[TileSource], initialPage: Double): Viewer = js.native
  def open(tileSources: js.Object): Viewer = js.native
  def open(tileSources: js.Object, initialPage: Double): Viewer = js.native
  
  def raiseEvent(eventName: String): Unit = js.native
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  
  var referenceStrip: ReferenceStrip = js.native
  
  def removeAllHandlers(
    eventName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.openseadragon.openseadragonStrings.`add-item-failed`, typings.openseadragon.openseadragonStrings.`add-overlay`, typings.openseadragon.openseadragonStrings.animation */ Any
  ): Unit = js.native
  
  @JSName("removeHandler")
  def removeHandler_additemfailed(eventName: `add-item-failed`, handler: EventHandler[AddItemFailedEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_addoverlay(eventName: `add-overlay`, handler: EventHandler[AddOverlayEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_animation(eventName: animation, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_animationfinish(eventName: `animation-finish`, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_animationstart(eventName: `animation-start`, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasclick(eventName: `canvas-click`, handler: EventHandler[CanvasClickEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvascontextmenu(eventName: `canvas-contextmenu`, handler: EventHandler[CanvasContextMenuEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasdoubleclick(eventName: `canvas-double-click`, handler: EventHandler[CanvasDoubleClickEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasdrag(eventName: `canvas-drag`, handler: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasdragend(eventName: `canvas-drag-end`, handler: EventHandler[CanvasDragEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasenter(eventName: `canvas-enter`, handler: EventHandler[CanvasEnterEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasexit(eventName: `canvas-exit`, handler: EventHandler[CanvasExitEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvaskey(eventName: `canvas-key`, handler: EventHandler[CanvasKeyEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasnonprimarypress(eventName: `canvas-nonprimary-press`, handler: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasnonprimaryrelease(eventName: `canvas-nonprimary-release`, handler: EventHandler[CanvasNonPrimaryButtonEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvaspinch(eventName: `canvas-pinch`, handler: EventHandler[CanvasPinchEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvaspress(eventName: `canvas-press`, handler: EventHandler[CanvasPressEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasrelease(eventName: `canvas-release`, handler: EventHandler[CanvasReleaseEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_canvasscroll(eventName: `canvas-scroll`, handler: EventHandler[CanvasScrollEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_clearoverlay(eventName: `clear-overlay`, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_close(eventName: close, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_constrain(eventName: constrain, handler: EventHandler[ConstrainEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_containerenter(eventName: `container-enter`, handler: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_containerexit(eventName: `container-exit`, handler: EventHandler[ContainerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_controlsenabled(eventName: `controls-enabled`, handler: EventHandler[ControlsEnabledEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_flip(eventName: flip, handler: EventHandler[FlipEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_fullpage(eventName: `full-page`, handler: EventHandler[FullPageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_fullscreen(eventName: `full-screen`, handler: EventHandler[FullScreenEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_home(eventName: home, handler: EventHandler[HomeEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_mouseenabled(eventName: `mouse-enabled`, handler: EventHandler[MouseEnabledEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_navigatorclick(eventName: `navigator-click`, handler: EventHandler[NavigatorClickEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_navigatordrag(eventName: `navigator-drag`, handler: EventHandler[NavigatorDragEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_navigatorscroll(eventName: `navigator-scroll`, handler: EventHandler[NavigatorScrollEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_open(eventName: open, handler: EventHandler[OpenEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_openfailed(eventName: `open-failed`, handler: EventHandler[OpenFailedEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_page(eventName: page, handler: EventHandler[PageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_pan(eventName: pan, handler: EventHandler[PanEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_prefullpage(eventName: `pre-full-page`, handler: EventHandler[PreFullPageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_prefullscreen(eventName: `pre-full-screen`, handler: EventHandler[PreFullScreenEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_removeoverlay(eventName: `remove-overlay`, handler: EventHandler[RemoveOverlayEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_resetsize(eventName: `reset-size`, handler: EventHandler[ResetSizeEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_resize(eventName: resize, handler: EventHandler[ResizeEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_rotate(eventName: rotate, handler: EventHandler[RotateEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_tiledrawing(eventName: `tile-drawing`, handler: EventHandler[TileDrawingEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_tiledrawn(eventName: `tile-drawn`, handler: EventHandler[TileEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_tileloaded(eventName: `tile-loaded`, handler: EventHandler[TileLoadedEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_tileloadfailed(eventName: `tile-load-failed`, handler: EventHandler[TileLoadFailedEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_tileunloaded(eventName: `tile-unloaded`, handler: EventHandler[TileEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_updatelevel(eventName: `update-level`, handler: EventHandler[UpdateLevelEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_updateoverlay(eventName: `update-overlay`, handler: EventHandler[UpdateOverlayEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_updatetile(eventName: `update-tile`, handler: EventHandler[TileEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_updateviewport(eventName: `update-viewport`, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_viewportchange(eventName: `viewport-change`, handler: EventHandler[ViewerEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_visible(eventName: visible, handler: EventHandler[VisibleEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_zoom(eventName: zoom, handler: EventHandler[ZoomEvent]): Unit = js.native
  
  def removeOverlay(overlay: String): Viewer = js.native
  def removeOverlay(overlay: Element): Viewer = js.native
  
  def removeReferenceStrip(): Unit = js.native
  
  def setDebugMode(debug: Boolean): Viewer = js.native
  
  def setFullPage(fullScreen: Boolean): Viewer = js.native
  
  def setFullScreen(fullScreen: Boolean): Viewer = js.native
  
  def setMouseNavEnabled(enabled: Boolean): Viewer = js.native
  
  def setVisible(visible: Boolean): Viewer = js.native
  
  def updateOverlay(element: String, location: Point): Viewer = js.native
  def updateOverlay(element: String, location: Point, placement: Placement): Viewer = js.native
  def updateOverlay(element: String, location: Rect): Viewer = js.native
  def updateOverlay(element: String, location: Rect, placement: Placement): Viewer = js.native
  def updateOverlay(element: Element, location: Point): Viewer = js.native
  def updateOverlay(element: Element, location: Point, placement: Placement): Viewer = js.native
  def updateOverlay(element: Element, location: Rect): Viewer = js.native
  def updateOverlay(element: Element, location: Rect, placement: Placement): Viewer = js.native
  
  var viewport: Viewport = js.native
  
  var world: World = js.native
}
