package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerEventMap extends StObject {
  
  var `add-item-failed`: AddItemFailedEvent
  
  var `add-overlay`: AddOverlayEvent
  
  var animation: ViewerEvent
  
  var `animation-finish`: ViewerEvent
  
  var `animation-start`: ViewerEvent
  
  var `canvas-click`: CanvasClickEvent
  
  var `canvas-contextmenu`: CanvasContextMenuEvent
  
  var `canvas-double-click`: CanvasDoubleClickEvent
  
  var `canvas-drag`: CanvasDragEvent
  
  var `canvas-drag-end`: CanvasDragEvent
  
  var `canvas-enter`: CanvasEnterEvent
  
  var `canvas-exit`: CanvasExitEvent
  
  var `canvas-key`: CanvasKeyEvent
  
  var `canvas-nonprimary-press`: CanvasNonPrimaryButtonEvent
  
  var `canvas-nonprimary-release`: CanvasNonPrimaryButtonEvent
  
  var `canvas-pinch`: CanvasPinchEvent
  
  var `canvas-press`: CanvasPressEvent
  
  var `canvas-release`: CanvasReleaseEvent
  
  var `canvas-scroll`: CanvasScrollEvent
  
  var `clear-overlay`: ViewerEvent
  
  var close: ViewerEvent
  
  var constrain: ConstrainEvent
  
  var `container-enter`: ContainerEvent
  
  var `container-exit`: ContainerEvent
  
  var `controls-enabled`: ControlsEnabledEvent
  
  var flip: FlipEvent
  
  var `full-page`: FullPageEvent
  
  var `full-screen`: FullScreenEvent
  
  var home: HomeEvent
  
  var `mouse-enabled`: MouseEnabledEvent
  
  var `navigator-click`: NavigatorClickEvent
  
  var `navigator-drag`: NavigatorDragEvent
  
  var `navigator-scroll`: NavigatorScrollEvent
  
  var open: OpenEvent
  
  var `open-failed`: OpenFailedEvent
  
  var page: PageEvent
  
  var pan: PanEvent
  
  var `pre-full-page`: PreFullPageEvent
  
  var `pre-full-screen`: PreFullScreenEvent
  
  var `remove-overlay`: RemoveOverlayEvent
  
  var `reset-size`: ResetSizeEvent
  
  var resize: ResizeEvent
  
  var rotate: RotateEvent
  
  var `tile-drawing`: TileDrawingEvent
  
  var `tile-drawn`: TileEvent
  
  var `tile-load-failed`: TileLoadFailedEvent
  
  var `tile-loaded`: TileLoadedEvent
  
  var `tile-unloaded`: TileEvent
  
  var `update-level`: UpdateLevelEvent
  
  var `update-overlay`: UpdateOverlayEvent
  
  var `update-tile`: TileEvent
  
  var `update-viewport`: ViewerEvent
  
  var `viewport-change`: ViewerEvent
  
  var visible: VisibleEvent
  
  var zoom: ZoomEvent
}
object ViewerEventMap {
  
  inline def apply(
    `add-item-failed`: AddItemFailedEvent,
    `add-overlay`: AddOverlayEvent,
    animation: ViewerEvent,
    `animation-finish`: ViewerEvent,
    `animation-start`: ViewerEvent,
    `canvas-click`: CanvasClickEvent,
    `canvas-contextmenu`: CanvasContextMenuEvent,
    `canvas-double-click`: CanvasDoubleClickEvent,
    `canvas-drag`: CanvasDragEvent,
    `canvas-drag-end`: CanvasDragEvent,
    `canvas-enter`: CanvasEnterEvent,
    `canvas-exit`: CanvasExitEvent,
    `canvas-key`: CanvasKeyEvent,
    `canvas-nonprimary-press`: CanvasNonPrimaryButtonEvent,
    `canvas-nonprimary-release`: CanvasNonPrimaryButtonEvent,
    `canvas-pinch`: CanvasPinchEvent,
    `canvas-press`: CanvasPressEvent,
    `canvas-release`: CanvasReleaseEvent,
    `canvas-scroll`: CanvasScrollEvent,
    `clear-overlay`: ViewerEvent,
    close: ViewerEvent,
    constrain: ConstrainEvent,
    `container-enter`: ContainerEvent,
    `container-exit`: ContainerEvent,
    `controls-enabled`: ControlsEnabledEvent,
    flip: FlipEvent,
    `full-page`: FullPageEvent,
    `full-screen`: FullScreenEvent,
    home: HomeEvent,
    `mouse-enabled`: MouseEnabledEvent,
    `navigator-click`: NavigatorClickEvent,
    `navigator-drag`: NavigatorDragEvent,
    `navigator-scroll`: NavigatorScrollEvent,
    open: OpenEvent,
    `open-failed`: OpenFailedEvent,
    page: PageEvent,
    pan: PanEvent,
    `pre-full-page`: PreFullPageEvent,
    `pre-full-screen`: PreFullScreenEvent,
    `remove-overlay`: RemoveOverlayEvent,
    `reset-size`: ResetSizeEvent,
    resize: ResizeEvent,
    rotate: RotateEvent,
    `tile-drawing`: TileDrawingEvent,
    `tile-drawn`: TileEvent,
    `tile-load-failed`: TileLoadFailedEvent,
    `tile-loaded`: TileLoadedEvent,
    `tile-unloaded`: TileEvent,
    `update-level`: UpdateLevelEvent,
    `update-overlay`: UpdateOverlayEvent,
    `update-tile`: TileEvent,
    `update-viewport`: ViewerEvent,
    `viewport-change`: ViewerEvent,
    visible: VisibleEvent,
    zoom: ZoomEvent
  ): ViewerEventMap = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], home = home.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("add-item-failed")(`add-item-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("add-overlay")(`add-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-finish")(`animation-finish`.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-start")(`animation-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-click")(`canvas-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-contextmenu")(`canvas-contextmenu`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-double-click")(`canvas-double-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-drag")(`canvas-drag`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-drag-end")(`canvas-drag-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-enter")(`canvas-enter`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-exit")(`canvas-exit`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-key")(`canvas-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-nonprimary-press")(`canvas-nonprimary-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-nonprimary-release")(`canvas-nonprimary-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-pinch")(`canvas-pinch`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-press")(`canvas-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-release")(`canvas-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("canvas-scroll")(`canvas-scroll`.asInstanceOf[js.Any])
    __obj.updateDynamic("clear-overlay")(`clear-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("container-enter")(`container-enter`.asInstanceOf[js.Any])
    __obj.updateDynamic("container-exit")(`container-exit`.asInstanceOf[js.Any])
    __obj.updateDynamic("controls-enabled")(`controls-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("full-page")(`full-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("full-screen")(`full-screen`.asInstanceOf[js.Any])
    __obj.updateDynamic("mouse-enabled")(`mouse-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigator-click")(`navigator-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigator-drag")(`navigator-drag`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigator-scroll")(`navigator-scroll`.asInstanceOf[js.Any])
    __obj.updateDynamic("open-failed")(`open-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("pre-full-page")(`pre-full-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("pre-full-screen")(`pre-full-screen`.asInstanceOf[js.Any])
    __obj.updateDynamic("remove-overlay")(`remove-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("reset-size")(`reset-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("tile-drawing")(`tile-drawing`.asInstanceOf[js.Any])
    __obj.updateDynamic("tile-drawn")(`tile-drawn`.asInstanceOf[js.Any])
    __obj.updateDynamic("tile-load-failed")(`tile-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("tile-loaded")(`tile-loaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("tile-unloaded")(`tile-unloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-level")(`update-level`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-overlay")(`update-overlay`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-tile")(`update-tile`.asInstanceOf[js.Any])
    __obj.updateDynamic("update-viewport")(`update-viewport`.asInstanceOf[js.Any])
    __obj.updateDynamic("viewport-change")(`viewport-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerEventMap]
  }
  
  extension [Self <: ViewerEventMap](x: Self) {
    
    inline def `setAdd-item-failed`(value: AddItemFailedEvent): Self = StObject.set(x, "add-item-failed", value.asInstanceOf[js.Any])
    
    inline def `setAdd-overlay`(value: AddOverlayEvent): Self = StObject.set(x, "add-overlay", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: ViewerEvent): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-finish`(value: ViewerEvent): Self = StObject.set(x, "animation-finish", value.asInstanceOf[js.Any])
    
    inline def `setAnimation-start`(value: ViewerEvent): Self = StObject.set(x, "animation-start", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-click`(value: CanvasClickEvent): Self = StObject.set(x, "canvas-click", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-contextmenu`(value: CanvasContextMenuEvent): Self = StObject.set(x, "canvas-contextmenu", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-double-click`(value: CanvasDoubleClickEvent): Self = StObject.set(x, "canvas-double-click", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-drag`(value: CanvasDragEvent): Self = StObject.set(x, "canvas-drag", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-drag-end`(value: CanvasDragEvent): Self = StObject.set(x, "canvas-drag-end", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-enter`(value: CanvasEnterEvent): Self = StObject.set(x, "canvas-enter", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-exit`(value: CanvasExitEvent): Self = StObject.set(x, "canvas-exit", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-key`(value: CanvasKeyEvent): Self = StObject.set(x, "canvas-key", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-nonprimary-press`(value: CanvasNonPrimaryButtonEvent): Self = StObject.set(x, "canvas-nonprimary-press", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-nonprimary-release`(value: CanvasNonPrimaryButtonEvent): Self = StObject.set(x, "canvas-nonprimary-release", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-pinch`(value: CanvasPinchEvent): Self = StObject.set(x, "canvas-pinch", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-press`(value: CanvasPressEvent): Self = StObject.set(x, "canvas-press", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-release`(value: CanvasReleaseEvent): Self = StObject.set(x, "canvas-release", value.asInstanceOf[js.Any])
    
    inline def `setCanvas-scroll`(value: CanvasScrollEvent): Self = StObject.set(x, "canvas-scroll", value.asInstanceOf[js.Any])
    
    inline def `setClear-overlay`(value: ViewerEvent): Self = StObject.set(x, "clear-overlay", value.asInstanceOf[js.Any])
    
    inline def setClose(value: ViewerEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setConstrain(value: ConstrainEvent): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def `setContainer-enter`(value: ContainerEvent): Self = StObject.set(x, "container-enter", value.asInstanceOf[js.Any])
    
    inline def `setContainer-exit`(value: ContainerEvent): Self = StObject.set(x, "container-exit", value.asInstanceOf[js.Any])
    
    inline def `setControls-enabled`(value: ControlsEnabledEvent): Self = StObject.set(x, "controls-enabled", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: FlipEvent): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def `setFull-page`(value: FullPageEvent): Self = StObject.set(x, "full-page", value.asInstanceOf[js.Any])
    
    inline def `setFull-screen`(value: FullScreenEvent): Self = StObject.set(x, "full-screen", value.asInstanceOf[js.Any])
    
    inline def setHome(value: HomeEvent): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
    
    inline def `setMouse-enabled`(value: MouseEnabledEvent): Self = StObject.set(x, "mouse-enabled", value.asInstanceOf[js.Any])
    
    inline def `setNavigator-click`(value: NavigatorClickEvent): Self = StObject.set(x, "navigator-click", value.asInstanceOf[js.Any])
    
    inline def `setNavigator-drag`(value: NavigatorDragEvent): Self = StObject.set(x, "navigator-drag", value.asInstanceOf[js.Any])
    
    inline def `setNavigator-scroll`(value: NavigatorScrollEvent): Self = StObject.set(x, "navigator-scroll", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: OpenEvent): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setOpen-failed`(value: OpenFailedEvent): Self = StObject.set(x, "open-failed", value.asInstanceOf[js.Any])
    
    inline def setPage(value: PageEvent): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPan(value: PanEvent): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def `setPre-full-page`(value: PreFullPageEvent): Self = StObject.set(x, "pre-full-page", value.asInstanceOf[js.Any])
    
    inline def `setPre-full-screen`(value: PreFullScreenEvent): Self = StObject.set(x, "pre-full-screen", value.asInstanceOf[js.Any])
    
    inline def `setRemove-overlay`(value: RemoveOverlayEvent): Self = StObject.set(x, "remove-overlay", value.asInstanceOf[js.Any])
    
    inline def `setReset-size`(value: ResetSizeEvent): Self = StObject.set(x, "reset-size", value.asInstanceOf[js.Any])
    
    inline def setResize(value: ResizeEvent): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: RotateEvent): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def `setTile-drawing`(value: TileDrawingEvent): Self = StObject.set(x, "tile-drawing", value.asInstanceOf[js.Any])
    
    inline def `setTile-drawn`(value: TileEvent): Self = StObject.set(x, "tile-drawn", value.asInstanceOf[js.Any])
    
    inline def `setTile-load-failed`(value: TileLoadFailedEvent): Self = StObject.set(x, "tile-load-failed", value.asInstanceOf[js.Any])
    
    inline def `setTile-loaded`(value: TileLoadedEvent): Self = StObject.set(x, "tile-loaded", value.asInstanceOf[js.Any])
    
    inline def `setTile-unloaded`(value: TileEvent): Self = StObject.set(x, "tile-unloaded", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-level`(value: UpdateLevelEvent): Self = StObject.set(x, "update-level", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-overlay`(value: UpdateOverlayEvent): Self = StObject.set(x, "update-overlay", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-tile`(value: TileEvent): Self = StObject.set(x, "update-tile", value.asInstanceOf[js.Any])
    
    inline def `setUpdate-viewport`(value: ViewerEvent): Self = StObject.set(x, "update-viewport", value.asInstanceOf[js.Any])
    
    inline def `setViewport-change`(value: ViewerEvent): Self = StObject.set(x, "viewport-change", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: VisibleEvent): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: ZoomEvent): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
