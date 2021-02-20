package typings.openfin

import typings.openfin.applicationMod.ManifestInfo
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinNumbers.`0`
import typings.openfin.openfinNumbers.`1`
import typings.openfin.openfinNumbers.`2`
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsApplicationMod {
  
  @js.native
  trait ApplicationEventMapping[Topic, Type] extends BaseEventMap {
    
    var closed: ApplicationEvent[Topic, Type] = js.native
    
    var connected: ApplicationEvent[Topic, Type] = js.native
    
    var crashed: CrashedEvent with (ApplicationEvent[Topic, Type]) = js.native
    
    var initialized: ApplicationEvent[Topic, Type] = js.native
    
    var `manifest-changed`: ApplicationEvent[Topic, Type] = js.native
    
    var `not-responding`: ApplicationEvent[Topic, Type] = js.native
    
    var responding: ApplicationEvent[Topic, Type] = js.native
    
    var `run-requested`: RunRequestedEvent[Topic, Type] = js.native
    
    var started: ApplicationEvent[Topic, Type] = js.native
    
    var `tray-icon-clicked`: TrayIconClicked[Topic, Type] = js.native
    
    var `window-alert-requested`: WindowAlertRequestedEvent[Topic, Type] = js.native
    
    var `window-auth-requested`: WindowAuthRequestedEvent[Topic, Type] = js.native
    
    var `window-created`: WindowEvent[Topic, Type] = js.native
    
    var `window-end-load`: WindowEndLoadEvent[Topic, Type] = js.native
    
    var `window-not-responding`: WindowEvent[Topic, Type] = js.native
    
    var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
    
    var `window-responding`: WindowEvent[Topic, Type] = js.native
    
    var `window-show-requested`: WindowEvent[Topic, Type] = js.native
    
    var `window-start-load`: WindowEvent[Topic, Type] = js.native
  }
  object ApplicationEventMapping {
    
    @scala.inline
    def apply[Topic, Type](
      closed: ApplicationEvent[Topic, Type],
      connected: ApplicationEvent[Topic, Type],
      crashed: CrashedEvent with (ApplicationEvent[Topic, Type]),
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
    
    @scala.inline
    implicit class ApplicationEventMappingMutableBuilder[Self <: ApplicationEventMapping[_, _], Topic, Type] (val x: Self with (ApplicationEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setClosed(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnected(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashed(value: CrashedEvent with (ApplicationEvent[Topic, Type])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialized(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setManifest-changed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNot-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponding(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRun-requested`(value: RunRequestedEvent[Topic, Type]): Self = StObject.set(x, "run-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = StObject.set(x, "tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[Topic, Type]): Self = StObject.set(x, "window-alert-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self = StObject.set(x, "window-auth-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-show-requested`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-show-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/application.ApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.ApplicationEventMapping<'application', Type>[Type]} */
  @js.native
  trait ApplicationEvents extends StObject {
    
    var closed: ApplicationEvent[application, typings.openfin.openfinStrings.closed] = js.native
    
    var connected: ApplicationEvent[application, typings.openfin.openfinStrings.connected] = js.native
    
    var crashed: CrashedEvent with (ApplicationEvent[application, typings.openfin.openfinStrings.crashed]) = js.native
    
    var initialized: ApplicationEvent[application, typings.openfin.openfinStrings.initialized] = js.native
    
    var listenerRemoved: String = js.native
    
    var `manifest-changed`: ApplicationEvent[application, typings.openfin.openfinStrings.`manifest-changed`] = js.native
    
    var newListener: String = js.native
    
    var `not-responding`: ApplicationEvent[application, typings.openfin.openfinStrings.`not-responding`] = js.native
    
    var responding: ApplicationEvent[application, typings.openfin.openfinStrings.responding] = js.native
    
    var `run-requested`: RunRequestedEvent[application, typings.openfin.openfinStrings.`run-requested`] = js.native
    
    var started: ApplicationEvent[application, typings.openfin.openfinStrings.started] = js.native
    
    var `tray-icon-clicked`: TrayIconClicked[application, typings.openfin.openfinStrings.`tray-icon-clicked`] = js.native
    
    var `view-blurred`: (WindowEvent[application, typings.openfin.openfinStrings.`view-blurred`]) with PropagatedViewIdentity = js.native
    
    var `view-crashed`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-crashed`]) with PropagatedViewIdentity = js.native
    
    var `view-created`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-created`]) with PropagatedViewIdentity = js.native
    
    var `view-destroyed`: (WindowEvent[application, typings.openfin.openfinStrings.`view-destroyed`]) with PropagatedViewIdentity = js.native
    
    var `view-did-change-theme-color`: (WindowEvent[application, typings.openfin.openfinStrings.`view-did-change-theme-color`]) with PropagatedViewIdentity = js.native
    
    var `view-focused`: (WindowEvent[application, typings.openfin.openfinStrings.`view-focused`]) with PropagatedViewIdentity = js.native
    
    var `view-hidden`: (WindowEvent[application, typings.openfin.openfinStrings.`view-hidden`]) with PropagatedViewIdentity = js.native
    
    var `view-hotkey`: InputEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-hotkey`]) with PropagatedViewIdentity = js.native
    
    var `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`view-navigation-rejected`]) with PropagatedViewIdentity = js.native
    
    var `view-page-favicon-updated`: (WindowEvent[application, typings.openfin.openfinStrings.`view-page-favicon-updated`]) with PropagatedViewIdentity = js.native
    
    var `view-page-title-updated`: (WindowEvent[application, typings.openfin.openfinStrings.`view-page-title-updated`]) with PropagatedViewIdentity = js.native
    
    var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`view-resource-load-failed`]) with PropagatedViewIdentity = js.native
    
    var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`view-resource-response-received`]) with PropagatedViewIdentity = js.native
    
    var `view-shown`: (WindowEvent[application, typings.openfin.openfinStrings.`view-shown`]) with PropagatedViewIdentity = js.native
    
    var `view-target-changed`: (TargetChangedEvent[application, typings.openfin.openfinStrings.`view-target-changed`]) with PropagatedViewIdentity = js.native
    
    var `window-alert-requested`: WindowAlertRequestedEvent[application, typings.openfin.openfinStrings.`window-alert-requested`] = js.native
    
    var `window-auth-requested`: WindowAuthRequestedEvent[application, typings.openfin.openfinStrings.`window-auth-requested`] = js.native
    
    var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-begin-user-bounds-changing`] = js.native
    
    var `window-blurred`: WindowEvent[application, typings.openfin.openfinStrings.`window-blurred`] = js.native
    
    var `window-bounds-changed`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changed`] = js.native
    
    var `window-bounds-changing`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changing`] = js.native
    
    var `window-closed`: WindowEvent[application, typings.openfin.openfinStrings.`window-closed`] = js.native
    
    var `window-closing`: WindowEvent[application, typings.openfin.openfinStrings.`window-closing`] = js.native
    
    var `window-crashed`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`window-crashed`]) = js.native
    
    var `window-created`: WindowEvent[application, typings.openfin.openfinStrings.`window-created`] = js.native
    
    var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
      ] = js.native
    
    var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
      ] = js.native
    
    var `window-embedded`: WindowEvent[application, typings.openfin.openfinStrings.`window-embedded`] = js.native
    
    var `window-end-load`: WindowEndLoadEvent[application, typings.openfin.openfinStrings.`window-end-load`] = js.native
    
    var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-end-user-bounds-changing`] = js.native
    
    var `window-external-process-exited`: WindowExternalProcessExitedEvent[application, typings.openfin.openfinStrings.`window-external-process-exited`] = js.native
    
    var `window-external-process-started`: WindowExternalProcessStartedEvent[application, typings.openfin.openfinStrings.`window-external-process-started`] = js.native
    
    var `window-focused`: WindowEvent[application, typings.openfin.openfinStrings.`window-focused`] = js.native
    
    var `window-group-changed`: WindowGroupChanged[application, typings.openfin.openfinStrings.`window-group-changed`] = js.native
    
    var `window-hidden`: WindowHiddenEvent[application, typings.openfin.openfinStrings.`window-hidden`] = js.native
    
    var `window-hotkey`: InputEvent with (WindowEvent[application, typings.openfin.openfinStrings.`window-hotkey`]) = js.native
    
    var `window-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-initialized`] = js.native
    
    var `window-layout-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-initialized`] = js.native
    
    var `window-layout-ready`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-ready`] = js.native
    
    var `window-maximized`: WindowEvent[application, typings.openfin.openfinStrings.`window-maximized`] = js.native
    
    var `window-minimized`: WindowEvent[application, typings.openfin.openfinStrings.`window-minimized`] = js.native
    
    var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`window-navigation-rejected`] = js.native
    
    var `window-not-responding`: WindowEvent[application, typings.openfin.openfinStrings.`window-not-responding`] = js.native
    
    var `window-options-changed`: WindowOptionsChangedEvent[application, typings.openfin.openfinStrings.`window-options-changed`] = js.native
    
    var `window-performance-report`: WindowPerformanceReport[application, typings.openfin.openfinStrings.`window-performance-report`] = js.native
    
    var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, typings.openfin.openfinStrings.`window-preload-scripts-state-changed`] = js.native
    
    var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
        application, 
        typings.openfin.openfinStrings.`window-preload-scripts-state-changing`
      ] = js.native
    
    var `window-reloaded`: WindowReloadedEvent[application, typings.openfin.openfinStrings.`window-reloaded`] = js.native
    
    var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`window-resource-load-failed`] = js.native
    
    var `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`window-resource-response-received`] = js.native
    
    var `window-responding`: WindowEvent[application, typings.openfin.openfinStrings.`window-responding`] = js.native
    
    var `window-restored`: WindowEvent[application, typings.openfin.openfinStrings.`window-restored`] = js.native
    
    var `window-show-requested`: WindowEvent[application, typings.openfin.openfinStrings.`window-show-requested`] = js.native
    
    var `window-shown`: WindowEvent[application, typings.openfin.openfinStrings.`window-shown`] = js.native
    
    var `window-start-load`: WindowEvent[application, typings.openfin.openfinStrings.`window-start-load`] = js.native
    
    var `window-user-movement-disabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-disabled`] = js.native
    
    var `window-user-movement-enabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-enabled`] = js.native
    
    var `window-will-move`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-move`] = js.native
    
    var `window-will-resize`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-resize`] = js.native
  }
  object ApplicationEvents {
    
    @scala.inline
    def apply(
      closed: ApplicationEvent[application, closed],
      connected: ApplicationEvent[application, connected],
      crashed: CrashedEvent with (ApplicationEvent[application, crashed]),
      initialized: ApplicationEvent[application, initialized],
      listenerRemoved: String,
      `manifest-changed`: ApplicationEvent[application, `manifest-changed`],
      newListener: String,
      `not-responding`: ApplicationEvent[application, `not-responding`],
      responding: ApplicationEvent[application, responding],
      `run-requested`: RunRequestedEvent[application, `run-requested`],
      started: ApplicationEvent[application, started],
      `tray-icon-clicked`: TrayIconClicked[application, `tray-icon-clicked`],
      `view-blurred`: (WindowEvent[application, `view-blurred`]) with PropagatedViewIdentity,
      `view-crashed`: CrashedEvent with (WindowEvent[application, `view-crashed`]) with PropagatedViewIdentity,
      `view-created`: CrashedEvent with (WindowEvent[application, `view-created`]) with PropagatedViewIdentity,
      `view-destroyed`: (WindowEvent[application, `view-destroyed`]) with PropagatedViewIdentity,
      `view-did-change-theme-color`: (WindowEvent[application, `view-did-change-theme-color`]) with PropagatedViewIdentity,
      `view-focused`: (WindowEvent[application, `view-focused`]) with PropagatedViewIdentity,
      `view-hidden`: (WindowEvent[application, `view-hidden`]) with PropagatedViewIdentity,
      `view-hotkey`: InputEvent with (WindowEvent[application, `view-hotkey`]) with PropagatedViewIdentity,
      `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) with PropagatedViewIdentity,
      `view-page-favicon-updated`: (WindowEvent[application, `view-page-favicon-updated`]) with PropagatedViewIdentity,
      `view-page-title-updated`: (WindowEvent[application, `view-page-title-updated`]) with PropagatedViewIdentity,
      `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) with PropagatedViewIdentity,
      `view-resource-response-received`: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) with PropagatedViewIdentity,
      `view-shown`: (WindowEvent[application, `view-shown`]) with PropagatedViewIdentity,
      `view-target-changed`: (TargetChangedEvent[application, `view-target-changed`]) with PropagatedViewIdentity,
      `window-alert-requested`: WindowAlertRequestedEvent[application, `window-alert-requested`],
      `window-auth-requested`: WindowAuthRequestedEvent[application, `window-auth-requested`],
      `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
      `window-blurred`: WindowEvent[application, `window-blurred`],
      `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
      `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
      `window-closed`: WindowEvent[application, `window-closed`],
      `window-closing`: WindowEvent[application, `window-closing`],
      `window-crashed`: CrashedEvent with (WindowEvent[application, `window-crashed`]),
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
      `window-hotkey`: InputEvent with (WindowEvent[application, `window-hotkey`]),
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
    
    @scala.inline
    implicit class ApplicationEventsMutableBuilder[Self <: ApplicationEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosed(value: ApplicationEvent[application, closed]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnected(value: ApplicationEvent[application, connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashed(value: CrashedEvent with (ApplicationEvent[application, crashed])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialized(value: ApplicationEvent[application, initialized]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setManifest-changed`(value: ApplicationEvent[application, `manifest-changed`]): Self = StObject.set(x, "manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNot-responding`(value: ApplicationEvent[application, `not-responding`]): Self = StObject.set(x, "not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponding(value: ApplicationEvent[application, responding]): Self = StObject.set(x, "responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRun-requested`(value: RunRequestedEvent[application, `run-requested`]): Self = StObject.set(x, "run-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted(value: ApplicationEvent[application, started]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTray-icon-clicked`(value: TrayIconClicked[application, `tray-icon-clicked`]): Self = StObject.set(x, "tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-blurred`(value: (WindowEvent[application, `view-blurred`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-crashed`(value: CrashedEvent with (WindowEvent[application, `view-crashed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-created`(value: CrashedEvent with (WindowEvent[application, `view-created`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-destroyed`(value: (WindowEvent[application, `view-destroyed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-did-change-theme-color`(value: (WindowEvent[application, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-focused`(value: (WindowEvent[application, `view-focused`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hidden`(value: (WindowEvent[application, `view-hidden`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hotkey`(value: InputEvent with (WindowEvent[application, `view-hotkey`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-navigation-rejected`(
        value: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-favicon-updated`(value: (WindowEvent[application, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-title-updated`(value: (WindowEvent[application, `view-page-title-updated`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-load-failed`(
        value: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-response-received`(
        value: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-shown`(value: (WindowEvent[application, `view-shown`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-target-changed`(value: (TargetChangedEvent[application, `view-target-changed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[application, `window-alert-requested`]): Self = StObject.set(x, "window-alert-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[application, `window-auth-requested`]): Self = StObject.set(x, "window-auth-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`]): Self = StObject.set(x, "window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-blurred`(value: WindowEvent[application, `window-blurred`]): Self = StObject.set(x, "window-blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-bounds-changed`(value: WindowBoundsChange[application, `window-bounds-changed`]): Self = StObject.set(x, "window-bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-bounds-changing`(value: WindowBoundsChange[application, `window-bounds-changing`]): Self = StObject.set(x, "window-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-closed`(value: WindowEvent[application, `window-closed`]): Self = StObject.set(x, "window-closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-closing`(value: WindowEvent[application, `window-closing`]): Self = StObject.set(x, "window-closing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-crashed`(value: CrashedEvent with (WindowEvent[application, `window-crashed`])): Self = StObject.set(x, "window-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[application, `window-created`]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`]): Self = StObject.set(x, "window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`]): Self = StObject.set(x, "window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-embedded`(value: WindowEvent[application, `window-embedded`]): Self = StObject.set(x, "window-embedded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[application, `window-end-load`]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`]): Self = StObject.set(x, "window-end-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[application, `window-external-process-exited`]): Self = StObject.set(x, "window-external-process-exited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[application, `window-external-process-started`]): Self = StObject.set(x, "window-external-process-started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-focused`(value: WindowEvent[application, `window-focused`]): Self = StObject.set(x, "window-focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-group-changed`(value: WindowGroupChanged[application, `window-group-changed`]): Self = StObject.set(x, "window-group-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-hidden`(value: WindowHiddenEvent[application, `window-hidden`]): Self = StObject.set(x, "window-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-hotkey`(value: InputEvent with (WindowEvent[application, `window-hotkey`])): Self = StObject.set(x, "window-hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-initialized`(value: WindowEvent[application, `window-initialized`]): Self = StObject.set(x, "window-initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-layout-initialized`(value: WindowEvent[application, `window-layout-initialized`]): Self = StObject.set(x, "window-layout-initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-layout-ready`(value: WindowEvent[application, `window-layout-ready`]): Self = StObject.set(x, "window-layout-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-maximized`(value: WindowEvent[application, `window-maximized`]): Self = StObject.set(x, "window-maximized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-minimized`(value: WindowEvent[application, `window-minimized`]): Self = StObject.set(x, "window-minimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[application, `window-navigation-rejected`]): Self = StObject.set(x, "window-navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-not-responding`(value: WindowEvent[application, `window-not-responding`]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-options-changed`(value: WindowOptionsChangedEvent[application, `window-options-changed`]): Self = StObject.set(x, "window-options-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(value: WindowPerformanceReport[application, `window-performance-report`]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`]): Self = StObject.set(x, "window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`]): Self = StObject.set(x, "window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-reloaded`(value: WindowReloadedEvent[application, `window-reloaded`]): Self = StObject.set(x, "window-reloaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`]): Self = StObject.set(x, "window-resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`]): Self = StObject.set(x, "window-resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-responding`(value: WindowEvent[application, `window-responding`]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-restored`(value: WindowEvent[application, `window-restored`]): Self = StObject.set(x, "window-restored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-show-requested`(value: WindowEvent[application, `window-show-requested`]): Self = StObject.set(x, "window-show-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-shown`(value: WindowEvent[application, `window-shown`]): Self = StObject.set(x, "window-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[application, `window-start-load`]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-user-movement-disabled`(value: WindowEvent[application, `window-user-movement-disabled`]): Self = StObject.set(x, "window-user-movement-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-user-movement-enabled`(value: WindowEvent[application, `window-user-movement-enabled`]): Self = StObject.set(x, "window-user-movement-enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-will-move`(value: WillMoveOrResize[application, `window-will-move`]): Self = StObject.set(x, "window-will-move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-will-resize`(value: WillMoveOrResize[application, `window-will-resize`]): Self = StObject.set(x, "window-will-resize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CrashedEvent extends StObject {
    
    var reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory` = js.native
  }
  object CrashedEvent {
    
    @scala.inline
    def apply(
      reason: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
    ): CrashedEvent = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrashedEvent]
    }
    
    @scala.inline
    implicit class CrashedEventMutableBuilder[Self <: CrashedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(
        value: `normal-termination` | `abnormal-termination` | killed | crashed | `still-running` | `launch-failed` | `out-of-memory`
      ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropagatedApplicationEventMapping[Topic, Type] extends StObject {
    
    var `application-closed`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-connected`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, Type]) = js.native
    
    var `application-initialized`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-manifest-changed`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-not-responding`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-responding`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-started`: ApplicationEvent[Topic, Type] = js.native
    
    var `application-tray-icon-clicked`: TrayIconClicked[Topic, Type] = js.native
    
    var `window-created`: WindowEvent[Topic, Type] = js.native
    
    var `window-did-change-theme-color`: WindowEvent[Topic, Type] = js.native
    
    var `window-end-load`: WindowEndLoadEvent[Topic, Type] = js.native
    
    var `window-not-responding`: WindowEvent[Topic, Type] = js.native
    
    var `window-page-favicon-updated`: WindowEvent[Topic, Type] = js.native
    
    var `window-page-title-updated`: WindowEvent[Topic, Type] = js.native
    
    var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
    
    var `window-responding`: WindowEvent[Topic, Type] = js.native
    
    var `window-start-load`: WindowEvent[Topic, Type] = js.native
  }
  object PropagatedApplicationEventMapping {
    
    @scala.inline
    def apply[Topic, Type](
      `application-closed`: ApplicationEvent[Topic, Type],
      `application-connected`: ApplicationEvent[Topic, Type],
      `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, Type]),
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
    
    @scala.inline
    implicit class PropagatedApplicationEventMappingMutableBuilder[Self <: PropagatedApplicationEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedApplicationEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def `setApplication-closed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-connected`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[Topic, Type])): Self = StObject.set(x, "application-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-initialized`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-not-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-responding`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-started`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "application-started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, Type]): Self = StObject.set(x, "application-tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, Type]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-not-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-title-updated`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-responding`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<Topic, Type>[Type]} */
  @js.native
  trait PropagatedApplicationEvents[Topic] extends StObject {
    
    var `application-closed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-closed`] = js.native
    
    var `application-connected`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-connected`] = js.native
    
    var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-crashed`]) = js.native
    
    var `application-initialized`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-initialized`] = js.native
    
    var `application-manifest-changed`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-manifest-changed`] = js.native
    
    var `application-not-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-not-responding`] = js.native
    
    var `application-responding`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-responding`] = js.native
    
    var `application-started`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`application-started`] = js.native
    
    var `application-tray-icon-clicked`: TrayIconClicked[Topic, typings.openfin.openfinStrings.`application-tray-icon-clicked`] = js.native
    
    var `window-created`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-created`] = js.native
    
    var `window-did-change-theme-color`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-did-change-theme-color`] = js.native
    
    var `window-end-load`: WindowEndLoadEvent[Topic, typings.openfin.openfinStrings.`window-end-load`] = js.native
    
    var `window-not-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-not-responding`] = js.native
    
    var `window-page-favicon-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-favicon-updated`] = js.native
    
    var `window-page-title-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-page-title-updated`] = js.native
    
    var `window-performance-report`: WindowPerformanceReport[Topic, typings.openfin.openfinStrings.`window-performance-report`] = js.native
    
    var `window-responding`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-responding`] = js.native
    
    var `window-start-load`: WindowEvent[Topic, typings.openfin.openfinStrings.`window-start-load`] = js.native
  }
  object PropagatedApplicationEvents {
    
    @scala.inline
    def apply[Topic](
      `application-closed`: ApplicationEvent[Topic, `application-closed`],
      `application-connected`: ApplicationEvent[Topic, `application-connected`],
      `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`]),
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
    
    @scala.inline
    implicit class PropagatedApplicationEventsMutableBuilder[Self <: PropagatedApplicationEvents[_], Topic] (val x: Self with PropagatedApplicationEvents[Topic]) extends AnyVal {
      
      @scala.inline
      def `setApplication-closed`(value: ApplicationEvent[Topic, `application-closed`]): Self = StObject.set(x, "application-closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-connected`(value: ApplicationEvent[Topic, `application-connected`]): Self = StObject.set(x, "application-connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`])): Self = StObject.set(x, "application-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-initialized`(value: ApplicationEvent[Topic, `application-initialized`]): Self = StObject.set(x, "application-initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-manifest-changed`(value: ApplicationEvent[Topic, `application-manifest-changed`]): Self = StObject.set(x, "application-manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-not-responding`(value: ApplicationEvent[Topic, `application-not-responding`]): Self = StObject.set(x, "application-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-responding`(value: ApplicationEvent[Topic, `application-responding`]): Self = StObject.set(x, "application-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-started`(value: ApplicationEvent[Topic, `application-started`]): Self = StObject.set(x, "application-started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, `application-tray-icon-clicked`]): Self = StObject.set(x, "application-tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[Topic, `window-created`]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-did-change-theme-color`(value: WindowEvent[Topic, `window-did-change-theme-color`]): Self = StObject.set(x, "window-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[Topic, `window-end-load`]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-not-responding`(value: WindowEvent[Topic, `window-not-responding`]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-favicon-updated`(value: WindowEvent[Topic, `window-page-favicon-updated`]): Self = StObject.set(x, "window-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-title-updated`(value: WindowEvent[Topic, `window-page-title-updated`]): Self = StObject.set(x, "window-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-responding`(value: WindowEvent[Topic, `window-responding`]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[Topic, `window-start-load`]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunRequestedEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
    
    var manifest: ManifestInfo = js.native
    
    var userAppConfigArgs: js.Any = js.native
  }
  object RunRequestedEvent {
    
    @scala.inline
    def apply[Topic, Type](manifest: ManifestInfo, topic: Topic, `type`: Type, userAppConfigArgs: js.Any, uuid: String): RunRequestedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], userAppConfigArgs = userAppConfigArgs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunRequestedEvent[Topic, Type]]
    }
    
    @scala.inline
    implicit class RunRequestedEventMutableBuilder[Self <: RunRequestedEvent[_, _], Topic, Type] (val x: Self with (RunRequestedEvent[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setManifest(value: ManifestInfo): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAppConfigArgs(value: js.Any): Self = StObject.set(x, "userAppConfigArgs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrayIconClicked[Topic, Type] extends ApplicationEvent[Topic, Type] {
    
    var bounds: Bounds = js.native
    
    var button: `0` | `1` | `2` = js.native
    
    var monitorInfo: js.Any = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object TrayIconClicked {
    
    @scala.inline
    def apply[Topic, Type](
      bounds: Bounds,
      button: `0` | `1` | `2`,
      monitorInfo: js.Any,
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
    
    @scala.inline
    implicit class TrayIconClickedMutableBuilder[Self <: TrayIconClicked[_, _], Topic, Type] (val x: Self with (TrayIconClicked[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: `0` | `1` | `2`): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorInfo(value: js.Any): Self = StObject.set(x, "monitorInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
