package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`manifest-changed`
import typings.openfin.openfinStrings.`not-responding`
import typings.openfin.openfinStrings.`run-requested`
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
import typings.openfin.openfinStrings.responding
import typings.openfin.openfinStrings.started
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/application.ApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.ApplicationEventMapping<'application', Type>[Type]} */
@js.native
trait ApplicationEvents extends js.Object {
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
  implicit class ApplicationEventsOps[Self <: ApplicationEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClosed(value: ApplicationEvent[application, closed]): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnected(value: ApplicationEvent[application, connected]): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashed(value: CrashedEvent with (ApplicationEvent[application, crashed])): Self = this.set("crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialized(value: ApplicationEvent[application, initialized]): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def `setManifest-changed`(value: ApplicationEvent[application, `manifest-changed`]): Self = this.set("manifest-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def `setNot-responding`(value: ApplicationEvent[application, `not-responding`]): Self = this.set("not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponding(value: ApplicationEvent[application, responding]): Self = this.set("responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setRun-requested`(value: RunRequestedEvent[application, `run-requested`]): Self = this.set("run-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarted(value: ApplicationEvent[application, started]): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTray-icon-clicked`(value: TrayIconClicked[application, `tray-icon-clicked`]): Self = this.set("tray-icon-clicked", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-blurred`(value: (WindowEvent[application, `view-blurred`]) with PropagatedViewIdentity): Self = this.set("view-blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[application, `view-crashed`]) with PropagatedViewIdentity): Self = this.set("view-crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[application, `view-created`]) with PropagatedViewIdentity): Self = this.set("view-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[application, `view-destroyed`]) with PropagatedViewIdentity): Self = this.set("view-destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[application, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = this.set("view-did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-focused`(value: (WindowEvent[application, `view-focused`]) with PropagatedViewIdentity): Self = this.set("view-focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[application, `view-hidden`]) with PropagatedViewIdentity): Self = this.set("view-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[application, `view-hotkey`]) with PropagatedViewIdentity): Self = this.set("view-hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-navigation-rejected`(
      value: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) with PropagatedViewIdentity
    ): Self = this.set("view-navigation-rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[application, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[application, `view-page-title-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-resource-load-failed`(
      value: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-load-failed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-resource-response-received`(
      value: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-response-received", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-shown`(value: (WindowEvent[application, `view-shown`]) with PropagatedViewIdentity): Self = this.set("view-shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[application, `view-target-changed`]) with PropagatedViewIdentity): Self = this.set("view-target-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[application, `window-alert-requested`]): Self = this.set("window-alert-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[application, `window-auth-requested`]): Self = this.set("window-auth-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`]): Self = this.set("window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-blurred`(value: WindowEvent[application, `window-blurred`]): Self = this.set("window-blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-bounds-changed`(value: WindowBoundsChange[application, `window-bounds-changed`]): Self = this.set("window-bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-bounds-changing`(value: WindowBoundsChange[application, `window-bounds-changing`]): Self = this.set("window-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-closed`(value: WindowEvent[application, `window-closed`]): Self = this.set("window-closed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-closing`(value: WindowEvent[application, `window-closing`]): Self = this.set("window-closing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-crashed`(value: CrashedEvent with (WindowEvent[application, `window-crashed`])): Self = this.set("window-crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-created`(value: WindowEvent[application, `window-created`]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`]): Self = this.set("window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`]): Self = this.set("window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-embedded`(value: WindowEvent[application, `window-embedded`]): Self = this.set("window-embedded", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[application, `window-end-load`]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`]): Self = this.set("window-end-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[application, `window-external-process-exited`]): Self = this.set("window-external-process-exited", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[application, `window-external-process-started`]): Self = this.set("window-external-process-started", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-focused`(value: WindowEvent[application, `window-focused`]): Self = this.set("window-focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-group-changed`(value: WindowGroupChanged[application, `window-group-changed`]): Self = this.set("window-group-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-hidden`(value: WindowHiddenEvent[application, `window-hidden`]): Self = this.set("window-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-hotkey`(value: InputEvent with (WindowEvent[application, `window-hotkey`])): Self = this.set("window-hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-initialized`(value: WindowEvent[application, `window-initialized`]): Self = this.set("window-initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-layout-initialized`(value: WindowEvent[application, `window-layout-initialized`]): Self = this.set("window-layout-initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-layout-ready`(value: WindowEvent[application, `window-layout-ready`]): Self = this.set("window-layout-ready", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-maximized`(value: WindowEvent[application, `window-maximized`]): Self = this.set("window-maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-minimized`(value: WindowEvent[application, `window-minimized`]): Self = this.set("window-minimized", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[application, `window-navigation-rejected`]): Self = this.set("window-navigation-rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[application, `window-not-responding`]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-options-changed`(value: WindowOptionsChangedEvent[application, `window-options-changed`]): Self = this.set("window-options-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[application, `window-performance-report`]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`]): Self = this.set("window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`]): Self = this.set("window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-reloaded`(value: WindowReloadedEvent[application, `window-reloaded`]): Self = this.set("window-reloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`]): Self = this.set("window-resource-load-failed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`]): Self = this.set("window-resource-response-received", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[application, `window-responding`]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-restored`(value: WindowEvent[application, `window-restored`]): Self = this.set("window-restored", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-show-requested`(value: WindowEvent[application, `window-show-requested`]): Self = this.set("window-show-requested", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-shown`(value: WindowEvent[application, `window-shown`]): Self = this.set("window-shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[application, `window-start-load`]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-user-movement-disabled`(value: WindowEvent[application, `window-user-movement-disabled`]): Self = this.set("window-user-movement-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-user-movement-enabled`(value: WindowEvent[application, `window-user-movement-enabled`]): Self = this.set("window-user-movement-enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-will-move`(value: WillMoveOrResize[application, `window-will-move`]): Self = this.set("window-will-move", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWindow-will-resize`(value: WillMoveOrResize[application, `window-will-resize`]): Self = this.set("window-will-resize", value.asInstanceOf[js.Any])
  }
  
}

