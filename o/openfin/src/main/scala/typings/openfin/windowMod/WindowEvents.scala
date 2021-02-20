package typings.openfin.windowMod

import org.scalablytyped.runtime.StringDictionary
import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`auth-requested`
import typings.openfin.openfinStrings.`begin-user-bounds-changing`
import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.`bounds-changing`
import typings.openfin.openfinStrings.`close-requested`
import typings.openfin.openfinStrings.`disabled-movement-bounds-changed`
import typings.openfin.openfinStrings.`disabled-movement-bounds-changing`
import typings.openfin.openfinStrings.`end-user-bounds-changing`
import typings.openfin.openfinStrings.`external-process-exited`
import typings.openfin.openfinStrings.`external-process-started`
import typings.openfin.openfinStrings.`group-changed`
import typings.openfin.openfinStrings.`layout-initialized`
import typings.openfin.openfinStrings.`layout-ready`
import typings.openfin.openfinStrings.`options-changed`
import typings.openfin.openfinStrings.`performance-report`
import typings.openfin.openfinStrings.`preload-scripts-state-changed`
import typings.openfin.openfinStrings.`preload-scripts-state-changing`
import typings.openfin.openfinStrings.`show-requested`
import typings.openfin.openfinStrings.`user-movement-disabled`
import typings.openfin.openfinStrings.`user-movement-enabled`
import typings.openfin.openfinStrings.`view-attached`
import typings.openfin.openfinStrings.`view-detached`
import typings.openfin.openfinStrings.`will-move`
import typings.openfin.openfinStrings.`will-resize`
import typings.openfin.openfinStrings.closed
import typings.openfin.openfinStrings.closing
import typings.openfin.openfinStrings.embedded
import typings.openfin.openfinStrings.hidden
import typings.openfin.openfinStrings.hotkey
import typings.openfin.openfinStrings.initialized
import typings.openfin.openfinStrings.maximized
import typings.openfin.openfinStrings.minimized
import typings.openfin.openfinStrings.reloaded
import typings.openfin.openfinStrings.restored
import typings.openfin.openfinStrings.shown
import typings.openfin.openfinStrings.window
import typings.openfin.viewMod.InputEvent
import typings.openfin.viewMod.PropagatedViewIdentity
import typings.openfin.viewMod.TargetChangedEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<'window', string> & {[ Type in keyof openfin.openfin/_v2/api/events/window.WindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.WindowEventMapping<'window', Type>[Type]} */
@js.native
trait WindowEvents
  extends /**
  * @hidden
  * Custom properties and metadata. This can be extended in specific context object.
  */
/* key */ StringDictionary[js.Any] {
  
  var `auth-requested`: WindowAuthRequestedEvent[window, typings.openfin.openfinStrings.`auth-requested`] = js.native
  
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, typings.openfin.openfinStrings.`begin-user-bounds-changing`] = js.native
  
  var blurred: WindowEvent[String, String] = js.native
  
  var `bounds-changed`: WindowBoundsChange[window, typings.openfin.openfinStrings.`bounds-changed`] = js.native
  
  var `bounds-changing`: WindowBoundsChange[window, typings.openfin.openfinStrings.`bounds-changing`] = js.native
  
  var `certificate-error`: CertificateErrorEvent[String, String] = js.native
  
  var `close-requested`: WindowEvent[window, typings.openfin.openfinStrings.`close-requested`] = js.native
  
  var closed: WindowEvent[window, typings.openfin.openfinStrings.closed] = js.native
  
  var closing: WindowEvent[window, typings.openfin.openfinStrings.closing] = js.native
  
  var crashed: CrashedEvent with (WindowEvent[String, String]) = js.native
  
  var `did-change-theme-color`: WindowEvent[String, String] = js.native
  
  var `disabled-movement-bounds-changed`: WindowBoundsChange[window, typings.openfin.openfinStrings.`disabled-movement-bounds-changed`] = js.native
  
  var `disabled-movement-bounds-changing`: WindowBoundsChange[window, typings.openfin.openfinStrings.`disabled-movement-bounds-changing`] = js.native
  
  var embedded: WindowEvent[window, typings.openfin.openfinStrings.embedded] = js.native
  
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, typings.openfin.openfinStrings.`end-user-bounds-changing`] = js.native
  
  var `external-process-exited`: WindowExternalProcessExitedEvent[window, typings.openfin.openfinStrings.`external-process-exited`] = js.native
  
  var `external-process-started`: WindowExternalProcessStartedEvent[window, typings.openfin.openfinStrings.`external-process-started`] = js.native
  
  var focused: WindowEvent[String, String] = js.native
  
  var `found-in-page`: WindowEvent[String, String] = js.native
  
  var `group-changed`: WindowGroupChanged[window, typings.openfin.openfinStrings.`group-changed`] = js.native
  
  var hidden: WindowHiddenEvent[window, typings.openfin.openfinStrings.hidden] = js.native
  
  var hotkey: InputEvent with (WindowEvent[window, typings.openfin.openfinStrings.hotkey]) = js.native
  
  var initialized: WindowEvent[window, typings.openfin.openfinStrings.initialized] = js.native
  
  var `layout-initialized`: WindowEvent[window, typings.openfin.openfinStrings.`layout-initialized`] = js.native
  
  var `layout-ready`: WindowEvent[window, typings.openfin.openfinStrings.`layout-ready`] = js.native
  
  var listenerRemoved: String = js.native
  
  var maximized: WindowEvent[window, typings.openfin.openfinStrings.maximized] = js.native
  
  var minimized: WindowEvent[window, typings.openfin.openfinStrings.minimized] = js.native
  
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String] = js.native
  
  var newListener: String = js.native
  
  var `options-changed`: WindowOptionsChangedEvent[window, typings.openfin.openfinStrings.`options-changed`] = js.native
  
  var `page-favicon-updated`: WindowEvent[String, String] = js.native
  
  var `page-title-updated`: PageTitleUpdatedEvent[String, String] = js.native
  
  var `performance-report`: WindowPerformanceReport[window, typings.openfin.openfinStrings.`performance-report`] = js.native
  
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, typings.openfin.openfinStrings.`preload-scripts-state-changed`] = js.native
  
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, typings.openfin.openfinStrings.`preload-scripts-state-changing`] = js.native
  
  var reloaded: WindowReloadedEvent[window, typings.openfin.openfinStrings.reloaded] = js.native
  
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String] = js.native
  
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String] = js.native
  
  var restored: WindowEvent[window, typings.openfin.openfinStrings.restored] = js.native
  
  var `show-requested`: WindowEvent[window, typings.openfin.openfinStrings.`show-requested`] = js.native
  
  var shown: WindowEvent[window, typings.openfin.openfinStrings.shown] = js.native
  
  var `user-movement-disabled`: WindowEvent[window, typings.openfin.openfinStrings.`user-movement-disabled`] = js.native
  
  var `user-movement-enabled`: WindowEvent[window, typings.openfin.openfinStrings.`user-movement-enabled`] = js.native
  
  var `view-attached`: WindowEvent[window, typings.openfin.openfinStrings.`view-attached`] = js.native
  
  var `view-blurred`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-crashed`: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-created`: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-destroyed`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-detached`: ViewDetached[window, typings.openfin.openfinStrings.`view-detached`] = js.native
  
  var `view-did-change-theme-color`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-focused`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-hidden`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-hotkey`: InputEvent with (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-navigation-rejected`: (WindowNavigationRejectedEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-page-favicon-updated`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-page-title-updated`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-shown`: (WindowEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `view-target-changed`: (TargetChangedEvent[window, String]) with PropagatedViewIdentity = js.native
  
  var `will-move`: WillMoveOrResize[window, typings.openfin.openfinStrings.`will-move`] = js.native
  
  var `will-resize`: WillMoveOrResize[window, typings.openfin.openfinStrings.`will-resize`] = js.native
}
object WindowEvents {
  
  @scala.inline
  def apply(
    `auth-requested`: WindowAuthRequestedEvent[window, `auth-requested`],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, `begin-user-bounds-changing`],
    blurred: WindowEvent[String, String],
    `bounds-changed`: WindowBoundsChange[window, `bounds-changed`],
    `bounds-changing`: WindowBoundsChange[window, `bounds-changing`],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[window, `close-requested`],
    closed: WindowEvent[window, closed],
    closing: WindowEvent[window, closing],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[window, `disabled-movement-bounds-changed`],
    `disabled-movement-bounds-changing`: WindowBoundsChange[window, `disabled-movement-bounds-changing`],
    embedded: WindowEvent[window, embedded],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, `end-user-bounds-changing`],
    `external-process-exited`: WindowExternalProcessExitedEvent[window, `external-process-exited`],
    `external-process-started`: WindowExternalProcessStartedEvent[window, `external-process-started`],
    focused: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[window, `group-changed`],
    hidden: WindowHiddenEvent[window, hidden],
    hotkey: InputEvent with (WindowEvent[window, hotkey]),
    initialized: WindowEvent[window, initialized],
    `layout-initialized`: WindowEvent[window, `layout-initialized`],
    `layout-ready`: WindowEvent[window, `layout-ready`],
    listenerRemoved: String,
    maximized: WindowEvent[window, maximized],
    minimized: WindowEvent[window, minimized],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[window, `options-changed`],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[window, `performance-report`],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changed`],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changing`],
    reloaded: WindowReloadedEvent[window, reloaded],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[window, restored],
    `show-requested`: WindowEvent[window, `show-requested`],
    shown: WindowEvent[window, shown],
    `user-movement-disabled`: WindowEvent[window, `user-movement-disabled`],
    `user-movement-enabled`: WindowEvent[window, `user-movement-enabled`],
    `view-attached`: WindowEvent[window, `view-attached`],
    `view-blurred`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-crashed`: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-created`: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-destroyed`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-detached`: ViewDetached[window, `view-detached`],
    `view-did-change-theme-color`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-focused`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-hidden`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-hotkey`: InputEvent with (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-navigation-rejected`: (WindowNavigationRejectedEvent[window, String]) with PropagatedViewIdentity,
    `view-page-favicon-updated`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-page-title-updated`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-resource-load-failed`: (WindowResourceLoadFailedEvent[window, String]) with PropagatedViewIdentity,
    `view-resource-response-received`: (WindowResourceResponseReceivedEvent[window, String]) with PropagatedViewIdentity,
    `view-shown`: (WindowEvent[window, String]) with PropagatedViewIdentity,
    `view-target-changed`: (TargetChangedEvent[window, String]) with PropagatedViewIdentity,
    `will-move`: WillMoveOrResize[window, `will-move`],
    `will-resize`: WillMoveOrResize[window, `will-resize`]
  ): WindowEvents = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hotkey = hotkey.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("auth-requested")(`auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-requested")(`close-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-exited")(`external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-started")(`external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-initialized")(`layout-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-ready")(`layout-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("options-changed")(`options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("performance-report")(`performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changed")(`preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changing")(`preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-requested")(`show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-attached")(`view-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-blurred")(`view-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEvents]
  }
  
  @scala.inline
  implicit class WindowEventsMutableBuilder[Self <: WindowEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAuth-requested`(value: WindowAuthRequestedEvent[window, `auth-requested`]): Self = StObject.set(x, "auth-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[window, `begin-user-bounds-changing`]): Self = StObject.set(x, "begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurred(value: WindowEvent[String, String]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBounds-changed`(value: WindowBoundsChange[window, `bounds-changed`]): Self = StObject.set(x, "bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBounds-changing`(value: WindowBoundsChange[window, `bounds-changing`]): Self = StObject.set(x, "bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCertificate-error`(value: CertificateErrorEvent[String, String]): Self = StObject.set(x, "certificate-error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClose-requested`(value: WindowEvent[window, `close-requested`]): Self = StObject.set(x, "close-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed(value: WindowEvent[window, closed]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosing(value: WindowEvent[window, closing]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashed(value: CrashedEvent with (WindowEvent[String, String])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDid-change-theme-color`(value: WindowEvent[String, String]): Self = StObject.set(x, "did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[window, `disabled-movement-bounds-changed`]): Self = StObject.set(x, "disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[window, `disabled-movement-bounds-changing`]): Self = StObject.set(x, "disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedded(value: WindowEvent[window, embedded]): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[window, `end-user-bounds-changing`]): Self = StObject.set(x, "end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-process-exited`(value: WindowExternalProcessExitedEvent[window, `external-process-exited`]): Self = StObject.set(x, "external-process-exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-process-started`(value: WindowExternalProcessStartedEvent[window, `external-process-started`]): Self = StObject.set(x, "external-process-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: WindowEvent[String, String]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFound-in-page`(value: WindowEvent[String, String]): Self = StObject.set(x, "found-in-page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGroup-changed`(value: WindowGroupChanged[window, `group-changed`]): Self = StObject.set(x, "group-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: WindowHiddenEvent[window, hidden]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkey(value: InputEvent with (WindowEvent[window, hotkey])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialized(value: WindowEvent[window, initialized]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLayout-initialized`(value: WindowEvent[window, `layout-initialized`]): Self = StObject.set(x, "layout-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLayout-ready`(value: WindowEvent[window, `layout-ready`]): Self = StObject.set(x, "layout-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximized(value: WindowEvent[window, maximized]): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimized(value: WindowEvent[window, minimized]): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[String, String]): Self = StObject.set(x, "navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOptions-changed`(value: WindowOptionsChangedEvent[window, `options-changed`]): Self = StObject.set(x, "options-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-favicon-updated`(value: WindowEvent[String, String]): Self = StObject.set(x, "page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-title-updated`(value: PageTitleUpdatedEvent[String, String]): Self = StObject.set(x, "page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPerformance-report`(value: WindowPerformanceReport[window, `performance-report`]): Self = StObject.set(x, "performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPreload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changed`]): Self = StObject.set(x, "preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPreload-scripts-state-changing`(value: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changing`]): Self = StObject.set(x, "preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloaded(value: WindowReloadedEvent[window, reloaded]): Self = StObject.set(x, "reloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[String, String]): Self = StObject.set(x, "resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[String, String]): Self = StObject.set(x, "resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestored(value: WindowEvent[window, restored]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShow-requested`(value: WindowEvent[window, `show-requested`]): Self = StObject.set(x, "show-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShown(value: WindowEvent[window, shown]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-movement-disabled`(value: WindowEvent[window, `user-movement-disabled`]): Self = StObject.set(x, "user-movement-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-movement-enabled`(value: WindowEvent[window, `user-movement-enabled`]): Self = StObject.set(x, "user-movement-enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-attached`(value: WindowEvent[window, `view-attached`]): Self = StObject.set(x, "view-attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-blurred`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-detached`(value: ViewDetached[window, `view-detached`]): Self = StObject.set(x, "view-detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-focused`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-navigation-rejected`(value: (WindowNavigationRejectedEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-load-failed`(value: (WindowResourceLoadFailedEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-response-received`(value: (WindowResourceResponseReceivedEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-shown`(value: (WindowEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[window, String]) with PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWill-move`(value: WillMoveOrResize[window, `will-move`]): Self = StObject.set(x, "will-move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWill-resize`(value: WillMoveOrResize[window, `will-resize`]): Self = StObject.set(x, "will-resize", value.asInstanceOf[js.Any])
  }
}
