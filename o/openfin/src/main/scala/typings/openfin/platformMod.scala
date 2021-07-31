package typings.openfin

import typings.openfin.eventsApplicationMod.ApplicationEventMapping
import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsApplicationMod.PropagatedApplicationEventMapping
import typings.openfin.eventsApplicationMod.RunRequestedEvent
import typings.openfin.eventsApplicationMod.TrayIconClicked
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`platform-api-ready`
import typings.openfin.openfinStrings.`platform-snapshot-applied`
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
import typings.openfin.openfinStrings.application
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

object platformMod {
  
  trait PlatformEventMapping[Topic, Type]
    extends StObject
       with ApplicationEventMapping[String, String] {
    
    var `platform-api-ready`: ApplicationEvent[Topic, Type]
    
    var `platform-snapshot-applied`: ApplicationEvent[Topic, Type]
  }
  object PlatformEventMapping {
    
    @scala.inline
    def apply[Topic, Type](
      closed: ApplicationEvent[String, String],
      connected: ApplicationEvent[String, String],
      crashed: CrashedEvent & (ApplicationEvent[String, String]),
      initialized: ApplicationEvent[String, String],
      listenerRemoved: String,
      `manifest-changed`: ApplicationEvent[String, String],
      newListener: String,
      `not-responding`: ApplicationEvent[String, String],
      `platform-api-ready`: ApplicationEvent[Topic, Type],
      `platform-snapshot-applied`: ApplicationEvent[Topic, Type],
      responding: ApplicationEvent[String, String],
      `run-requested`: RunRequestedEvent[String, String],
      started: ApplicationEvent[String, String],
      `tray-icon-clicked`: TrayIconClicked[String, String],
      `window-alert-requested`: WindowAlertRequestedEvent[String, String],
      `window-auth-requested`: WindowAuthRequestedEvent[String, String],
      `window-created`: WindowEvent[String, String],
      `window-end-load`: WindowEndLoadEvent[String, String],
      `window-not-responding`: WindowEvent[String, String],
      `window-performance-report`: WindowPerformanceReport[String, String],
      `window-responding`: WindowEvent[String, String],
      `window-show-requested`: WindowEvent[String, String],
      `window-start-load`: WindowEvent[String, String]
    ): PlatformEventMapping[Topic, Type] = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
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
      __obj.asInstanceOf[PlatformEventMapping[Topic, Type]]
    }
    
    @scala.inline
    implicit class PlatformEventMappingMutableBuilder[Self <: PlatformEventMapping[?, ?], Topic, Type] (val x: Self & (PlatformEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def `setPlatform-api-ready`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "platform-api-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-snapshot-applied`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "platform-snapshot-applied", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/platform.PlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PlatformEventMapping<'application', Type>[Type]} */
  trait PlatformEvents extends StObject {
    
    var closed: ApplicationEvent[String, String]
    
    var connected: ApplicationEvent[String, String]
    
    var crashed: CrashedEvent & (ApplicationEvent[String, String])
    
    var initialized: ApplicationEvent[String, String]
    
    var listenerRemoved: String
    
    var `manifest-changed`: ApplicationEvent[String, String]
    
    var newListener: String
    
    var `not-responding`: ApplicationEvent[String, String]
    
    var `platform-api-ready`: ApplicationEvent[application, typings.openfin.openfinStrings.`platform-api-ready`]
    
    var `platform-snapshot-applied`: ApplicationEvent[application, typings.openfin.openfinStrings.`platform-snapshot-applied`]
    
    var responding: ApplicationEvent[String, String]
    
    var `run-requested`: RunRequestedEvent[String, String]
    
    var started: ApplicationEvent[String, String]
    
    var `tray-icon-clicked`: TrayIconClicked[String, String]
    
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
    
    var `window-alert-requested`: WindowAlertRequestedEvent[String, String]
    
    var `window-auth-requested`: WindowAuthRequestedEvent[String, String]
    
    var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-begin-user-bounds-changing`]
    
    var `window-blurred`: WindowEvent[application, typings.openfin.openfinStrings.`window-blurred`]
    
    var `window-bounds-changed`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changed`]
    
    var `window-bounds-changing`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changing`]
    
    var `window-closed`: WindowEvent[application, typings.openfin.openfinStrings.`window-closed`]
    
    var `window-closing`: WindowEvent[application, typings.openfin.openfinStrings.`window-closing`]
    
    var `window-crashed`: CrashedEvent & (WindowEvent[application, typings.openfin.openfinStrings.`window-crashed`])
    
    var `window-created`: WindowEvent[String, String]
    
    var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
      ]
    
    var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
        application, 
        typings.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
      ]
    
    var `window-embedded`: WindowEvent[application, typings.openfin.openfinStrings.`window-embedded`]
    
    var `window-end-load`: WindowEndLoadEvent[String, String]
    
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
    
    var `window-not-responding`: WindowEvent[String, String]
    
    var `window-options-changed`: WindowOptionsChangedEvent[application, typings.openfin.openfinStrings.`window-options-changed`]
    
    var `window-performance-report`: (WindowPerformanceReport[application, typings.openfin.openfinStrings.`window-performance-report`]) & (WindowPerformanceReport[String, String])
    
    var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, typings.openfin.openfinStrings.`window-preload-scripts-state-changed`]
    
    var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
        application, 
        typings.openfin.openfinStrings.`window-preload-scripts-state-changing`
      ]
    
    var `window-reloaded`: WindowReloadedEvent[application, typings.openfin.openfinStrings.`window-reloaded`]
    
    var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`window-resource-load-failed`]
    
    var `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`window-resource-response-received`]
    
    var `window-responding`: WindowEvent[String, String]
    
    var `window-restored`: WindowEvent[application, typings.openfin.openfinStrings.`window-restored`]
    
    var `window-show-requested`: WindowEvent[String, String]
    
    var `window-shown`: WindowEvent[application, typings.openfin.openfinStrings.`window-shown`]
    
    var `window-start-load`: WindowEvent[String, String]
    
    var `window-user-movement-disabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-disabled`]
    
    var `window-user-movement-enabled`: WindowEvent[application, typings.openfin.openfinStrings.`window-user-movement-enabled`]
    
    var `window-will-move`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-move`]
    
    var `window-will-resize`: WillMoveOrResize[application, typings.openfin.openfinStrings.`window-will-resize`]
  }
  object PlatformEvents {
    
    @scala.inline
    def apply(
      closed: ApplicationEvent[String, String],
      connected: ApplicationEvent[String, String],
      crashed: CrashedEvent & (ApplicationEvent[String, String]),
      initialized: ApplicationEvent[String, String],
      listenerRemoved: String,
      `manifest-changed`: ApplicationEvent[String, String],
      newListener: String,
      `not-responding`: ApplicationEvent[String, String],
      `platform-api-ready`: ApplicationEvent[application, `platform-api-ready`],
      `platform-snapshot-applied`: ApplicationEvent[application, `platform-snapshot-applied`],
      responding: ApplicationEvent[String, String],
      `run-requested`: RunRequestedEvent[String, String],
      started: ApplicationEvent[String, String],
      `tray-icon-clicked`: TrayIconClicked[String, String],
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
      `window-alert-requested`: WindowAlertRequestedEvent[String, String],
      `window-auth-requested`: WindowAuthRequestedEvent[String, String],
      `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
      `window-blurred`: WindowEvent[application, `window-blurred`],
      `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
      `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
      `window-closed`: WindowEvent[application, `window-closed`],
      `window-closing`: WindowEvent[application, `window-closing`],
      `window-crashed`: CrashedEvent & (WindowEvent[application, `window-crashed`]),
      `window-created`: WindowEvent[String, String],
      `window-disabled-movement-bounds-changed`: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`],
      `window-disabled-movement-bounds-changing`: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`],
      `window-embedded`: WindowEvent[application, `window-embedded`],
      `window-end-load`: WindowEndLoadEvent[String, String],
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
      `window-not-responding`: WindowEvent[String, String],
      `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
      `window-performance-report`: (WindowPerformanceReport[application, `window-performance-report`]) & (WindowPerformanceReport[String, String]),
      `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`],
      `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`],
      `window-reloaded`: WindowReloadedEvent[application, `window-reloaded`],
      `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`],
      `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`],
      `window-responding`: WindowEvent[String, String],
      `window-restored`: WindowEvent[application, `window-restored`],
      `window-show-requested`: WindowEvent[String, String],
      `window-shown`: WindowEvent[application, `window-shown`],
      `window-start-load`: WindowEvent[String, String],
      `window-user-movement-disabled`: WindowEvent[application, `window-user-movement-disabled`],
      `window-user-movement-enabled`: WindowEvent[application, `window-user-movement-enabled`],
      `window-will-move`: WillMoveOrResize[application, `window-will-move`],
      `window-will-resize`: WillMoveOrResize[application, `window-will-resize`]
    ): PlatformEvents = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
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
      __obj.asInstanceOf[PlatformEvents]
    }
    
    @scala.inline
    implicit class PlatformEventsMutableBuilder[Self <: PlatformEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosed(value: ApplicationEvent[String, String]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnected(value: ApplicationEvent[String, String]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashed(value: CrashedEvent & (ApplicationEvent[String, String])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialized(value: ApplicationEvent[String, String]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setManifest-changed`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNot-responding`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-api-ready`(value: ApplicationEvent[application, `platform-api-ready`]): Self = StObject.set(x, "platform-api-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-snapshot-applied`(value: ApplicationEvent[application, `platform-snapshot-applied`]): Self = StObject.set(x, "platform-snapshot-applied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponding(value: ApplicationEvent[String, String]): Self = StObject.set(x, "responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRun-requested`(value: RunRequestedEvent[String, String]): Self = StObject.set(x, "run-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted(value: ApplicationEvent[String, String]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTray-icon-clicked`(value: TrayIconClicked[String, String]): Self = StObject.set(x, "tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-blurred`(value: (WindowEvent[application, `view-blurred`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-crashed`(value: CrashedEvent & (WindowEvent[application, `view-crashed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-created`(value: CrashedEvent & (WindowEvent[application, `view-created`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-destroyed`(value: (WindowEvent[application, `view-destroyed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-did-change-theme-color`(value: (WindowEvent[application, `view-did-change-theme-color`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-focused`(value: (WindowEvent[application, `view-focused`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hidden`(value: (WindowEvent[application, `view-hidden`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hotkey`(value: InputEvent & (WindowEvent[application, `view-hotkey`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-navigation-rejected`(
        value: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-favicon-updated`(value: (WindowEvent[application, `view-page-favicon-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-title-updated`(value: (WindowEvent[application, `view-page-title-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-load-failed`(
        value: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-response-received`(
        value: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-shown`(value: (WindowEvent[application, `view-shown`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-target-changed`(value: (TargetChangedEvent[application, `view-target-changed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[String, String]): Self = StObject.set(x, "window-alert-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[String, String]): Self = StObject.set(x, "window-auth-requested", value.asInstanceOf[js.Any])
      
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
      def `setWindow-crashed`(value: CrashedEvent & (WindowEvent[application, `window-crashed`])): Self = StObject.set(x, "window-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`]): Self = StObject.set(x, "window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`]): Self = StObject.set(x, "window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-embedded`(value: WindowEvent[application, `window-embedded`]): Self = StObject.set(x, "window-embedded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[String, String]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
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
      def `setWindow-hotkey`(value: InputEvent & (WindowEvent[application, `window-hotkey`])): Self = StObject.set(x, "window-hotkey", value.asInstanceOf[js.Any])
      
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
      def `setWindow-not-responding`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-options-changed`(value: WindowOptionsChangedEvent[application, `window-options-changed`]): Self = StObject.set(x, "window-options-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(
        value: (WindowPerformanceReport[application, `window-performance-report`]) & (WindowPerformanceReport[String, String])
      ): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
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
      def `setWindow-responding`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-restored`(value: WindowEvent[application, `window-restored`]): Self = StObject.set(x, "window-restored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-show-requested`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-show-requested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-shown`(value: WindowEvent[application, `window-shown`]): Self = StObject.set(x, "window-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
      
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
  
  trait PropagatedPlatformEventMapping[Topic, Type]
    extends StObject
       with PropagatedApplicationEventMapping[String, String] {
    
    var `platform-api-ready`: ApplicationEvent[Topic, Type]
    
    var `platform-snapshot-applied`: ApplicationEvent[Topic, Type]
  }
  object PropagatedPlatformEventMapping {
    
    @scala.inline
    def apply[Topic, Type](
      `application-closed`: ApplicationEvent[String, String],
      `application-connected`: ApplicationEvent[String, String],
      `application-crashed`: CrashedEvent & (ApplicationEvent[String, String]),
      `application-initialized`: ApplicationEvent[String, String],
      `application-manifest-changed`: ApplicationEvent[String, String],
      `application-not-responding`: ApplicationEvent[String, String],
      `application-responding`: ApplicationEvent[String, String],
      `application-started`: ApplicationEvent[String, String],
      `application-tray-icon-clicked`: TrayIconClicked[String, String],
      `platform-api-ready`: ApplicationEvent[Topic, Type],
      `platform-snapshot-applied`: ApplicationEvent[Topic, Type],
      `window-created`: WindowEvent[String, String],
      `window-did-change-theme-color`: WindowEvent[String, String],
      `window-end-load`: WindowEndLoadEvent[String, String],
      `window-not-responding`: WindowEvent[String, String],
      `window-page-favicon-updated`: WindowEvent[String, String],
      `window-page-title-updated`: WindowEvent[String, String],
      `window-performance-report`: WindowPerformanceReport[String, String],
      `window-responding`: WindowEvent[String, String],
      `window-start-load`: WindowEvent[String, String]
    ): PropagatedPlatformEventMapping[Topic, Type] = {
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
      __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedPlatformEventMapping[Topic, Type]]
    }
    
    @scala.inline
    implicit class PropagatedPlatformEventMappingMutableBuilder[Self <: PropagatedPlatformEventMapping[?, ?], Topic, Type] (val x: Self & (PropagatedPlatformEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def `setPlatform-api-ready`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "platform-api-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-snapshot-applied`(value: ApplicationEvent[Topic, Type]): Self = StObject.set(x, "platform-snapshot-applied", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PropagatedPlatformEventMapping<Topic, Type>[Type]} */
  trait PropagatedPlatformEvents[Topic] extends StObject {
    
    var `application-closed`: ApplicationEvent[String, String]
    
    var `application-connected`: ApplicationEvent[String, String]
    
    var `application-crashed`: CrashedEvent & (ApplicationEvent[String, String])
    
    var `application-initialized`: ApplicationEvent[String, String]
    
    var `application-manifest-changed`: ApplicationEvent[String, String]
    
    var `application-not-responding`: ApplicationEvent[String, String]
    
    var `application-responding`: ApplicationEvent[String, String]
    
    var `application-started`: ApplicationEvent[String, String]
    
    var `application-tray-icon-clicked`: TrayIconClicked[String, String]
    
    var `platform-api-ready`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-api-ready`]
    
    var `platform-snapshot-applied`: ApplicationEvent[Topic, typings.openfin.openfinStrings.`platform-snapshot-applied`]
    
    var `window-created`: WindowEvent[String, String]
    
    var `window-did-change-theme-color`: WindowEvent[String, String]
    
    var `window-end-load`: WindowEndLoadEvent[String, String]
    
    var `window-not-responding`: WindowEvent[String, String]
    
    var `window-page-favicon-updated`: WindowEvent[String, String]
    
    var `window-page-title-updated`: WindowEvent[String, String]
    
    var `window-performance-report`: WindowPerformanceReport[String, String]
    
    var `window-responding`: WindowEvent[String, String]
    
    var `window-start-load`: WindowEvent[String, String]
  }
  object PropagatedPlatformEvents {
    
    @scala.inline
    def apply[Topic](
      `application-closed`: ApplicationEvent[String, String],
      `application-connected`: ApplicationEvent[String, String],
      `application-crashed`: CrashedEvent & (ApplicationEvent[String, String]),
      `application-initialized`: ApplicationEvent[String, String],
      `application-manifest-changed`: ApplicationEvent[String, String],
      `application-not-responding`: ApplicationEvent[String, String],
      `application-responding`: ApplicationEvent[String, String],
      `application-started`: ApplicationEvent[String, String],
      `application-tray-icon-clicked`: TrayIconClicked[String, String],
      `platform-api-ready`: ApplicationEvent[Topic, `platform-api-ready`],
      `platform-snapshot-applied`: ApplicationEvent[Topic, `platform-snapshot-applied`],
      `window-created`: WindowEvent[String, String],
      `window-did-change-theme-color`: WindowEvent[String, String],
      `window-end-load`: WindowEndLoadEvent[String, String],
      `window-not-responding`: WindowEvent[String, String],
      `window-page-favicon-updated`: WindowEvent[String, String],
      `window-page-title-updated`: WindowEvent[String, String],
      `window-performance-report`: WindowPerformanceReport[String, String],
      `window-responding`: WindowEvent[String, String],
      `window-start-load`: WindowEvent[String, String]
    ): PropagatedPlatformEvents[Topic] = {
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
      __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
      __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedPlatformEvents[Topic]]
    }
    
    @scala.inline
    implicit class PropagatedPlatformEventsMutableBuilder[Self <: PropagatedPlatformEvents[?], Topic] (val x: Self & PropagatedPlatformEvents[Topic]) extends AnyVal {
      
      @scala.inline
      def `setApplication-closed`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-connected`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-crashed`(value: CrashedEvent & (ApplicationEvent[String, String])): Self = StObject.set(x, "application-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-initialized`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-initialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-manifest-changed`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-manifest-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-not-responding`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-responding`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-started`(value: ApplicationEvent[String, String]): Self = StObject.set(x, "application-started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setApplication-tray-icon-clicked`(value: TrayIconClicked[String, String]): Self = StObject.set(x, "application-tray-icon-clicked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-api-ready`(value: ApplicationEvent[Topic, `platform-api-ready`]): Self = StObject.set(x, "platform-api-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlatform-snapshot-applied`(value: ApplicationEvent[Topic, `platform-snapshot-applied`]): Self = StObject.set(x, "platform-snapshot-applied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-created`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-did-change-theme-color`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-end-load`(value: WindowEndLoadEvent[String, String]): Self = StObject.set(x, "window-end-load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-not-responding`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-not-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-favicon-updated`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-page-title-updated`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-performance-report`(value: WindowPerformanceReport[String, String]): Self = StObject.set(x, "window-performance-report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-responding`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-responding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWindow-start-load`(value: WindowEvent[String, String]): Self = StObject.set(x, "window-start-load", value.asInstanceOf[js.Any])
    }
  }
}
