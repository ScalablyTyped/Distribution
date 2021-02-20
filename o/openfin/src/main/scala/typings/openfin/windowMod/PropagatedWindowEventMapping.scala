package typings.openfin.windowMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.viewMod.InputEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropagatedWindowEventMapping[Topic, Type] extends BaseEventMap {
  
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  
  var `window-blurred`: WindowEvent[Topic, Type] = js.native
  
  var `window-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  
  var `window-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  
  var `window-closed`: WindowEvent[Topic, Type] = js.native
  
  var `window-closing`: WindowEvent[Topic, Type] = js.native
  
  var `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  
  var `window-embedded`: WindowEvent[Topic, Type] = js.native
  
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type] = js.native
  
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type] = js.native
  
  var `window-focused`: WindowEvent[Topic, Type] = js.native
  
  var `window-group-changed`: WindowGroupChanged[Topic, Type] = js.native
  
  var `window-hidden`: WindowHiddenEvent[Topic, Type] = js.native
  
  var `window-hotkey`: InputEvent with (WindowEvent[Topic, Type]) = js.native
  
  var `window-initialized`: WindowEvent[Topic, Type] = js.native
  
  var `window-layout-initialized`: WindowEvent[Topic, Type] = js.native
  
  var `window-layout-ready`: WindowEvent[Topic, Type] = js.native
  
  var `window-maximized`: WindowEvent[Topic, Type] = js.native
  
  var `window-minimized`: WindowEvent[Topic, Type] = js.native
  
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type] = js.native
  
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, Type] = js.native
  
  var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type] = js.native
  
  var `window-reloaded`: WindowReloadedEvent[Topic, Type] = js.native
  
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type] = js.native
  
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type] = js.native
  
  var `window-restored`: WindowEvent[Topic, Type] = js.native
  
  var `window-shown`: WindowEvent[Topic, Type] = js.native
  
  var `window-user-movement-disabled`: WindowEvent[Topic, Type] = js.native
  
  var `window-user-movement-enabled`: WindowEvent[Topic, Type] = js.native
  
  var `window-will-move`: WillMoveOrResize[Topic, Type] = js.native
  
  var `window-will-resize`: WillMoveOrResize[Topic, Type] = js.native
}
object PropagatedWindowEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-blurred`: WindowEvent[Topic, Type],
    `window-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-closed`: WindowEvent[Topic, Type],
    `window-closing`: WindowEvent[Topic, Type],
    `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type]),
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-embedded`: WindowEvent[Topic, Type],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    `window-focused`: WindowEvent[Topic, Type],
    `window-group-changed`: WindowGroupChanged[Topic, Type],
    `window-hidden`: WindowHiddenEvent[Topic, Type],
    `window-hotkey`: InputEvent with (WindowEvent[Topic, Type]),
    `window-initialized`: WindowEvent[Topic, Type],
    `window-layout-initialized`: WindowEvent[Topic, Type],
    `window-layout-ready`: WindowEvent[Topic, Type],
    `window-maximized`: WindowEvent[Topic, Type],
    `window-minimized`: WindowEvent[Topic, Type],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    `window-options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `window-performance-report`: WindowPerformanceReport[Topic, Type],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type],
    `window-reloaded`: WindowReloadedEvent[Topic, Type],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type],
    `window-restored`: WindowEvent[Topic, Type],
    `window-shown`: WindowEvent[Topic, Type],
    `window-user-movement-disabled`: WindowEvent[Topic, Type],
    `window-user-movement-enabled`: WindowEvent[Topic, Type],
    `window-will-move`: WillMoveOrResize[Topic, Type],
    `window-will-resize`: WillMoveOrResize[Topic, Type]
  ): PropagatedWindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-user-bounds-changing")(`window-end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-exited")(`window-external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-started")(`window-external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-focused")(`window-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-group-changed")(`window-group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-hidden")(`window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-hotkey")(`window-hotkey`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-initialized")(`window-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-layout-initialized")(`window-layout-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-layout-ready")(`window-layout-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-maximized")(`window-maximized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-minimized")(`window-minimized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-navigation-rejected")(`window-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedWindowEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class PropagatedWindowEventMappingMutableBuilder[Self <: PropagatedWindowEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedWindowEventMapping[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self = StObject.set(x, "window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-blurred`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "window-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "window-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closed`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closing`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-crashed`(value: CrashedEvent with (WindowEvent[Topic, Type])): Self = StObject.set(x, "window-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-embedded`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self = StObject.set(x, "window-end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[Topic, Type]): Self = StObject.set(x, "window-external-process-exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[Topic, Type]): Self = StObject.set(x, "window-external-process-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-focused`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-group-changed`(value: WindowGroupChanged[Topic, Type]): Self = StObject.set(x, "window-group-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hidden`(value: WindowHiddenEvent[Topic, Type]): Self = StObject.set(x, "window-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hotkey`(value: InputEvent with (WindowEvent[Topic, Type])): Self = StObject.set(x, "window-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-initialized`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-initialized`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-layout-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-ready`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-layout-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-maximized`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-minimized`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-minimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self = StObject.set(x, "window-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-options-changed`(value: WindowOptionsChangedEvent[Topic, Type]): Self = StObject.set(x, "window-options-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self = StObject.set(x, "window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[Topic, Type]): Self = StObject.set(x, "window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-reloaded`(value: WindowReloadedEvent[Topic, Type]): Self = StObject.set(x, "window-reloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self = StObject.set(x, "window-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self = StObject.set(x, "window-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-restored`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-shown`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-disabled`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-user-movement-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-enabled`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-user-movement-enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-move`(value: WillMoveOrResize[Topic, Type]): Self = StObject.set(x, "window-will-move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-resize`(value: WillMoveOrResize[Topic, Type]): Self = StObject.set(x, "window-will-resize", value.asInstanceOf[js.Any])
  }
}
