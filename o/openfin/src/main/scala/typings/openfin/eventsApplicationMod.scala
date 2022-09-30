package typings.openfin

import typings.openfin.applicationMod.ManifestInfo
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinInts.`0`
import typings.openfin.openfinInts.`1`
import typings.openfin.openfinInts.`2`
import typings.openfin.openfinStrings.`abnormal-termination`
import typings.openfin.openfinStrings.`application-closed`
import typings.openfin.openfinStrings.`application-connected`
import typings.openfin.openfinStrings.`application-crashed`
import typings.openfin.openfinStrings.`application-initialized`
import typings.openfin.openfinStrings.`application-manifest-changed`
import typings.openfin.openfinStrings.`application-not-responding`
import typings.openfin.openfinStrings.`application-responding`
import typings.openfin.openfinStrings.`application-started`
import typings.openfin.openfinStrings.`application-tray-icon-clicked`
import typings.openfin.openfinStrings.`launch-failed`
import typings.openfin.openfinStrings.`manifest-changed`
import typings.openfin.openfinStrings.`normal-termination`
import typings.openfin.openfinStrings.`not-responding`
import typings.openfin.openfinStrings.`out-of-memory`
import typings.openfin.openfinStrings.`run-requested`
import typings.openfin.openfinStrings.`still-running`
import typings.openfin.openfinStrings.`tray-icon-clicked`
import typings.openfin.openfinStrings.`view-blurred`
import typings.openfin.openfinStrings.`view-crashed`
import typings.openfin.openfinStrings.`view-created`
import typings.openfin.openfinStrings.`view-destroyed`
import typings.openfin.openfinStrings.`view-did-change-theme-color`
import typings.openfin.openfinStrings.`view-focused`
import typings.openfin.openfinStrings.`view-hidden`
import typings.openfin.openfinStrings.`view-hotkey`
import typings.openfin.openfinStrings.`view-navigation-rejected`
import typings.openfin.openfinStrings.`view-page-favicon-updated`
import typings.openfin.openfinStrings.`view-page-title-updated`
import typings.openfin.openfinStrings.`view-resource-load-failed`
import typings.openfin.openfinStrings.`view-resource-response-received`
import typings.openfin.openfinStrings.`view-shown`
import typings.openfin.openfinStrings.`view-target-changed`
import typings.openfin.openfinStrings.`window-alert-requested`
import typings.openfin.openfinStrings.`window-auth-requested`
import typings.openfin.openfinStrings.`window-begin-user-bounds-changing`
import typings.openfin.openfinStrings.`window-blurred`
import typings.openfin.openfinStrings.`window-bounds-changed`
import typings.openfin.openfinStrings.`window-bounds-changing`
import typings.openfin.openfinStrings.`window-closed`
import typings.openfin.openfinStrings.`window-closing`
import typings.openfin.openfinStrings.`window-crashed`
import typings.openfin.openfinStrings.`window-created`
import typings.openfin.openfinStrings.`window-did-change-theme-color`
import typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
import typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
import typings.openfin.openfinStrings.`window-embedded`
import typings.openfin.openfinStrings.`window-end-load`
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
import typings.openfin.openfinStrings.`window-not-responding`
import typings.openfin.openfinStrings.`window-options-changed`
import typings.openfin.openfinStrings.`window-page-favicon-updated`
import typings.openfin.openfinStrings.`window-page-title-updated`
import typings.openfin.openfinStrings.`window-performance-report`
import typings.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typings.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typings.openfin.openfinStrings.`window-reloaded`
import typings.openfin.openfinStrings.`window-resource-load-failed`
import typings.openfin.openfinStrings.`window-resource-response-received`
import typings.openfin.openfinStrings.`window-responding`
import typings.openfin.openfinStrings.`window-restored`
import typings.openfin.openfinStrings.`window-show-requested`
import typings.openfin.openfinStrings.`window-shown`
import typings.openfin.openfinStrings.`window-start-load`
import typings.openfin.openfinStrings.`window-user-movement-disabled`
import typings.openfin.openfinStrings.`window-user-movement-enabled`
import typings.openfin.openfinStrings.`window-will-move`
import typings.openfin.openfinStrings.`window-will-resize`
import typings.openfin.openfinStrings.application
import typings.openfin.openfinStrings.closed
import typings.openfin.openfinStrings.connected
import typings.openfin.openfinStrings.crashed
import typings.openfin.openfinStrings.initialized
import typings.openfin.openfinStrings.killed
import typings.openfin.openfinStrings.responding
import typings.openfin.openfinStrings.started
import typings.openfin.shapesMod.Bounds
import typings.openfin.viewMod.InputEvent
import typings.openfin.viewMod.PropagatedViewIdentity
import typings.openfin.viewMod.TargetChangedEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WillMoveOrResize
import typings.openfin.windowMod.WindowAlertRequestedEvent
import typings.openfin.windowMod.WindowAuthRequestedEvent
import typings.openfin.windowMod.WindowBeginBoundsChangingEvent
import typings.openfin.windowMod.WindowBoundsChange
import typings.openfin.windowMod.WindowEndLoadEvent
import typings.openfin.windowMod.WindowExternalProcessExitedEvent
import typings.openfin.windowMod.WindowExternalProcessStartedEvent
import typings.openfin.windowMod.WindowGroupChanged
import typings.openfin.windowMod.WindowHiddenEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import typings.openfin.windowMod.WindowOptionsChangedEvent
import typings.openfin.windowMod.WindowPerformanceReport
import typings.openfin.windowMod.WindowPreloadScriptsStateChangeEvent
import typings.openfin.windowMod.WindowPreloadScriptsStateChangedEvent
import typings.openfin.windowMod.WindowReloadedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsApplicationMod {
  
  trait ApplicationEventMapping[Topic, Type]
    extends StObject
       with BaseEventMap {
    
    var closed: ApplicationEvent[Topic, Type]
    
    var connected: ApplicationEvent[Topic, Type]
    
    var crashed: CrashedEvent & (ApplicationEvent[Topic, Type])
    
    var initialized: ApplicationEvent[Topic, Type]
    
    var `manifest-changed`: ApplicationEvent[Topic, Type]
    
    var `not-responding`: ApplicationEvent[Topic, Type]
    
    var responding: ApplicationEvent[Topic, Type]
    
    var `run-requested`: RunRequestedEvent[Topic, Type]
    
    var started: ApplicationEvent[Topic, Type]
    
    var `tray-icon-clicked`: TrayIconClicked[Topic, Type]
    
    var `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type]
    
    var `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type]
    
    var `window-created`: WindowEvent[Topic, Type]
    
    var `window-end-load`: WindowEndLoadEvent[Topic, Type]
    
    var `window-not-responding`: WindowEvent[Topic, Type]
    
    var `window-performance-report`: WindowPerformanceReport[Topic, Type]
    
    var `window-responding`: WindowEvent[Topic, Type]
    
    var `window-show-requested`: WindowEvent[Topic, Type]
    
    var `window-start-load`: WindowEvent[Topic, Type]
  }
  object ApplicationEventMapping {
    
    inline def apply[Topic, Type](
      closed: ApplicationEvent[Topic, Type],
      connected: ApplicationEvent[Topic, Type],
      crashed: CrashedEvent & (ApplicationEvent[Topic, Type]),
      initialized: ApplicationEvent[Topic, Type],
      listenerRemoved: String,
      `manifest-changed`: ApplicationEvent[Topic, Type],
      newListener: String,
      `not-responding`: ApplicationEvent[Topic, Type],
      responding: ApplicationEvent[Topic, Type],
      `run-requested`: RunRequestedEvent[Topic, Type],
      started: ApplicationEvent[Topic, Type],
      `tray-icon-clicked`: TrayIconClicked[Topic, Type],
      `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type],
      `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type],
      `window-created`: WindowEvent[Topic, Type],
      `window-end-load`: WindowEndLoadEvent[Topic, Type],
      `window-not-responding`: WindowEvent[Topic, Type],
      `window-performance-report`: WindowPerformanceReport[Topic, Type],
      `window-responding`: WindowEvent[Topic, Type],
      `window-show-requested`: WindowEvent[Topic, Type],
      `window-start-load`: WindowEvent[Topic, Type]
    ): ApplicationEventMapping[Topic, Type] = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-alert-requested")(`window-alert-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-auth-requested")(`window-auth-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-show-requested")(`window-show-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEventMapping[Topic, Type]]
    }
    
    extension [Self <: ApplicationEventMapping[?, ?], Topic, Type](x: Self & (ApplicationEventMapping[Topic, Type])) {
      
      inline def setClosed(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setConnected(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setCrashed(value: CrashedEvent & (ApplicationEvent[Topic, Type])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def `setManifest-changed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "manifest-changed", value.asInstanceOf[js.Any])
      
      inline def `setNot-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "not-responding", value.asInstanceOf[js.Any])
      
      inline def setResponding(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "responding", value.asInstanceOf[js.Any])
      
      inline def `setRun-requested`(value: RunRequestedEvent[Topic, Type]): Self = StObject.set(x, "run-requested", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def `setTray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = StObject.set(x, "tray-icon-clicked", value.asInstanceOf[js.Any])
      
      inline def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[Topic, Type]): Self = StObject.set(x, "window-alert-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self = StObject.set(x, "window-auth-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      inline def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      inline def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      inline def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-show-requested`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-show-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/application.ApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.ApplicationEventMapping<'application', Type>[Type]} */
  trait ApplicationEvents extends StObject {
    
    var closed: ApplicationEvent[application, typings.openfin.openfinStrings.closed]
    
    var connected: ApplicationEvent[application, typings.openfin.openfinStrings.connected]
    
    var crashed: CrashedEvent & (ApplicationEvent[application, typings.openfin.openfinStrings.crashed])
    
    var initialized: ApplicationEvent[application, typings.openfin.openfinStrings.initialized]
    
    var listenerRemoved: String
    
    var `manifest-changed`: ApplicationEvent[application, typings.openfin.openfinStrings.`manifest-changed`]
    
    var newListener: String
    
    var `not-responding`: ApplicationEvent[application, typings.openfin.openfinStrings.`not-responding`]
    
    var responding: ApplicationEvent[application, typings.openfin.openfinStrings.responding]
    
    var `run-requested`: RunRequestedEvent[application, typings.openfin.openfinStrings.`run-requested`]
    
    var started: ApplicationEvent[application, typings.openfin.openfinStrings.started]
    
    var `tray-icon-clicked`: TrayIconClicked[application, typings.openfin.openfinStrings.`tray-icon-clicked`]
    
    var `view-blurred`: (WindowEvent[application, typings.openfin.openfinStrings.`view-blurred`]) & PropagatedViewIdentity
    
    var `view-crashed`: CrashedEvent & (WindowEvent[application, typings.openfin.openfinStrings.`view-crashed`]) & PropagatedViewIdentity
    
    var `view-created`: CrashedEvent & (WindowEvent[application, typings.openfin.openfinStrings.`view-created`]) & PropagatedViewIdentity
    
    var `view-destroyed`: (WindowEvent[application, typings.openfin.openfinStrings.`view-destroyed`]) & PropagatedViewIdentity
    
    var `view-did-change-theme-color`: (WindowEvent[application, typings.openfin.openfinStrings.`view-did-change-theme-color`]) & PropagatedViewIdentity
    
    var `view-focused`: (WindowEvent[application, typings.openfin.openfinStrings.`view-focused`]) & PropagatedViewIdentity
    
    var `view-hidden`: (WindowEvent[application, typings.openfin.openfinStrings.`view-hidden`]) & PropagatedViewIdentity
    
    var `view-hotkey`: InputEvent & (WindowEvent[application, typings.openfin.openfinStrings.`view-hotkey`]) & PropagatedViewIdentity
    
    var `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`view-navigation-rejected`]) & PropagatedViewIdentity
    
    var `view-page-favicon-updated`: (WindowEvent[application, typings.openfin.openfinStrings.`view-page-favicon-updated`]) & PropagatedViewIdentity
    
    var `view-page-title-updated`: (WindowEvent[application, typings.openfin.openfinStrings.`view-page-title-updated`]) & PropagatedViewIdentity
    
    var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`view-resource-load-failed`]) & PropagatedViewIdentity
    
    var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`view-resource-response-received`]) & PropagatedViewIdentity
    
    var `view-shown`: (WindowEvent[application, typings.openfin.openfinStrings.`view-shown`]) & PropagatedViewIdentity
    
    var `view-target-changed`: (TargetChangedEvent[application, typings.openfin.openfinStrings.`view-target-changed`]) & PropagatedViewIdentity
    
    var `window-alert-requested`: WindowAlertRequestedEvent[application, typings.openfin.openfinStrings.`window-alert-requested`]
    
    var `window-auth-requested`: WindowAuthRequestedEvent[application, typings.openfin.openfinStrings.`window-auth-requested`]
    
    var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-begin-user-bounds-changing`]
    
    var `window-blurred`: WindowEvent[application, typings.openfin.openfinStrings.`window-blurred`]
    
    var `window-bounds-changed`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changed`]
    
    var `window-bounds-changing`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changing`]
    
    var `window-closed`: WindowEvent[application, typings.openfin.openfinStrings.`window-closed`]
    
    var `window-closing`: WindowEvent[application, typings.openfin.openfinStrings.`window-closing`]
    
    var `window-crashed`: CrashedEvent & (WindowEvent[application, typings.openfin.openfinStrings.`window-crashed`])
    
    var `window-created`: WindowEvent[application, typings.openfin.openfinStrings.`window-created`]
    
    var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
      ]
    
    var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
      ]
    
    var `window-embedded`: WindowEvent[application, typings.openfin.openfinStrings.`window-embedded`]
    
    var `window-end-load`: WindowEndLoadEvent[application, typings.openfin.openfinStrings.`window-end-load`]
    
    var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-end-user-bounds-changing`]
    
    var `window-external-process-exited`: WindowExternalProcessExitedEvent[application, typings.openfin.openfinStrings.`window-external-process-exited`]
    
    var `window-external-process-started`: WindowExternalProcessStartedEvent[application, typings.openfin.openfinStrings.`window-external-process-started`]
    
    var `window-focused`: WindowEvent[application, typings.openfin.openfinStrings.`window-focused`]
    
    var `window-group-changed`: WindowGroupChanged[application, typings.openfin.openfinStrings.`window-group-changed`]
    
    var `window-hidden`: WindowHiddenEvent[application, typings.openfin.openfinStrings.`window-hidden`]
    
    var `window-hotkey`: InputEvent & (WindowEvent[application, typings.openfin.openfinStrings.`window-hotkey`])
    
    var `window-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-initialized`]
    
    var `window-layout-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-initialized`]
    
    var `window-layout-ready`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-ready`]
    
    var `window-maximized`: WindowEvent[application, typings.openfin.openfinStrings.`window-maximized`]
    
    var `window-minimized`: WindowEvent[application, typings.openfin.openfinStrings.`window-minimized`]
    
    var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`window-navigation-rejected`]
    
    var `window-not-responding`: WindowEvent[application, typings.openfin.openfinStrings.`window-not-responding`]
    
    var `window-options-changed`: WindowOptionsChangedEvent[application, typings.openfin.openfinStrings.`window-options-changed`]
    
    var `window-performance-report`: WindowPerformanceReport[application, typings.openfin.openfinStrings.`window-performance-report`]
    
    var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, typings.openfin.openfinStrings.`window-preload-scripts-state-changed`]
    
    var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
        application, 
        typings.openfin.openfinStrings.`window-preload-scripts-state-changing`
      ]
    
    var `window-reloaded`: WindowReloadedEvent[application, typings.openfin.openfinStrings.`window-reloaded`]
    
    var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`window-resource-load-failed`]
    
    var `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`window-resource-response-received`]
    
    var `window-responding`: WindowEvent[application, typings.openfin.openfinStrings.`window-responding`]
    
    var `window-restored`: WindowEvent[application, typings.openfin.openfinStrings.`window-restored`]
    
    var `window-show-requested`: WindowEvent[application, typings.openfin.openfinStrings.`window-show-requested`]
    
    var `window-shown`: WindowEvent[application, typings.openfin.openfinStrings.`window-shown`]
    
    var `window-start-load`: WindowEvent[application, typings.openfin.openfinStrings.`window-start-load`]
    
    var `window-user-movement-disabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-disabled`]
    
    var `window-user-movement-enabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-enabled`]
    
    var `window-will-move`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-move`]
    
    var `window-will-resize`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-resize`]
  }
  object ApplicationEvents {
    
    inline def apply(
      closed: ApplicationEvent[application, closed],
      connected: ApplicationEvent[application, connected],
      crashed: CrashedEvent & (ApplicationEvent[application, crashed]),
      initialized: ApplicationEvent[application, initialized],
      listenerRemoved: String,
      `manifest-changed`: ApplicationEvent[application, `manifest-changed`],
      newListener: String,
      `not-responding`: ApplicationEvent[application, `not-responding`],
      responding: ApplicationEvent[application, responding],
      `run-requested`: RunRequestedEvent[application, `run-requested`],
      started: ApplicationEvent[application, started],
      `tray-icon-clicked`: TrayIconClicked[application, `tray-icon-clicked`],
      `view-blurred`: (WindowEvent[application, `view-blurred`]) & PropagatedViewIdentity,
      `view-crashed`: CrashedEvent & (WindowEvent[application, `view-crashed`]) & PropagatedViewIdentity,
      `view-created`: CrashedEvent & (WindowEvent[application, `view-created`]) & PropagatedViewIdentity,
      `view-destroyed`: (WindowEvent[application, `view-destroyed`]) & PropagatedViewIdentity,
      `view-did-change-theme-color`: (WindowEvent[application, `view-did-change-theme-color`]) & PropagatedViewIdentity,
      `view-focused`: (WindowEvent[application, `view-focused`]) & PropagatedViewIdentity,
      `view-hidden`: (WindowEvent[application, `view-hidden`]) & PropagatedViewIdentity,
      `view-hotkey`: InputEvent & (WindowEvent[application, `view-hotkey`]) & PropagatedViewIdentity,
      `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) & PropagatedViewIdentity,
      `view-page-favicon-updated`: (WindowEvent[application, `view-page-favicon-updated`]) & PropagatedViewIdentity,
      `view-page-title-updated`: (WindowEvent[application, `view-page-title-updated`]) & PropagatedViewIdentity,
      `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) & PropagatedViewIdentity,
      `view-resource-response-received`: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) & PropagatedViewIdentity,
      `view-shown`: (WindowEvent[application, `view-shown`]) & PropagatedViewIdentity,
      `view-target-changed`: (TargetChangedEvent[application, `view-target-changed`]) & PropagatedViewIdentity,
      `window-alert-requested`: WindowAlertRequestedEvent[application, `window-alert-requested`],
      `window-auth-requested`: WindowAuthRequestedEvent[application, `window-auth-requested`],
      `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
      `window-blurred`: WindowEvent[application, `window-blurred`],
      `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
      `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
      `window-closed`: WindowEvent[application, `window-closed`],
      `window-closing`: WindowEvent[application, `window-closing`],
      `window-crashed`: CrashedEvent & (WindowEvent[application, `window-crashed`]),
      `window-created`: WindowEvent[application, `window-created`],
      `window-disabled-movement-bounds-changed`: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`],
      `window-disabled-movement-bounds-changing`: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`],
      `window-embedded`: WindowEvent[application, `window-embedded`],
      `window-end-load`: WindowEndLoadEvent[application, `window-end-load`],
      `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`],
      `window-external-process-exited`: WindowExternalProcessExitedEvent[application, `window-external-process-exited`],
      `window-external-process-started`: WindowExternalProcessStartedEvent[application, `window-external-process-started`],
      `window-focused`: WindowEvent[application, `window-focused`],
      `window-group-changed`: WindowGroupChanged[application, `window-group-changed`],
      `window-hidden`: WindowHiddenEvent[application, `window-hidden`],
      `window-hotkey`: InputEvent & (WindowEvent[application, `window-hotkey`]),
      `window-initialized`: WindowEvent[application, `window-initialized`],
      `window-layout-initialized`: WindowEvent[application, `window-layout-initialized`],
      `window-layout-ready`: WindowEvent[application, `window-layout-ready`],
      `window-maximized`: WindowEvent[application, `window-maximized`],
      `window-minimized`: WindowEvent[application, `window-minimized`],
      `window-navigation-rejected`: WindowNavigationRejectedEvent[application, `window-navigation-rejected`],
      `window-not-responding`: WindowEvent[application, `window-not-responding`],
      `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
      `window-performance-report`: WindowPerformanceReport[application, `window-performance-report`],
      `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`],
      `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`],
      `window-reloaded`: WindowReloadedEvent[application, `window-reloaded`],
      `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`],
      `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`],
      `window-responding`: WindowEvent[application, `window-responding`],
      `window-restored`: WindowEvent[application, `window-restored`],
      `window-show-requested`: WindowEvent[application, `window-show-requested`],
      `window-shown`: WindowEvent[application, `window-shown`],
      `window-start-load`: WindowEvent[application, `window-start-load`],
      `window-user-movement-disabled`: WindowEvent[application, `window-user-movement-disabled`],
      `window-user-movement-enabled`: WindowEvent[application, `window-user-movement-enabled`],
      `window-will-move`: WillMoveOrResize[application, `window-will-move`],
      `window-will-resize`: WillMoveOrResize[application, `window-will-resize`]
    ): ApplicationEvents = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-blurred")(`view-blurred`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-focused")(`view-focused`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-hotkey")(`view-hotkey`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
      __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-alert-requested")(`window-alert-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-auth-requested")(`window-auth-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
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
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-show-requested")(`window-show-requested`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEvents]
    }
    
    extension [Self <: ApplicationEvents](x: Self) {
      
      inline def setClosed(value: ApplicationEvent[application, closed]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setConnected(value: ApplicationEvent[application, connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setCrashed(value: CrashedEvent & (ApplicationEvent[application, crashed])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setInitialized(value: ApplicationEvent[application, initialized]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      inline def `setManifest-changed`(value: ApplicationEvent[application, `manifest-changed`]): Self = StObject.set(x, "manifest-changed", value.asInstanceOf[js.Any])
      
      inline def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def `setNot-responding`(value: ApplicationEvent[application, `not-responding`]): Self = StObject.set(x, "not-responding", value.asInstanceOf[js.Any])
      
      inline def setResponding(value: ApplicationEvent[application, responding]): Self = StObject.set(x, "responding", value.asInstanceOf[js.Any])
      
      inline def `setRun-requested`(value: RunRequestedEvent[application, `run-requested`]): Self = StObject.set(x, "run-requested", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: ApplicationEvent[application, started]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def `setTray-icon-clicked`(value: TrayIconClicked[application, `tray-icon-clicked`]): Self = StObject.set(x, "tray-icon-clicked", value.asInstanceOf[js.Any])
      
      inline def `setView-blurred`(value: (WindowEvent[application, `view-blurred`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      inline def `setView-crashed`(value: CrashedEvent & (WindowEvent[application, `view-crashed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      inline def `setView-created`(value: CrashedEvent & (WindowEvent[application, `view-created`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      inline def `setView-destroyed`(value: (WindowEvent[application, `view-destroyed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      inline def `setView-did-change-theme-color`(value: (WindowEvent[application, `view-did-change-theme-color`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def `setView-focused`(value: (WindowEvent[application, `view-focused`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      inline def `setView-hidden`(value: (WindowEvent[application, `view-hidden`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      inline def `setView-hotkey`(value: InputEvent & (WindowEvent[application, `view-hotkey`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      inline def `setView-navigation-rejected`(
        value: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def `setView-page-favicon-updated`(value: (WindowEvent[application, `view-page-favicon-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-page-title-updated`(value: (WindowEvent[application, `view-page-title-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-load-failed`(
        value: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-response-received`(
        value: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      inline def `setView-shown`(value: (WindowEvent[application, `view-shown`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      inline def `setView-target-changed`(value: (TargetChangedEvent[application, `view-target-changed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[application, `window-alert-requested`]): Self = StObject.set(x, "window-alert-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[application, `window-auth-requested`]): Self = StObject.set(x, "window-auth-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`]): Self = StObject.set(x, "window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-blurred`(value: WindowEvent[application, `window-blurred`]): Self = StObject.set(x, "window-blurred", value.asInstanceOf[js.Any])
      
      inline def `setWindow-bounds-changed`(value: WindowBoundsChange[application, `window-bounds-changed`]): Self = StObject.set(x, "window-bounds-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-bounds-changing`(value: WindowBoundsChange[application, `window-bounds-changing`]): Self = StObject.set(x, "window-bounds-changing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-closed`(value: WindowEvent[application, `window-closed`]): Self = StObject.set(x, "window-closed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-closing`(value: WindowEvent[application, `window-closing`]): Self = StObject.set(x, "window-closing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-crashed`(value: CrashedEvent & (WindowEvent[application, `window-crashed`])): Self = StObject.set(x, "window-crashed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-created`(value: WindowEvent[application, `window-created`]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      inline def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`]): Self = StObject.set(x, "window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`]): Self = StObject.set(x, "window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-embedded`(value: WindowEvent[application, `window-embedded`]): Self = StObject.set(x, "window-embedded", value.asInstanceOf[js.Any])
      
      inline def `setWindow-end-load`(value: WindowEndLoadEvent[application, `window-end-load`]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      inline def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`]): Self = StObject.set(x, "window-end-user-bounds-changing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[application, `window-external-process-exited`]): Self = StObject.set(x, "window-external-process-exited", value.asInstanceOf[js.Any])
      
      inline def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[application, `window-external-process-started`]): Self = StObject.set(x, "window-external-process-started", value.asInstanceOf[js.Any])
      
      inline def `setWindow-focused`(value: WindowEvent[application, `window-focused`]): Self = StObject.set(x, "window-focused", value.asInstanceOf[js.Any])
      
      inline def `setWindow-group-changed`(value: WindowGroupChanged[application, `window-group-changed`]): Self = StObject.set(x, "window-group-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-hidden`(value: WindowHiddenEvent[application, `window-hidden`]): Self = StObject.set(x, "window-hidden", value.asInstanceOf[js.Any])
      
      inline def `setWindow-hotkey`(value: InputEvent & (WindowEvent[application, `window-hotkey`])): Self = StObject.set(x, "window-hotkey", value.asInstanceOf[js.Any])
      
      inline def `setWindow-initialized`(value: WindowEvent[application, `window-initialized`]): Self = StObject.set(x, "window-initialized", value.asInstanceOf[js.Any])
      
      inline def `setWindow-layout-initialized`(value: WindowEvent[application, `window-layout-initialized`]): Self = StObject.set(x, "window-layout-initialized", value.asInstanceOf[js.Any])
      
      inline def `setWindow-layout-ready`(value: WindowEvent[application, `window-layout-ready`]): Self = StObject.set(x, "window-layout-ready", value.asInstanceOf[js.Any])
      
      inline def `setWindow-maximized`(value: WindowEvent[application, `window-maximized`]): Self = StObject.set(x, "window-maximized", value.asInstanceOf[js.Any])
      
      inline def `setWindow-minimized`(value: WindowEvent[application, `window-minimized`]): Self = StObject.set(x, "window-minimized", value.asInstanceOf[js.Any])
      
      inline def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[application, `window-navigation-rejected`]): Self = StObject.set(x, "window-navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def `setWindow-not-responding`(value: WindowEvent[application, `window-not-responding`]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-options-changed`(value: WindowOptionsChangedEvent[application, `window-options-changed`]): Self = StObject.set(x, "window-options-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-performance-report`(value: WindowPerformanceReport[application, `window-performance-report`]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      inline def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`]): Self = StObject.set(x, "window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`]): Self = StObject.set(x, "window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
      
      inline def `setWindow-reloaded`(value: WindowReloadedEvent[application, `window-reloaded`]): Self = StObject.set(x, "window-reloaded", value.asInstanceOf[js.Any])
      
      inline def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`]): Self = StObject.set(x, "window-resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`]): Self = StObject.set(x, "window-resource-response-received", value.asInstanceOf[js.Any])
      
      inline def `setWindow-responding`(value: WindowEvent[application, `window-responding`]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-restored`(value: WindowEvent[application, `window-restored`]): Self = StObject.set(x, "window-restored", value.asInstanceOf[js.Any])
      
      inline def `setWindow-show-requested`(value: WindowEvent[application, `window-show-requested`]): Self = StObject.set(x, "window-show-requested", value.asInstanceOf[js.Any])
      
      inline def `setWindow-shown`(value: WindowEvent[application, `window-shown`]): Self = StObject.set(x, "window-shown", value.asInstanceOf[js.Any])
      
      inline def `setWindow-start-load`(value: WindowEvent[application, `window-start-load`]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
      
      inline def `setWindow-user-movement-disabled`(value: WindowEvent[application, `window-user-movement-disabled`]): Self = StObject.set(x, "window-user-movement-disabled", value.asInstanceOf[js.Any])
      
      inline def `setWindow-user-movement-enabled`(value: WindowEvent[application, `window-user-movement-enabled`]): Self = StObject.set(x, "window-user-movement-enabled", value.asInstanceOf[js.Any])
      
      inline def `setWindow-will-move`(value: WillMoveOrResize[application, `window-will-move`]): Self = StObject.set(x, "window-will-move", value.asInstanceOf[js.Any])
      
      inline def `setWindow-will-resize`(value: WillMoveOrResize[application, `window-will-resize`]): Self = StObject.set(x, "window-will-resize", value.asInstanceOf[js.Any])
    }
  }
  
  trait CrashedEvent extends StObject {
    
    var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
  }
  object CrashedEvent {
    
    inline def apply(
      reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
    ): CrashedEvent = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrashedEvent]
    }
    
    extension [Self <: CrashedEvent](x: Self) {
      
      inline def setReason(
        value: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
      ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropagatedApplicationEventMapping[Topic, Type] extends StObject {
    
    var `application-closed`: ApplicationEvent[Topic, Type]
    
    var `application-connected`: ApplicationEvent[Topic, Type]
    
    var `application-crashed`: CrashedEvent & (ApplicationEvent[Topic, Type])
    
    var `application-initialized`: ApplicationEvent[Topic, Type]
    
    var `application-manifest-changed`: ApplicationEvent[Topic, Type]
    
    var `application-not-responding`: ApplicationEvent[Topic, Type]
    
    var `application-responding`: ApplicationEvent[Topic, Type]
    
    var `application-started`: ApplicationEvent[Topic, Type]
    
    var `application-tray-icon-clicked`: TrayIconClicked[Topic, Type]
    
    var `window-created`: WindowEvent[Topic, Type]
    
    var `window-did-change-theme-color`: WindowEvent[Topic, Type]
    
    var `window-end-load`: WindowEndLoadEvent[Topic, Type]
    
    var `window-not-responding`: WindowEvent[Topic, Type]
    
    var `window-page-favicon-updated`: WindowEvent[Topic, Type]
    
    var `window-page-title-updated`: WindowEvent[Topic, Type]
    
    var `window-performance-report`: WindowPerformanceReport[Topic, Type]
    
    var `window-responding`: WindowEvent[Topic, Type]
    
    var `window-start-load`: WindowEvent[Topic, Type]
  }
  object PropagatedApplicationEventMapping {
    
    inline def apply[Topic, Type](
      `application-closed`: ApplicationEvent[Topic, Type],
      `application-connected`: ApplicationEvent[Topic, Type],
      `application-crashed`: CrashedEvent & (ApplicationEvent[Topic, Type]),
      `application-initialized`: ApplicationEvent[Topic, Type],
      `application-manifest-changed`: ApplicationEvent[Topic, Type],
      `application-not-responding`: ApplicationEvent[Topic, Type],
      `application-responding`: ApplicationEvent[Topic, Type],
      `application-started`: ApplicationEvent[Topic, Type],
      `application-tray-icon-clicked`: TrayIconClicked[Topic, Type],
      `window-created`: WindowEvent[Topic, Type],
      `window-did-change-theme-color`: WindowEvent[Topic, Type],
      `window-end-load`: WindowEndLoadEvent[Topic, Type],
      `window-not-responding`: WindowEvent[Topic, Type],
      `window-page-favicon-updated`: WindowEvent[Topic, Type],
      `window-page-title-updated`: WindowEvent[Topic, Type],
      `window-performance-report`: WindowPerformanceReport[Topic, Type],
      `window-responding`: WindowEvent[Topic, Type],
      `window-start-load`: WindowEvent[Topic, Type]
    ): PropagatedApplicationEventMapping[Topic, Type] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedApplicationEventMapping[Topic, Type]]
    }
    
    extension [Self <: PropagatedApplicationEventMapping[?, ?], Topic, Type](x: Self & (PropagatedApplicationEventMapping[Topic, Type])) {
      
      inline def `setApplication-closed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-closed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-connected`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-connected", value.asInstanceOf[js.Any])
      
      inline def `setApplication-crashed`(value: CrashedEvent & (ApplicationEvent[Topic, Type])): Self = StObject.set(x, "application-crashed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-initialized`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-initialized", value.asInstanceOf[js.Any])
      
      inline def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-manifest-changed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-not-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setApplication-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-responding", value.asInstanceOf[js.Any])
      
      inline def `setApplication-started`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-started", value.asInstanceOf[js.Any])
      
      inline def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = StObject.set(x, "application-tray-icon-clicked", value.asInstanceOf[js.Any])
      
      inline def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      inline def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      inline def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setWindow-page-title-updated`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      inline def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<Topic, Type>[Type]} */
  trait PropagatedApplicationEvents[Topic] extends StObject {
    
    var `application-closed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-closed`]
    
    var `application-connected`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-connected`]
    
    var `application-crashed`: CrashedEvent & (ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-crashed`])
    
    var `application-initialized`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-initialized`]
    
    var `application-manifest-changed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-manifest-changed`]
    
    var `application-not-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-not-responding`]
    
    var `application-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-responding`]
    
    var `application-started`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-started`]
    
    var `application-tray-icon-clicked`: TrayIconClicked[Topic, typings.openfin.openfinStrings.`application-tray-icon-clicked`]
    
    var `window-created`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-created`]
    
    var `window-did-change-theme-color`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-did-change-theme-color`]
    
    var `window-end-load`: WindowEndLoadEvent[Topic, typings.openfin.openfinStrings.`window-end-load`]
    
    var `window-not-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-not-responding`]
    
    var `window-page-favicon-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-favicon-updated`]
    
    var `window-page-title-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-title-updated`]
    
    var `window-performance-report`: WindowPerformanceReport[Topic, typings.openfin.openfinStrings.`window-performance-report`]
    
    var `window-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-responding`]
    
    var `window-start-load`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-start-load`]
  }
  object PropagatedApplicationEvents {
    
    inline def apply[Topic](
      `application-closed`: ApplicationEvent[Topic, `application-closed`],
      `application-connected`: ApplicationEvent[Topic, `application-connected`],
      `application-crashed`: CrashedEvent & (ApplicationEvent[Topic, `application-crashed`]),
      `application-initialized`: ApplicationEvent[Topic, `application-initialized`],
      `application-manifest-changed`: ApplicationEvent[Topic, `application-manifest-changed`],
      `application-not-responding`: ApplicationEvent[Topic, `application-not-responding`],
      `application-responding`: ApplicationEvent[Topic, `application-responding`],
      `application-started`: ApplicationEvent[Topic, `application-started`],
      `application-tray-icon-clicked`: TrayIconClicked[Topic, `application-tray-icon-clicked`],
      `window-created`: WindowEvent[Topic, `window-created`],
      `window-did-change-theme-color`: WindowEvent[Topic, `window-did-change-theme-color`],
      `window-end-load`: WindowEndLoadEvent[Topic, `window-end-load`],
      `window-not-responding`: WindowEvent[Topic, `window-not-responding`],
      `window-page-favicon-updated`: WindowEvent[Topic, `window-page-favicon-updated`],
      `window-page-title-updated`: WindowEvent[Topic, `window-page-title-updated`],
      `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
      `window-responding`: WindowEvent[Topic, `window-responding`],
      `window-start-load`: WindowEvent[Topic, `window-start-load`]
    ): PropagatedApplicationEvents[Topic] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
      __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedApplicationEvents[Topic]]
    }
    
    extension [Self <: PropagatedApplicationEvents[?], Topic](x: Self & PropagatedApplicationEvents[Topic]) {
      
      inline def `setApplication-closed`(value: ApplicationEvent[Topic, `application-closed`]): Self = StObject.set(x, "application-closed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-connected`(value: ApplicationEvent[Topic, `application-connected`]): Self = StObject.set(x, "application-connected", value.asInstanceOf[js.Any])
      
      inline def `setApplication-crashed`(value: CrashedEvent & (ApplicationEvent[Topic, `application-crashed`])): Self = StObject.set(x, "application-crashed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-initialized`(value: ApplicationEvent[Topic, `application-initialized`]): Self = StObject.set(x, "application-initialized", value.asInstanceOf[js.Any])
      
      inline def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, `application-manifest-changed`]): Self = StObject.set(x, "application-manifest-changed", value.asInstanceOf[js.Any])
      
      inline def `setApplication-not-responding`(value: ApplicationEvent[Topic, `application-not-responding`]): Self = StObject.set(x, "application-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setApplication-responding`(value: ApplicationEvent[Topic, `application-responding`]): Self = StObject.set(x, "application-responding", value.asInstanceOf[js.Any])
      
      inline def `setApplication-started`(value: ApplicationEvent[Topic, `application-started`]): Self = StObject.set(x, "application-started", value.asInstanceOf[js.Any])
      
      inline def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, `application-tray-icon-clicked`]): Self = StObject.set(x, "application-tray-icon-clicked", value.asInstanceOf[js.Any])
      
      inline def `setWindow-created`(value: WindowEvent[Topic, `window-created`]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      inline def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, `window-did-change-theme-color`]): Self = StObject.set(x, "window-did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, `window-end-load`]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      inline def `setWindow-not-responding`(value: WindowEvent[Topic, `window-not-responding`]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, `window-page-favicon-updated`]): Self = StObject.set(x, "window-page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setWindow-page-title-updated`(value: WindowEvent[Topic, `window-page-title-updated`]): Self = StObject.set(x, "window-page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      inline def `setWindow-responding`(value: WindowEvent[Topic, `window-responding`]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      inline def `setWindow-start-load`(value: WindowEvent[Topic, `window-start-load`]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunRequestedEvent[Topic, Type]
    extends StObject
       with ApplicationEvent[Topic, Type] {
    
    var manifest: ManifestInfo
    
    var userAppConfigArgs: Any
  }
  object RunRequestedEvent {
    
    inline def apply[Topic, Type](manifest: ManifestInfo, topic: Topic, `type`: Type, userAppConfigArgs: Any, uuid: String): RunRequestedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], userAppConfigArgs = userAppConfigArgs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunRequestedEvent[Topic, Type]]
    }
    
    extension [Self <: RunRequestedEvent[?, ?], Topic, Type](x: Self & (RunRequestedEvent[Topic, Type])) {
      
      inline def setManifest(value: ManifestInfo): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setUserAppConfigArgs(value: Any): Self = StObject.set(x, "userAppConfigArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrayIconClicked[Topic, Type]
    extends StObject
       with ApplicationEvent[Topic, Type] {
    
    var bounds: Bounds
    
    var button: `0` | `1` | `2`
    
    var monitorInfo: Any
    
    var x: Double
    
    var y: Double
  }
  object TrayIconClicked {
    
    inline def apply[Topic, Type](
      bounds: Bounds,
      button: `0` | `1` | `2`,
      monitorInfo: Any,
      topic: Topic,
      `type`: Type,
      uuid: String,
      x: Double,
      y: Double
    ): TrayIconClicked[Topic, Type] = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrayIconClicked[Topic, Type]]
    }
    
    extension [Self <: TrayIconClicked[?, ?], Topic, Type](x: Self & (TrayIconClicked[Topic, Type])) {
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setButton(value: `0` | `1` | `2`): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setMonitorInfo(value: Any): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
