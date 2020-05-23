package typings.openfin.platformMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsApplicationMod.RunRequestedEvent
import typings.openfin.eventsApplicationMod.TrayIconClicked
import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`platform-api-ready`
import typings.openfin.openfinStrings.`platform-snapshot-applied`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/platform.PlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PlatformEventMapping<'application', Type>[Type]} */
trait PlatformEvents extends js.Object {
  var closed: ApplicationEvent[String, String]
  var connected: ApplicationEvent[String, String]
  var crashed: CrashedEvent with (ApplicationEvent[String, String])
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
  var `view-crashed`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-crashed`])
  var `view-created`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-created`])
  var `view-destroyed`: WindowEvent[application, typings.openfin.openfinStrings.`view-destroyed`]
  var `view-did-change-theme-color`: WindowEvent[application, typings.openfin.openfinStrings.`view-did-change-theme-color`]
  var `view-focused`: WindowEvent[application, typings.openfin.openfinStrings.`view-focused`]
  var `view-hidden`: WindowEvent[application, typings.openfin.openfinStrings.`view-hidden`]
  var `view-hotkey`: InputEvent with (WindowEvent[application, typings.openfin.openfinStrings.`view-hotkey`])
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`view-navigation-rejected`]
  var `view-page-favicon-updated`: WindowEvent[application, typings.openfin.openfinStrings.`view-page-favicon-updated`]
  var `view-page-title-updated`: WindowEvent[application, typings.openfin.openfinStrings.`view-page-title-updated`]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, typings.openfin.openfinStrings.`view-resource-load-failed`]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[application, typings.openfin.openfinStrings.`view-resource-response-received`]
  var `view-shown`: WindowEvent[application, typings.openfin.openfinStrings.`view-shown`]
  var `view-target-changed`: TargetChangedEvent[application, typings.openfin.openfinStrings.`view-target-changed`]
  var `window-alert-requested`: WindowAlertRequestedEvent[String, String]
  var `window-auth-requested`: WindowAuthRequestedEvent[String, String]
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, typings.openfin.openfinStrings.`window-begin-user-bounds-changing`]
  var `window-blurred`: WindowEvent[application, typings.openfin.openfinStrings.`window-blurred`]
  var `window-bounds-changed`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changed`]
  var `window-bounds-changing`: WindowBoundsChange[application, typings.openfin.openfinStrings.`window-bounds-changing`]
  var `window-closed`: WindowEvent[application, typings.openfin.openfinStrings.`window-closed`]
  var `window-closing`: WindowEvent[application, typings.openfin.openfinStrings.`window-closing`]
  var `window-crashed`: CrashedEvent with (WindowEvent[application, typings.openfin.openfinStrings.`window-crashed`])
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
  var `window-hotkey`: InputEvent with (WindowEvent[application, typings.openfin.openfinStrings.`window-hotkey`])
  var `window-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-initialized`]
  var `window-layout-initialized`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-initialized`]
  var `window-layout-ready`: WindowEvent[application, typings.openfin.openfinStrings.`window-layout-ready`]
  var `window-maximized`: WindowEvent[application, typings.openfin.openfinStrings.`window-maximized`]
  var `window-minimized`: WindowEvent[application, typings.openfin.openfinStrings.`window-minimized`]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typings.openfin.openfinStrings.`window-navigation-rejected`]
  var `window-not-responding`: WindowEvent[String, String]
  var `window-options-changed`: WindowOptionsChangedEvent[application, typings.openfin.openfinStrings.`window-options-changed`]
  var `window-performance-report`: (WindowPerformanceReport[application, typings.openfin.openfinStrings.`window-performance-report`]) with (WindowPerformanceReport[String, String])
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
    crashed: CrashedEvent with (ApplicationEvent[String, String]),
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
    `view-crashed`: CrashedEvent with (WindowEvent[application, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[application, `view-created`]),
    `view-destroyed`: WindowEvent[application, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[application, `view-did-change-theme-color`],
    `view-focused`: WindowEvent[application, `view-focused`],
    `view-hidden`: WindowEvent[application, `view-hidden`],
    `view-hotkey`: InputEvent with (WindowEvent[application, `view-hotkey`]),
    `view-navigation-rejected`: WindowNavigationRejectedEvent[application, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[application, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[application, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[application, `view-resource-response-received`],
    `view-shown`: WindowEvent[application, `view-shown`],
    `view-target-changed`: TargetChangedEvent[application, `view-target-changed`],
    `window-alert-requested`: WindowAlertRequestedEvent[String, String],
    `window-auth-requested`: WindowAuthRequestedEvent[String, String],
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[application, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
    `window-closed`: WindowEvent[application, `window-closed`],
    `window-closing`: WindowEvent[application, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[application, `window-crashed`]),
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
    `window-hotkey`: InputEvent with (WindowEvent[application, `window-hotkey`]),
    `window-initialized`: WindowEvent[application, `window-initialized`],
    `window-layout-initialized`: WindowEvent[application, `window-layout-initialized`],
    `window-layout-ready`: WindowEvent[application, `window-layout-ready`],
    `window-maximized`: WindowEvent[application, `window-maximized`],
    `window-minimized`: WindowEvent[application, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[application, `window-navigation-rejected`],
    `window-not-responding`: WindowEvent[String, String],
    `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
    `window-performance-report`: (WindowPerformanceReport[application, `window-performance-report`]) with (WindowPerformanceReport[String, String]),
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
}

