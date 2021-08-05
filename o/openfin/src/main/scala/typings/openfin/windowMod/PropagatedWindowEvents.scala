package typings.openfin.windowMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`window-begin-user-bounds-changing`
import typings.openfin.openfinStrings.`window-blurred`
import typings.openfin.openfinStrings.`window-bounds-changed`
import typings.openfin.openfinStrings.`window-bounds-changing`
import typings.openfin.openfinStrings.`window-closed`
import typings.openfin.openfinStrings.`window-closing`
import typings.openfin.openfinStrings.`window-crashed`
import typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
import typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
import typings.openfin.openfinStrings.`window-embedded`
import typings.openfin.openfinStrings.`window-end-user-bounds-changing`
import typings.openfin.openfinStrings.`window-external-process-exited`
import typings.openfin.openfinStrings.`window-external-process-started`
import typings.openfin.openfinStrings.`window-focused`
import typings.openfin.openfinStrings.`window-group-changed`
import typings.openfin.openfinStrings.`window-hidden`
import typings.openfin.openfinStrings.`window-hotkey`
import typings.openfin.openfinStrings.`window-initialized`
import typings.openfin.openfinStrings.`window-layout-initialized`
import typings.openfin.openfinStrings.`window-layout-ready`
import typings.openfin.openfinStrings.`window-maximized`
import typings.openfin.openfinStrings.`window-minimized`
import typings.openfin.openfinStrings.`window-navigation-rejected`
import typings.openfin.openfinStrings.`window-options-changed`
import typings.openfin.openfinStrings.`window-performance-report`
import typings.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typings.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typings.openfin.openfinStrings.`window-reloaded`
import typings.openfin.openfinStrings.`window-resource-load-failed`
import typings.openfin.openfinStrings.`window-resource-response-received`
import typings.openfin.openfinStrings.`window-restored`
import typings.openfin.openfinStrings.`window-shown`
import typings.openfin.openfinStrings.`window-user-movement-disabled`
import typings.openfin.openfinStrings.`window-user-movement-enabled`
import typings.openfin.openfinStrings.`window-will-move`
import typings.openfin.openfinStrings.`window-will-resize`
import typings.openfin.viewMod.InputEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<Topic, Type>[Type]} */
trait PropagatedWindowEvents[Topic] extends StObject {
  
  var listenerRemoved: String
  
  var newListener: String
  
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typings.openfin.openfinStrings.`window-begin-user-bounds-changing`]
  
  var `window-blurred`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-blurred`]
  
  var `window-bounds-changed`: WindowBoundsChange[Topic, typings.openfin.openfinStrings.`window-bounds-changed`]
  
  var `window-bounds-changing`: WindowBoundsChange[Topic, typings.openfin.openfinStrings.`window-bounds-changing`]
  
  var `window-closed`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-closed`]
  
  var `window-closing`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-closing`]
  
  var `window-crashed`: CrashedEvent & (WindowEvent[Topic, typings.openfin.openfinStrings.`window-crashed`])
  
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`]
  
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`]
  
  var `window-embedded`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-embedded`]
  
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typings.openfin.openfinStrings.`window-end-user-bounds-changing`]
  
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, typings.openfin.openfinStrings.`window-external-process-exited`]
  
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, typings.openfin.openfinStrings.`window-external-process-started`]
  
  var `window-focused`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-focused`]
  
  var `window-group-changed`: WindowGroupChanged[Topic, typings.openfin.openfinStrings.`window-group-changed`]
  
  var `window-hidden`: WindowHiddenEvent[Topic, typings.openfin.openfinStrings.`window-hidden`]
  
  var `window-hotkey`: InputEvent & (WindowEvent[Topic, typings.openfin.openfinStrings.`window-hotkey`])
  
  var `window-initialized`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-initialized`]
  
  var `window-layout-initialized`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-layout-initialized`]
  
  var `window-layout-ready`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-layout-ready`]
  
  var `window-maximized`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-maximized`]
  
  var `window-minimized`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-minimized`]
  
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, typings.openfin.openfinStrings.`window-navigation-rejected`]
  
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, typings.openfin.openfinStrings.`window-options-changed`]
  
  var `window-performance-report`: WindowPerformanceReport[Topic, typings.openfin.openfinStrings.`window-performance-report`]
  
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, typings.openfin.openfinStrings.`window-preload-scripts-state-changed`]
  
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, typings.openfin.openfinStrings.`window-preload-scripts-state-changing`]
  
  var `window-reloaded`: WindowReloadedEvent[Topic, typings.openfin.openfinStrings.`window-reloaded`]
  
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, typings.openfin.openfinStrings.`window-resource-load-failed`]
  
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, typings.openfin.openfinStrings.`window-resource-response-received`]
  
  var `window-restored`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-restored`]
  
  var `window-shown`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-shown`]
  
  var `window-user-movement-disabled`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-user-movement-disabled`]
  
  var `window-user-movement-enabled`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-user-movement-enabled`]
  
  var `window-will-move`: WillMoveOrResize[Topic, typings.openfin.openfinStrings.`window-will-move`]
  
  var `window-will-resize`: WillMoveOrResize[Topic, typings.openfin.openfinStrings.`window-will-resize`]
}
object PropagatedWindowEvents {
  
  inline def apply[Topic](
    listenerRemoved: String,
    newListener: String,
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[Topic, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[Topic, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[Topic, `window-bounds-changing`],
    `window-closed`: WindowEvent[Topic, `window-closed`],
    `window-closing`: WindowEvent[Topic, `window-closing`],
    `window-crashed`: CrashedEvent & (WindowEvent[Topic, `window-crashed`]),
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[Topic, `window-embedded`],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, `window-end-user-bounds-changing`],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, `window-external-process-exited`],
    `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, `window-external-process-started`],
    `window-focused`: WindowEvent[Topic, `window-focused`],
    `window-group-changed`: WindowGroupChanged[Topic, `window-group-changed`],
    `window-hidden`: WindowHiddenEvent[Topic, `window-hidden`],
    `window-hotkey`: InputEvent & (WindowEvent[Topic, `window-hotkey`]),
    `window-initialized`: WindowEvent[Topic, `window-initialized`],
    `window-layout-initialized`: WindowEvent[Topic, `window-layout-initialized`],
    `window-layout-ready`: WindowEvent[Topic, `window-layout-ready`],
    `window-maximized`: WindowEvent[Topic, `window-maximized`],
    `window-minimized`: WindowEvent[Topic, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, `window-navigation-rejected`],
    `window-options-changed`: WindowOptionsChangedEvent[Topic, `window-options-changed`],
    `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[Topic, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, `window-resource-response-received`],
    `window-restored`: WindowEvent[Topic, `window-restored`],
    `window-shown`: WindowEvent[Topic, `window-shown`],
    `window-user-movement-disabled`: WindowEvent[Topic, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[Topic, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[Topic, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[Topic, `window-will-resize`]
  ): PropagatedWindowEvents[Topic] = {
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
    __obj.asInstanceOf[PropagatedWindowEvents[Topic]]
  }
  
  extension [Self <: PropagatedWindowEvents[?], Topic](x: Self & PropagatedWindowEvents[Topic]) {
    
    inline def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
    
    inline def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
    
    inline def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, `window-begin-user-bounds-changing`]): Self = StObject.set(x, "window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-blurred`(value: WindowEvent[Topic, `window-blurred`]): Self = StObject.set(x, "window-blurred", value.asInstanceOf[js.Any])
    
    inline def `setWindow-bounds-changed`(value: WindowBoundsChange[Topic, `window-bounds-changed`]): Self = StObject.set(x, "window-bounds-changed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-bounds-changing`(value: WindowBoundsChange[Topic, `window-bounds-changing`]): Self = StObject.set(x, "window-bounds-changing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-closed`(value: WindowEvent[Topic, `window-closed`]): Self = StObject.set(x, "window-closed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-closing`(value: WindowEvent[Topic, `window-closing`]): Self = StObject.set(x, "window-closing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-crashed`(value: CrashedEvent & (WindowEvent[Topic, `window-crashed`])): Self = StObject.set(x, "window-crashed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changed`]): Self = StObject.set(x, "window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changing`]): Self = StObject.set(x, "window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-embedded`(value: WindowEvent[Topic, `window-embedded`]): Self = StObject.set(x, "window-embedded", value.asInstanceOf[js.Any])
    
    inline def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, `window-end-user-bounds-changing`]): Self = StObject.set(x, "window-end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[Topic, `window-external-process-exited`]): Self = StObject.set(x, "window-external-process-exited", value.asInstanceOf[js.Any])
    
    inline def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[Topic, `window-external-process-started`]): Self = StObject.set(x, "window-external-process-started", value.asInstanceOf[js.Any])
    
    inline def `setWindow-focused`(value: WindowEvent[Topic, `window-focused`]): Self = StObject.set(x, "window-focused", value.asInstanceOf[js.Any])
    
    inline def `setWindow-group-changed`(value: WindowGroupChanged[Topic, `window-group-changed`]): Self = StObject.set(x, "window-group-changed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-hidden`(value: WindowHiddenEvent[Topic, `window-hidden`]): Self = StObject.set(x, "window-hidden", value.asInstanceOf[js.Any])
    
    inline def `setWindow-hotkey`(value: InputEvent & (WindowEvent[Topic, `window-hotkey`])): Self = StObject.set(x, "window-hotkey", value.asInstanceOf[js.Any])
    
    inline def `setWindow-initialized`(value: WindowEvent[Topic, `window-initialized`]): Self = StObject.set(x, "window-initialized", value.asInstanceOf[js.Any])
    
    inline def `setWindow-layout-initialized`(value: WindowEvent[Topic, `window-layout-initialized`]): Self = StObject.set(x, "window-layout-initialized", value.asInstanceOf[js.Any])
    
    inline def `setWindow-layout-ready`(value: WindowEvent[Topic, `window-layout-ready`]): Self = StObject.set(x, "window-layout-ready", value.asInstanceOf[js.Any])
    
    inline def `setWindow-maximized`(value: WindowEvent[Topic, `window-maximized`]): Self = StObject.set(x, "window-maximized", value.asInstanceOf[js.Any])
    
    inline def `setWindow-minimized`(value: WindowEvent[Topic, `window-minimized`]): Self = StObject.set(x, "window-minimized", value.asInstanceOf[js.Any])
    
    inline def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, `window-navigation-rejected`]): Self = StObject.set(x, "window-navigation-rejected", value.asInstanceOf[js.Any])
    
    inline def `setWindow-options-changed`(value: WindowOptionsChangedEvent[Topic, `window-options-changed`]): Self = StObject.set(x, "window-options-changed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
    
    inline def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, `window-preload-scripts-state-changed`]): Self = StObject.set(x, "window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[Topic, `window-preload-scripts-state-changing`]): Self = StObject.set(x, "window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    inline def `setWindow-reloaded`(value: WindowReloadedEvent[Topic, `window-reloaded`]): Self = StObject.set(x, "window-reloaded", value.asInstanceOf[js.Any])
    
    inline def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, `window-resource-load-failed`]): Self = StObject.set(x, "window-resource-load-failed", value.asInstanceOf[js.Any])
    
    inline def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, `window-resource-response-received`]): Self = StObject.set(x, "window-resource-response-received", value.asInstanceOf[js.Any])
    
    inline def `setWindow-restored`(value: WindowEvent[Topic, `window-restored`]): Self = StObject.set(x, "window-restored", value.asInstanceOf[js.Any])
    
    inline def `setWindow-shown`(value: WindowEvent[Topic, `window-shown`]): Self = StObject.set(x, "window-shown", value.asInstanceOf[js.Any])
    
    inline def `setWindow-user-movement-disabled`(value: WindowEvent[Topic, `window-user-movement-disabled`]): Self = StObject.set(x, "window-user-movement-disabled", value.asInstanceOf[js.Any])
    
    inline def `setWindow-user-movement-enabled`(value: WindowEvent[Topic, `window-user-movement-enabled`]): Self = StObject.set(x, "window-user-movement-enabled", value.asInstanceOf[js.Any])
    
    inline def `setWindow-will-move`(value: WillMoveOrResize[Topic, `window-will-move`]): Self = StObject.set(x, "window-will-move", value.asInstanceOf[js.Any])
    
    inline def `setWindow-will-resize`(value: WillMoveOrResize[Topic, `window-will-resize`]): Self = StObject.set(x, "window-will-resize", value.asInstanceOf[js.Any])
  }
}
